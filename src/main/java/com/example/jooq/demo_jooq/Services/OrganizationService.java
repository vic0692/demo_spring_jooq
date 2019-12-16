package com.example.jooq.demo_jooq.Services;

import com.example.jooq.demo_jooq.Entities.EmployeeCountEntity;
import com.example.jooq.demo_jooq.Entities.EmployeeEntity;
import com.example.jooq.demo_jooq.Entities.OrganizationEntity;
import com.example.jooq.demo_jooq.Entities.OrganizationRecursiveEntity;
import com.example.jooq.demo_jooq.Repository.OrganizationRepository;
import com.example.jooq.demo_jooq.introduction.db.tables.Organization;
import lombok.AllArgsConstructor;
import org.jooq.DSLContext;
import org.springframework.data.relational.core.sql.In;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@AllArgsConstructor
public class OrganizationService {
    OrganizationRepository repository;

    public OrganizationEntity getOrganization(Integer id) {
        return repository.getOrganization(id);
    }

    public List<OrganizationEntity> organizationList() {
        return repository.organizationList();
    }

    public OrganizationEntity createOrganization(OrganizationEntity organization) {
        Integer id = repository.createOrganization(organization);
        return getOrganization(id);
    }

    public OrganizationEntity updateOrganization(Integer id, OrganizationEntity organization) {
        Integer idOrganization = repository.updateOrganization(id, organization);
        return getOrganization(idOrganization);
    }

    public Boolean deleteOrganization(List<Integer> ids) {
        ids.removeAll(repository.getOrganizationsWithSuborganizationsByIds(ids));
        if (ids.size() > 0) {
            repository.deleteOrganization(ids);
            return true;
        }
        else {
            return false;
        }
    }

    public List<EmployeeCountEntity> getEmployeeCount() {
        return repository.getEmployeeCount();
    }

    public List<EmployeeEntity> getSupervisorByOrganization(Integer id) {
        return repository.getSupervisorByOrganization(id);
    }

    public OrganizationEntity getParentOrganization(Integer id) {
        return repository.getParentOrganization(id);
    }

    public List<OrganizationRecursiveEntity> getOrganizationTree() {
        return repository.getOrganizationTree();
    }
}

