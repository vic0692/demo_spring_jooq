var app = angular.module('app', []);

app.controller('employeeController', function ($http, $scope) {
    $http.get('http://localhost:8080/employee/listSup') //получил список объектов
        .then(function (result) {
            console.log('success', result);
            $scope.employees = result.data;
        })
        .catch(function (result) {
            console.log('error');
        });

    $scope.addEmployee = function (employee) {
        $http.post('http://localhost:8080/employee/new', employee)
            .then(function (result) {
                console.log('succes post', employee);
                $scope.employee=null;
                location.reload();
            })
            .catch(function (result) {
                console.log('error post');
            });
    };

    $scope.getEmployee = function (employee) {
        $http.get('http://localhost:8080/employee/' + employee.id)
            .then(function (result) {
                console.log('succes get employee', result.data);
                $scope.employee = result.data;
            })
            .catch(function (result) {
                console.log('fail get employee');
            })
    };

    $scope.clearInputs = function () {
        $scope.employee = null;
        console.log('cleared', $scope.employee);
    }
});