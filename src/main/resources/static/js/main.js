var app = angular.module('app', ['ngRoute']);

app.config(function ($routeProvider, $locationProvider) {
    $routeProvider
        .when('/', {
            templateUrl: '/home.html'
        })
        .when('/employees/tree', {
            templateUrl: 'employees/tree.html',
            controller: 'employeeController'
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
        .when ('/organizations/tree', {
            templateUrl: 'organizations/tree.html',
            controller: 'organizationController'
        })
        .when('/organizations/list', {
            templateUrl: 'organizations/list.html',
            controller: 'organizationController'
        })
        .when('/organizations/new', {
            templateUrl: 'organizations/add.html',
            controller: 'organizationController'
        })
        .when('/organizations/:id/edit', {
            templateUrl: 'organizations/edit.html',
            controller: 'organizationController'
        })
        .otherwise({
            template: 'Ahw, shit! Here we go again'
        });
    $locationProvider.hashPrefix('');
});

app.controller('employeeController', function ($http, $scope, $route, $routeParams) {
    $scope.params = $routeParams;
    $scope.selectedEmployees = [];

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
            })
    };

    $scope.getEmployeeById = function () {
        var va;
        $http.get('http://localhost:8080/employee/' + $scope.params.id)
            .then(function (result) {
                console.log('success get employee by id', result.data);
                $scope.employee = result.data;

                va = $scope.setOrganizationsOnForm(result.data.organizationId);
                console.log(va);
                va = $scope.setSupervisorOnForm(result.data.organizationId, result.data.supervisorId, result.data.id);
                console.log(va);
            })
            .catch(function (result) {
                console.log('fail get employee by id', $scope.params.id);
            })
    };

    $scope.addEmployee = function (employee) {
        var supervisorId;
        var supervisorSelect = document.getElementsByName('supervisorSelect')[0];
        /*var supervisorId = supervisorSelect.options[supervisorSelect.selectedIndex].value;
        if (supervisorId === 'Choose supervisor') {
            supervisorId = null;
        }*/
        if (supervisorSelect.options[supervisorSelect.selectedIndex].value !== 'Choose supervisor') {
            supervisorId = supervisorSelect.options[supervisorSelect.selectedIndex].value;
        }
        $scope.employee.supervisorId = supervisorId;
        $http.post('http://localhost:8080/employee/new', employee)
            .then(function (result) {
                console.log('succes create employee', employee);
                $scope.employee=null;
                location.href='#/employees/list';
            })
            .catch(function (result) {
                console.log('error create employee');
            })
    };

    $scope.editEmployee = function (employee) {
        var organizationSelect = document.getElementsByName('organizationSelect')[0];
        var organizationId = organizationSelect.options[organizationSelect.selectedIndex].value;
        $scope.employee.organizationId = organizationId;
        var supervisorSelect = document.getElementsByName('supervisorSelect')[0];
        //var supervisorId = supervisorSelect.options[supervisorSelect.selectedIndex].value;
        var supervisorId;
        if (supervisorSelect.options[supervisorSelect.selectedIndex].value !== 'Choose supervisor') {
            supervisorId = supervisorSelect.options[supervisorSelect.selectedIndex].value;
        }
        $scope.employee.supervisorId = supervisorId;
        $http.put('http://localhost:8080/employee/update/'+employee.id, employee)
            .then(function (result) {
                console.log('succes update employee', employee);
                location.href='#/employees/list';
            })
            .catch(function (result) {
                console.log('error update employee', employee);
            })
    };

    $scope.clearInputs = function () {
        $scope.employee = null;
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
            })
    };

    /*ДОПИЛ НА ЕСЛИ НЕТ ЕЩЕ СУПЕРВИЗОРОВ*/
    $scope.getOrganizationId = function() {
        var sel = document.getElementsByName("organizationSelect")[0];
        var idx = sel.selectedIndex;
        var ids = sel.options[idx].value;
        if (ids > 0) {
            $http.get('http://localhost:8080/organization/'+ids+'/organizationSupervisor')
                .then(function (result) {
                    $scope.supervisors = result.data;
                    console.log('success get supervisor by organization', result.data);
                    var supervisorSelect = document.getElementsByName('supervisorSelect')[0];
                    var len = supervisorSelect.length;
                    for (var i = len-1; i >= 0; i--) {
                        supervisorSelect.remove(i);
                    }
                    /*вынести*/
                    var opt = document.createElement('option');
                    opt.innerHTML = 'Choose supervisor';
                    supervisorSelect.appendChild(opt);
                    if ($scope.supervisors.length > 0) {
                        for (var i = 0; i < $scope.supervisors.length; i++) {
                            /*Добавил иф*/
                            if ($scope.supervisors[i].id !== $scope.employee.id) {
                                opt = document.createElement('option');
                                opt.value = $scope.supervisors[i].id;
                                opt.innerHTML = $scope.supervisors[i].surname;
                                supervisorSelect.appendChild(opt);
                            }
                        }
                    }

                    if (supervisorSelect.length > 1) {
                        supervisorSelect.disabled = false;
                    }
                    else {
                        supervisorSelect.disabled = true;
                    }
                })
                .catch(function (result) {
                    console.log('error get supervisor by organization');
                })
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

    $scope.setSupervisorOnForm = function (organizationId, supervisorId, employeeId) {
        var supervisorSelect = document.getElementsByName('supervisorSelect')[0];
        supervisorSelect.remove(0);
        $http.get('http://localhost:8080/organization/'+organizationId+'/organizationSupervisor')
            .then(function (result) {
                $scope.supervisors = result.data;
                console.log('get org on edit and selected');
                /*вынести*/
                var opt = document.createElement('option');
                opt.innerHTML = 'Choose supervisor';
                supervisorSelect.appendChild(opt);
                if ($scope.supervisors.length > 0) {
                    for (var i = 0; i < $scope.supervisors.length; i++) {
                        /*Добавил ИФ*/
                        if ($scope.supervisors[i].id !== $scope.employee.id) {
                            var opt = document.createElement('option');
                            opt.value = $scope.supervisors[i].id;
                            opt.innerHTML = $scope.supervisors[i].surname;
                            supervisorSelect.appendChild(opt);
                        }
                    }
                }

                if (supervisorSelect.length > 1) {
                    supervisorSelect.disabled = false;
                }

                for (var i = 0; i < supervisorSelect.length; i++) {
                    if (parseInt(supervisorSelect.options[i].value) === parseInt(supervisorId)) {
                        supervisorSelect.disabled = false;
                        supervisorSelect.options[i].selected = true;
                        supervisorSelect.selectedIndex = i;
                        return true;
                    }
                }

            })
    };

    $scope.employeeEditInit = function () {
        $scope.getOrganizations();
        $scope.getEmployeeById();
    };

    $scope.deleteEmployee = function (id) {
        var list = [];
        list.push(id);
        $http.put('http://localhost:8080/employee/delete', list)
            .then(function (result) {
                console.log('success delete', id);
                location.reload();
            })
    };

    $scope.selectEmployee = function (id) {
        /*if (check.checked == true)
        {
            $scope.selectedEmployees.push(id);
        }
        else
        {
            $scope.selectedEmployees.pop(id);
        }
        console.log($scope.selectedEmployees);*/
        console.log($scope.selectedEmployees);

    };

    $scope.deleteSelectedEmployees = function () {
        var list = [];
        for (var i = 0; i < $scope.selectedEmployees.length; i++) {
            console.log($scope.selectedEmployees[i]);
            if ($scope.selectedEmployees[i] === true) {
                list.push(i);
            }
        }
        console.log(list);
        $http.put('http://localhost:8080/employee/delete', list);
        location.reload();
    };

    /**/
    $scope.createTree = function () {
        $http.get('http://localhost:8080/employee/getTree')
            .then(function (result) {
                $scope.data = result.data;
                var container = document.getElementsByName("tree")[0];
                container.innerHTML = $scope.createTreeDom($scope.data);
            })
            .catch(function (result) {
                console.log('fail');
            })
    };

    $scope.createTreeDom = function (obj) {
        /*
        * создать
        * */
    };

    /*корень*/
    $scope.createRoot = function () {
        $http.get('http://localhost:8080/employee/getRoot')
            .then(function (result) {
                $scope.root = result.data;
                var container = document.getElementsByName("tree")[0];
                var ul = document.createElement('ul');
                for (var i = 0; i < $scope.root.length; i ++)
                {
                    var li = document.createElement('li');
                    li.innerHTML = $scope.root[i].surname;
                    li.value = $scope.root[i].id;
                    li.addEventListener('click', $scope.createBranch(li, li.value), false);
                    ul.append(li);
                }
                container.append(ul);
            })
            .catch(function (result) {
                console.log('fail');
            })
    };

    /*ветки*/
    $scope.createBranch = function (elem, id) {
        var branch;
        $http.get('http://localhost:8080/employee/'+id+'/getBranch')
            .then(function (result) {
                branch = result.data;
                if (!branch.length) return;

                var ul = document.createElement('ul');
                for (var i = 0; i < branch.length; i++) {
                    var li = document.createElement('li');
                    li.innerHTML = branch[i].surname;
                    li.value = branch[i].id;
                    li.addEventListener('click', $scope.createBranch(li, li.value), false);
                    ul.append(li);
                }
                elem.append(ul);

            })
            .catch(function (result) {
                console.log('fail');
            })
    }
});

app.controller('organizationController', function ($http, $scope, $route, $routeParams) {
    $scope.params = $routeParams;
    $scope.selectedOrganization = [];

    $scope.getOrganizations = function () {
        $http.get('http://localhost:8080/organization/getOrganizationParent') //получил список объектов
            .then(function (result) {
                $scope.organizations = null;
                console.log('success get organizations list', result);
                $scope.organizations = result.data;
                console.log('success params', $scope.params);
            })
            .catch(function (result) {
                console.log('error get organizations list');
            })
    };

    $scope.getOrganizationById = function () {
        var va;
        $http.get('http://localhost:8080/organization/' + $scope.params.id)
            .then(function (result) {
                console.log('success get organization by id', result.data);
                $scope.organization = result.data;

                $scope.setParentOrganizationsOnForm(result.data.parentOrganizationId, result.data.id);
                /*va = $scope.setSupervisorOnForm(result.data.organizationId, result.data.supervisorId, result.data.id);
                console.log(va);*/
            })
            .catch(function (result) {
                console.log('fail get organization by id', $scope.params.id);
            })
    };

    $scope.addOrganization = function (organization) {
        var parentOrganization;
        var organizationSelect = document.getElementsByName('organizationSelect')[0];
        if (organizationSelect.options[organizationSelect.selectedIndex].value !== 'Choose supervisor') {
            parentOrganization = organizationSelect.options[organizationSelect.selectedIndex].value;
        }
        $scope.organization.parentOrganizationId = parentOrganization;
        $http.post('http://localhost:8080/organization/new', organization)
            .then(function (result) {
                console.log('succes create organization', organization);
                $scope.organization=null;
                location.href='#/organizations/list';
            })
            .catch(function (result) {
                console.log('error create organization');
            })
    };

    $scope.editOrganization = function (organization) {
        var organizationSelect = document.getElementsByName('organizationSelect')[0];
        var parentOrganizationId;
        if (organizationSelect.options[organizationSelect.selectedIndex].value !== 'Choose parent organization') {
            parentOrganizationId = organizationSelect.options[organizationSelect.selectedIndex].value;
        }
        if (parentOrganizationId) {
            organization.parentOrganizationId = parseInt(parentOrganizationId);
        }

        $http.put('http://localhost:8080/organization/update/'+organization.id, organization)
            .then(function (result) {
                console.log('succes update organization', organization);
                location.href='#/organizations/list';
            })
            .catch(function (result) {
                console.log('error update organization', organization);
            })
    };

    $scope.clearInputs = function () {
        $scope.organization = null;
        console.log('inputs cleared', $scope.organization);
    };

    $scope.deleteOrganization = function (id) {
        var list = [];
        list.push(id);
        $http.put('http://localhost:8080/organization/delete', list)
            .then(function (result) {
                console.log('success delete', id);
                location.reload();
            })
    };

    $scope.deleteSelectedOrganizations = function () {
        var list = [];
        for (var i = 0; i < $scope.selectedOrganization.length; i++) {
            console.log($scope.selectedOrganization[i]);
            if ($scope.selectedOrganization[i] === true) {
                list.push(i);
            }
        }
        console.log(list);
        $http.put('http://localhost:8080/organization/delete', list);
        location.reload();
    };

    $scope.organizationEditInit = function () {
        $scope.getOrganizations();
        $scope.getOrganizationById();
    };

    /*Хотел не заполнять в парентОрг суборги, чтобы не было корректнее по дереву*/
    $scope.setParentOrganizationsOnForm1 = function (parentId, id) {
        var organizationSelect = document.getElementsByName('organizationSelect')[0];
        var resultOrganizationList = [];
        /*Все орги*/
        var allOrganizations = $scope.getAllOrganizations(); //undefined ?
        /*Суборги*/
        var suborganizations = $scope.getSuborganization(id);  //undefined ?

        console.log('allOrg', allOrganizations);
        console.log('suborg', suborganizations);

        /*Удаляем ЧУЗ.. если не пустой парент*/
        if (parentId !== null) {
            organizationSelect.remove(0);
        }

        /*Получаем список орг за исключением дочерних для текущей*/
        resultOrganizationList = setResultOrganizationList(allOrganizations, suborganizations);

        /*Заполняем комбик*/
        if (resultOrganizationList.length > 0) {
            for (var i = 0; i < resultOrganizationList.length; i++) {
                if (resultOrganizationList[i].id !== id) {
                    var opt = document.createElement('option');
                    opt.value = resultOrganizationList[i].id;
                    opt.innerHTML = resultOrganizationList[i].organizationName;
                    organizationSelect.append(opt);
                }
            }
        }

        /*разлочим если есть значения*/
        if (organizationSelect.length > 1) {
            organizationSelect.disabled = false;
        }

        /*устанавливаем выбранным*/
        for (var i = 0; i < organizationSelect.length; i++) {
            if (parseInt(organizationSelect.options[i].value) === parseInt(parentId)) {
                organizationSelect.disabled = false;
                organizationSelect.options[i].selected = true;
                organizationSelect.selectedIndex = i;
                return true;
            }
        }
    };

    $scope.setParentOrganizationsOnForm = function (parentId, id) {
        var organizationSelect = document.getElementsByName('organizationSelect')[0];
        var resultOrganizationList = [];
        var suborganizations;
        if (parentId !== null) {
            organizationSelect.remove(0);
        }
        suborganizations = $scope.getSuborganization(id);

        /*список орг*/
        $http.get('http://localhost:8080/organization/list')
            .then(function (result) {
                $scope.parentOrganizations = result.data;

                /*добавляем в селект все за исключением текущей*/
                if ($scope.parentOrganizations.length > 0) {
                    for (var i = 0; i < $scope.parentOrganizations.length; i++) {
                        if ($scope.parentOrganizations[i].id !== id) {
                            var opt = document.createElement('option');
                            opt.value = $scope.parentOrganizations[i].id;
                            opt.innerHTML = $scope.parentOrganizations[i].organizationName;
                            organizationSelect.append(opt);
                        }
                    }
                }

                /*разлочим если есть элементы в селекте*/
                if (organizationSelect.length > 1) {
                    organizationSelect.disabled = false;
                }

                /*устанавливаем выбранным*/
                for (var i = 0; i < organizationSelect.length; i++) {
                    if (parseInt(organizationSelect.options[i].value) === parseInt(parentId)) {
                        organizationSelect.disabled = false;
                        organizationSelect.options[i].selected = true;
                        organizationSelect.selectedIndex = i;
                        return true;
                    }
                }
            })
            .catch(function (result) {
                console.log('error set organizations');
            })
    };

    $scope.getSuborganization = function (id) {
        $http.get('http://localhost:8080/organization/'+id+'/getTree')
            .then(function (result) {
                $scope.suborganizations = result.data;
                console.log('get suborgs', result.data);
                return $scope.suborganizations;
            })
            .catch(function (result) {
                console.log('error get suborganizations');

            })
    };

    $scope.getAllOrganizations = function () {
        $http.get('http://localhost:8080/organization/list')
            .then(function (result) {
                $scope.parentOrganizations = result.data;
                return result.data;
            })
            .catch(function (result) {
                console.log('error get all org');
            })
    };

    $scope.setResultOrganizationList = function (allOrganizations, suborganizations) {
        var ok = true;
        var resultOrganizationList = [];
        for (var i = 0; i < allOrganizations.length; i++) {
            for (var j = 0; j < suborganizations.length; j++) {
                if (parseInt(allOrganizations[i].id) === parseInt(suborganizations[j].id)) {
                    ok = false;
                    break;
                }
            }
            if(ok) {
                resultOrganizationList.push(allOrganizations[i]);
            }
            ok = false;
        }
        return resultOrganizationList;
    };


    /*корень*/
    $scope.createRoot = function () {
        $http.get('http://localhost:8080/organization/getRoot')
            .then(function (result) {
                $scope.root = result.data;
                var container = document.getElementsByName("tree")[0];
                var ul = document.createElement('ul');
                for (var i = 0; i < $scope.root.length; i ++)
                {
                    var li = document.createElement('li');
                    li.innerHTML = $scope.root[i].organizationName;
                    li.value = $scope.root[i].id;
                    li.addEventListener('click', $scope.createBranch(li, li.value), false);
                    ul.append(li);
                }
                container.append(ul);
            })
            .catch(function (result) {
                console.log('fail');
            })
    };

    /*ветки*/
    $scope.createBranch = function (elem, id) {
        var branch;
        $http.get('http://localhost:8080/organization/'+id+'/getBranch')
            .then(function (result) {
                branch = result.data;
                if (!branch.length) return;

                var ul = document.createElement('ul');
                for (var i = 0; i < branch.length; i++) {
                    var li = document.createElement('li');
                    li.innerHTML = branch[i].organizationName;
                    li.value = branch[i].id;
                    li.addEventListener('click', $scope.createBranch(li, li.value), false);
                    ul.append(li);
                }
                elem.append(ul);

            })
            .catch(function (result) {
                console.log('fail');
            })
    }
});