var app = angular.module('app', ['ngRoute']);

app.config(function ($routeProvider, $locationProvider) {
    $routeProvider
        .when('/', {
            templateUrl: '/home.html'
        })
        .when('/employees/list', {
            templateUrl: '/employees/list.html',
            controller: 'employeeController'
        })
        .when('/employees/new', {
            templateUrl: 'employees/add.html',
            controller: 'employeeController'
        })
        .when('/employees/:id/edit', {
            templateUrl: 'employees/edit.html',
            controller: 'employeeController'
        })
        .otherwise({
            templateUrl: '/'
        });
    $locationProvider.hashPrefix('');
});

app.controller('employeeController', function ($http, $scope, $route, $routeParams) {
    $scope.params = $routeParams;

    $scope.getEmployees = function () {
        $http.get('http://localhost:8080/employee/listSup') //получил список объектов
            .then(function (result) {
                $scope.employee = null;
                console.log('success get employee list', result);
                $scope.employees = result.data;
                console.log('success params', $scope.params);
            })
            .catch(function (result) {
                console.log('error get employee list');
            });
    };

    $scope.getEmployeeById = function () {
        var va;
        $http.get('http://localhost:8080/employee/' + $scope.params.id)
            .then(function (result) {
                console.log('success get employee by id', result.data);
                $scope.employee = result.data;

                va = $scope.setOrganizationsOnForm(result.data.organizationId);
                console.log(va);
            })
            .catch(function (result) {
                console.log('fail get employee by id', employeeId);
            })
    };

    $scope.addEmployee = function (employee) {
        var supervisorSelect = document.getElementsByName('supervisorSelect')[0];
        var supervisorId = supervisorSelect.options[supervisorSelect.selectedIndex].value;
        $scope.employee.supervisorId = supervisorId;
        $http.post('http://localhost:8080/employee/new', employee)
            .then(function (result) {
                console.log('succes create employee', employee);
                $scope.employee=null;
                location.href='#/employees/list';
            })
            .catch(function (result) {
                console.log('error create employee');
            });
    };

    $scope.editEmployee = function (employee) {
        $http.put('http://localhost:8080/employee/update/'+employee.id, employee)
            .then(function (result) {
                console.log('succes update employee', employee);
                location.href='#/employees/list';
            })
            .catch(function (result) {
                console.log('error update employee', employee);
            });
    };

    $scope.clearInputs = function () {
        $scope.employee = null;
        $scope.employeeId = null;
        console.log('inputs cleared', $scope.employee);
    };

    $scope.getOrganizations = function() {
        $http.get('http://localhost:8080/organization/list')
            .then(function (result) {
                $scope.organizations = result.data;
                console.log('success get organizations', $scope.organizations);
            })
            .catch(function (result) {
                console.log('error get organizations');
            });
    };

    $scope.getOrganizationId = function(id) {
        var sel = document.getElementsByName("organizationSelect")[0];
        var idx = sel.selectedIndex;
        var ids = sel.options[idx].value;
        if (ids > 0) {
            $http.get('http://localhost:8080/organization/'+ids+'/organizationSupervisor')
                .then(function (result) {
                    $scope.supervisors = result.data;
                    console.log('success get supervisor by organization', result.data);
                    var supervisorSelect = document.getElementsByName('supervisorSelect')[0];
                    //console.log(supervisorSel);
                    for (var i = 1; i < supervisorSelect.length; i++) {
                        supervisorSelect.remove(i);
                    }
                    if ($scope.supervisors.length) {
                        for (var i = 0; i < $scope.supervisors.length; i++) {
                            var opt = document.createElement('option');
                            opt.value = $scope.supervisors[i].id;
                            opt.innerHTML = $scope.supervisors[i].surname;
                            supervisorSelect.appendChild(opt);
                        }
                    }
                    else {
                        var opt = document.createElement('option');
                        opt.value = $scope.supervisors.id;
                        opt.innerHTML = $scope.supervisors.surname;
                        supervisorSelect.appendChild(opt);
                    }

                    supervisorSelect.disabled = false;
                })
                .catch(function (result) {
                    console.log('error get supervisor by organization');
                });
        }
    };

    $scope.setOrganizationsOnForm = function (id) {
        var organizationSelect = document.getElementsByName('organizationSelect')[0];
        var len = organizationSelect.options.length;
        for (var i = 0; i < len; i++) {
            if (parseInt(organizationSelect.options[i].value) === parseInt(id)) {
                console.log(organizationSelect.options[i].value, id);
                organizationSelect.options[i].selected = true;
                organizationSelect.selectedIndex = i;
                console.log(organizationSelect);
                return true;
            }
        }
    };

    $scope.employeeEditInit = function () {
        $scope.getOrganizations();
        $scope.getEmployeeById();
    };
});