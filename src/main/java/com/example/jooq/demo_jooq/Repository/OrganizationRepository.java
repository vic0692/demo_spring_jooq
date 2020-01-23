package com.example.jooq.demo_jooq.Repository;

import com.example.jooq.demo_jooq.Entities.*;
import com.example.jooq.demo_jooq.introduction.db.tables.daos.OrganizationDao;
import com.example.jooq.demo_jooq.introduction.db.tables.pojos.Organization;
import lombok.AllArgsConstructor;
import org.jooq.DSLContext;
import org.jooq.Field;
import org.jooq.impl.DSL;
import org.jooq.util.postgres.PostgresDSL;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.List;

import static com.example.jooq.demo_jooq.introduction.db.Sequences.ORGANIZATION_ID_SEQ;
import static com.example.jooq.demo_jooq.introduction.db.tables.Organization.ORGANIZATION;
import static com.example.jooq.demo_jooq.introduction.db.tables.Employee.EMPLOYEE;
import static org.jooq.impl.DSL.*;

@Repository
@AllArgsConstructor
public class OrganizationRepository {

    private final DSLContext dslContext;
    private final OrganizationDao organizationDao;

    public OrganizationEntity getOrganization(Integer id) {
        return dslContext.select(ORGANIZATION.fields())
                .from(ORGANIZATION)
                .where(ORGANIZATION.ID.eq(id))
                .fetchOneInto(OrganizationEntity.class);
    }

    public List<OrganizationEntity> organizationList() {
        return dslContext.select(ORGANIZATION.fields())
                .from(ORGANIZATION)
                .fetch()
                .into(OrganizationEntity.class);
    }

    public Integer createOrganization(OrganizationEntity organizationEntity) {
        Integer id = dslContext.nextval(ORGANIZATION_ID_SEQ);

        Organization organization = new Organization();
        organization.setId(id);
        organization.setOrganizationname(organizationEntity.getOrganizationName());
        organization.setParentorganization(organizationEntity.getParentOrganizationId());

        organizationDao.insert(organization);

        return id;
    }

    public Integer updateOrganization(Integer id, OrganizationEntity organization) {
        dslContext.update(ORGANIZATION).set(ORGANIZATION.ORGANIZATIONNAME, organization.getOrganizationName())
                .set(ORGANIZATION.PARENTORGANIZATION, organization.getParentOrganizationId())
                .where(ORGANIZATION.ID.eq(id))
                .execute();
        return id;
    }

    public void deleteOrganization(List<Integer> ids) {
       dslContext.deleteFrom(ORGANIZATION)
               .where(ORGANIZATION.ID.in(ids))
               .execute();
    }

    public List<Integer> getAllParentOrganizationsByIds(List<Integer> ids) {
        return dslContext.selectDistinct(ORGANIZATION.PARENTORGANIZATION)
                .from(ORGANIZATION)
                .where(ORGANIZATION.ID.in(ids))
                .fetch()
                .into(Integer.TYPE);
    }

    public List<Integer> getAllParentOrganizations() {
        return dslContext.selectDistinct(ORGANIZATION.PARENTORGANIZATION)
                .from(ORGANIZATION)
                .fetch()
                .into(Integer.TYPE);
    }

    public Collection<Integer> getOrganizationsWithSuborganizationsByIds(List<Integer> ids) {
        return dslContext.selectDistinct(ORGANIZATION.PARENTORGANIZATION)
                .from(ORGANIZATION)
                .where(ORGANIZATION.PARENTORGANIZATION.in(ids))
                .fetch()
                .into(Integer.TYPE);
    }

    public List<EmployeeCountEntity> getEmployeeCount() {
        return dslContext.select(ORGANIZATION.ORGANIZATIONNAME, DSL.count(EMPLOYEE.ID).as("employeeCount"))
                .from(ORGANIZATION)
                .fullJoin(EMPLOYEE)
                .on(ORGANIZATION.ID.eq(EMPLOYEE.ORGANIZATIONID))
                .groupBy(ORGANIZATION.ORGANIZATIONNAME)
                .fetch()
                .into(EmployeeCountEntity.class);
    }

    public List<EmployeeEntity> getSupervisorByOrganization(Integer id) {
        return dslContext.select(EMPLOYEE.fields())
                .from(EMPLOYEE)
                .fullJoin(ORGANIZATION)
                .on(EMPLOYEE.ORGANIZATIONID.equal(ORGANIZATION.ID))
                .where(ORGANIZATION.ID.equal(id))
                .and(EMPLOYEE.SUPERVISORID.isNull())
                .fetch()
                .into(EmployeeEntity.class);
    }

    public OrganizationEntity getParentOrganization(Integer id) {
        return dslContext.select(ORGANIZATION.fields())
                .from(ORGANIZATION)
                .where(ORGANIZATION.ID.equal(
                        dslContext.select(ORGANIZATION.PARENTORGANIZATION)
                                .from(ORGANIZATION)
                                .where(ORGANIZATION.ID.equal(id))
                ))
                .fetchOne()
                .into(OrganizationEntity.class);
    }

    public List<OrganizationRecursiveEntity> getOrganizationTree() {
        Field<Integer[]> path = array(ORGANIZATION.ID).as("path");
        Field<Integer> level = inline(1).as("level");
        Field<String> display = inline("- ").concat(ORGANIZATION.ORGANIZATIONNAME).as("display");

        return dslContext.withRecursive("r").as(
                select(ORGANIZATION.ID, ORGANIZATION.ORGANIZATIONNAME, ORGANIZATION.PARENTORGANIZATION, path, level, display)
                        .from(ORGANIZATION)
                        .where(ORGANIZATION.PARENTORGANIZATION.isNull())
                        .unionAll(
                                select(ORGANIZATION.ID, ORGANIZATION.ORGANIZATIONNAME, ORGANIZATION.PARENTORGANIZATION, PostgresDSL.arrayAppend(path, ORGANIZATION.ID), level.add(inline(1)), repeat(inline(" "), level).concat("- ").concat(ORGANIZATION.ID))
                                        .from(ORGANIZATION)
                                        .join(table(name("r"))).on(field(name("r", "id"), Integer.class).eq(ORGANIZATION.PARENTORGANIZATION)))

        )
                .select()
                .from(table(name("r")))
                .orderBy(path)
                .fetch()
                .into(OrganizationRecursiveEntity.class);
    }

    public List<OrganizationRecursiveEntity> getOrganizationTreeById(Integer id) {
        Field<Integer[]> path = array(ORGANIZATION.ID).as("path");
        Field<Integer> level = inline(1).as("level");
        Field<String> display = inline("- ").concat(ORGANIZATION.ORGANIZATIONNAME).as("display");

        return dslContext.withRecursive("r").as(
                select(ORGANIZATION.ID, ORGANIZATION.ORGANIZATIONNAME, ORGANIZATION.PARENTORGANIZATION, path, level, display)
                        .from(ORGANIZATION)
                        .where(ORGANIZATION.PARENTORGANIZATION.eq(id))
                        .unionAll(
                                select(ORGANIZATION.ID, ORGANIZATION.ORGANIZATIONNAME, ORGANIZATION.PARENTORGANIZATION, PostgresDSL.arrayAppend(path, ORGANIZATION.ID), level.add(inline(1)), repeat(inline(" "), level).concat("- ").concat(ORGANIZATION.ID))
                                        .from(ORGANIZATION)
                                        .join(table(name("r"))).on(field(name("r", "id"), Integer.class).eq(ORGANIZATION.PARENTORGANIZATION)))

        )
                .select()
                .from(table(name("r")))
                .orderBy(path)
                .fetch()
                .into(OrganizationRecursiveEntity.class);
    }

    public List<OrganizationParentEntity> getOrganizationParentName() {
        return dslContext.select(ORGANIZATION.as("org").ID.as("id"), ORGANIZATION.as("org").ORGANIZATIONNAME.as("organizationName"), ORGANIZATION.as("org").PARENTORGANIZATION.as("parentOrganizationId"), ORGANIZATION.as("parent").ORGANIZATIONNAME.as("parentOrganizationName"))
                .from(ORGANIZATION.as("org"))
                .leftJoin(ORGANIZATION.as("parent"))
                .on(ORGANIZATION.as("org").PARENTORGANIZATION.eq(ORGANIZATION.as("parent").ID))
                .fetch()
                .into(OrganizationParentEntity.class);
    }

    public List<OrganizationParentEntity> getRoot() {
        return dslContext.select(ORGANIZATION.as("org").ID.as("id"), ORGANIZATION.as("org").ORGANIZATIONNAME.as("organizationName"), ORGANIZATION.as("org").PARENTORGANIZATION.as("parentOrganizationId"), ORGANIZATION.as("parent").ORGANIZATIONNAME.as("parentOrganizationName"))
                .from(ORGANIZATION.as("org"))
                .leftJoin(ORGANIZATION.as("parent"))
                .on(ORGANIZATION.as("org").PARENTORGANIZATION.eq(ORGANIZATION.as("parent").ID))
                .where(ORGANIZATION.as("org").PARENTORGANIZATION.isNull())
                .fetch()
                .into(OrganizationParentEntity.class);
    }

    public List<OrganizationParentEntity> getBranch(Integer id) {
        return dslContext.select(ORGANIZATION.as("org").ID.as("id"), ORGANIZATION.as("org").ORGANIZATIONNAME.as("organizationName"), ORGANIZATION.as("org").PARENTORGANIZATION.as("parentOrganizationId"), ORGANIZATION.as("parent").ORGANIZATIONNAME.as("parentOrganizationName"))
                .from(ORGANIZATION.as("org"))
                .leftJoin(ORGANIZATION.as("parent"))
                .on(ORGANIZATION.as("org").PARENTORGANIZATION.eq(ORGANIZATION.as("parent").ID))
                .where(ORGANIZATION.as("org").PARENTORGANIZATION.eq(id))
                .fetch()
                .into(OrganizationParentEntity.class);
    }
}
