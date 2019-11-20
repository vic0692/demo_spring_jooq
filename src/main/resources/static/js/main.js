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
});