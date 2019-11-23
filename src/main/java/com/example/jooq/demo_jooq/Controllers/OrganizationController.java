package com.example.jooq.demo_jooq.Controllers;

import com.example.jooq.demo_jooq.Entities.EmployeeCountEntity;
import com.example.jooq.demo_jooq.Entities.EmployeeEntity;
import com.example.jooq.demo_jooq.Entities.OrganizationEntity;
import com.example.jooq.demo_jooq.Services.OrganizationService;
import lombok.AllArgsConstructor;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/organization", produces = "application/json; charset=UTF-8")
@AllArgsConstructor
public class OrganizationController {

    OrganizationService service;

    @GetMapping(path = "/{id}")
    public OrganizationEntity getOrganization(@PathVariable Integer id) {
        return service.getOrganization(id);
    }

    @GetMapping(path = "/list")
    public List<OrganizationEntity> organiztionList() {
        return service.organizationList();
    }

    @PostMapping(path = "/new")
    @Transactional
    public OrganizationEntity createOrganization(@RequestBody OrganizationEntity organization) {
        return service.createOrganization(organization);
    }

    @PutMapping(path = "/update/{id}")
    @Transactional
    public OrganizationEntity updateOrganization(@PathVariable Integer id, @RequestBody OrganizationEntity organization) {
        return service.updateOrganization(id, organization);
    }

    @PutMapping(path = "/delete")
    @Transactional
    public Boolean deleteOrganization(@RequestBody List<Integer> ids) {
        return service.deleteOrganization(ids);
    }

    @GetMapping(path = "/listCount")
    public List<EmployeeCountEntity> getEmployeeCount() {
        return service.getEmployeeCount();
    }

    @GetMapping(path = "{id}/organizationSupervisor")
    public EmployeeEntity getSupervisorByOrganization(@PathVariable Integer id)
    {
        return service.getSupervisorByOrganization(id);
    }

    @GetMapping(path = "{id}/parentOrganization")
    public OrganizationEntity getParentOrganization(@PathVariable Integer id) {
        return service.getParentOrganization(id);
    }

}
