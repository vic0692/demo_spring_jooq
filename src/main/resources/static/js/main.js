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
                console.log('success', result);
                $scope.employees = result.data;
                console.log('success params', $scope.params);
            })
            .catch(function (result) {
                console.log('error');
            });
    };

    $scope.getEmployee = function (employee) {
        $http.get('http://localhost:8080/employee/' + employee.id)
            .then(function (result) {
                console.log('succes get employee', result.data);
                $scope.employee = result.data;
                $scope.employeeId = result.data.id;
            })
            .catch(function (result) {
                console.log('fail get employee');
            })
    };

    $scope.getEmployeeById = function (employeeId) {
        $http.get('http://localhost:8080/employee/' + $scope.params.id)
            .then(function (result) {
                console.log('succes get employee', result.data);
                $scope.employee = result.data;
                $scope.employeeId = result.data.id;
            })
            .catch(function (result) {
                console.log('fail get employee by id', employeeId);
            })
    };

    $scope.addEmployee = function (employee) {
        employee.organizationId = $scope.employee.organizationId.id;
        $http.post('http://localhost:8080/employee/new', employee)
            .then(function (result) {
                console.log('succes post', employee);
                $scope.employee=null;
                location.href='#/employees/list';
            })
            .catch(function (result) {
                console.log('error post');
            });
    };

    $scope.editEmployee = function (employee) {
        $http.put('http://localhost:8080/employee/update/'+employee.id, employee)
            .then(function (result) {
                console.log('succes update', employee);
                location.href='#/employees/list';
            })
            .catch(function (result) {
                console.log('error put', employee);
            });
    };

    $scope.clearInputs = function () {
        $scope.employee = null;
        $scope.employeeId = null;
        console.log('cleared', $scope.employee);
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
                console.log('success get organizations', result.data);
            })
            .catch(function (result) {
                console.log('error get organizations');
            });
    };

    $scope.getOrganizationId = function(id) {
        console.log('id: ', id);
    };
});