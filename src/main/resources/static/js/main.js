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
                $scope.employeeId = null;
                console.log('success get employee list', result);
                $scope.employees = result.data;
                console.log('success params', $scope.params);
            })
            .catch(function (result) {
                console.log('error get employee list');
            });
    };

    $scope.getEmployee = function (employee) {
        $http.get('http://localhost:8080/employee/' + employee.id)
            .then(function (result) {
                console.log('success get employee', result.data);
                $scope.employee = result.data;
                $scope.employeeId = result.data.id;
            })
            .catch(function (result) {
                console.log('error get employee');
            })
    };

    $scope.getEmployeeById = function (employeeId) {
        $http.get('http://localhost:8080/employee/' + $scope.params.id)
            .then(function (result) {
                console.log('success get employee by id', result.data);
                $scope.employee = result.data;
                $scope.employeeId = result.data.id;
            })
            .catch(function (result) {
                console.log('fail get employee by id', employeeId);
            })
    };

    $scope.addEmployee = function (employee) {
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

    $scope.showLocation = function() {
        console.log(location);
        console.log($scope);
    };

    $scope.getOrganizations = function() {
        $http.get('http://localhost:8080/organization/list')
            .then(function (result) {
                console.log('success get organizations');
                $scope.organizations = result.data;
                console.log('success get organizations', $scope.organizations);
            })
            .catch(function (result) {
                console.log('error get organizations');
            });
    };

    $scope.getOrganizationId = function(id) {
        if (id > 0) {
            $http.get('http://localhost:8080/organization/'+id+'/organizationSupervisor')
                .then(function (result) {
                    $scope.supervisors = result.data;
                    console.log('success get supervisor by organization', result.data);
                    var supervisorSel = document.getElementsByName('supervisorSelect')[0];
                    //console.log(supervisorSel);
                    for (var i = 1; i < supervisorSel.length; i++) {
                        supervisorSel.remove(i);
                    }
                    if ($scope.supervisors.length) {
                        for (var i = 0; i < $scope.supervisors.length; i++) {
                            var opt = document.createElement('option');
                            opt.value = $scope.supervisors[i].id;
                            opt.innerHTML = $scope.supervisors[i].surname;
                            supervisorSel.appendChild(opt);
                        }
                    }
                    else {
                        var opt = document.createElement('option');
                        opt.value = $scope.supervisors.id;
                        opt.innerHTML = $scope.supervisors.surname;
                        supervisorSel.appendChild(opt);
                    }

                    supervisorSel.disabled = false;
                    console.log(document.getElementsByName('orgSel')[0]);
                    console.log(supervisorSel);
                })
                .catch(function (result) {
                    console.log('error get supervisor by organization');
                });
        }
    };

    $scope.setSupervisorId = function (id) {
        //$scope.employee.id = id;
        console.log(id);
    };
});