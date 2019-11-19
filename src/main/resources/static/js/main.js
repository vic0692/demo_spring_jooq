var app = angular.module('app', []);

/* для фабрики добавить factory в function */
app.controller('organizationController', function ($scope, factory) {
    $scope.organization = 'Orga';
    console.log('organizationController');
    $scope.factory = factory;
    //$scope.hello = 'Hello World';

    $scope.getOrganization = function () {
        return "My organization";
    };

    $scope.setOrganization = function (text) {
        $scope.organization = text;
    };
});

app.controller('employeeController', function ($scope) {
    $scope.employee = 'Empl';
    console.log('employeeController');
    //$scope.factory = factory;
    //$scope.hello = 'Hello World';
});

app.factory('factory', function () {
    return {
        organization: function () {
            return 'hello world';
        }
    };
});