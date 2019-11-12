package com.example.jooq.demo_jooq.Repository;

import com.example.jooq.demo_jooq.Entities.OrganizationEntity;
import com.example.jooq.demo_jooq.introduction.db.tables.daos.OrganizationDao;
import com.example.jooq.demo_jooq.introduction.db.tables.pojos.Organization;
import lombok.AllArgsConstructor;
import org.jooq.DSLContext;
import org.springframework.stereotype.Repository;

import java.util.List;

import static com.example.jooq.demo_jooq.introduction.db.Sequences.ORGANIZATION_ID_SEQ1;
import static com.example.jooq.demo_jooq.introduction.db.tables.Organization.ORGANIZATION;

@Repository
@AllArgsConstructor
public class OrganizationRepository {

    private final DSLContext dslContext;
    private final OrganizationDao organizationDao;

    public OrganizationEntity getOrganization(Integer id) {
        return dslContext.select(ORGANIZATION.fields()).from(ORGANIZATION).where(ORGANIZATION.ID.eq(id)).fetchOneInto(OrganizationEntity.class);
    }

    public List<OrganizationEntity> organizationList() {
        return dslContext.select(ORGANIZATION.fields()).from(ORGANIZATION).fetch().into(OrganizationEntity.class);
    }

    public Integer createOrganization(OrganizationEntity organizationEntity) {
        Integer id = dslContext.nextval(ORGANIZATION_ID_SEQ1);

        Organization organization = new Organization();
        organization.setId(id);
        organization.setOrganizationName(organizationEntity.getOrganizationName());
        organization.setParentOrganization(organizationEntity.getParentOrganizationId());

        organizationDao.insert(organization);

        return id;
    }

    public Integer updateOrganization(Integer id, OrganizationEntity organization) {
        dslContext.update(ORGANIZATION).set(ORGANIZATION.ORGANIZATION_NAME, organization.getOrganizationName())
                .set(ORGANIZATION.PARENT_ORGANIZATION, organization.getParentOrganizationId())
                .where(ORGANIZATION.ID.eq(id))
                .execute();
        return id;
    }

    public void deleteOrganization(List<Integer> ids) {
        /*if (validateDeleteOrganization(ids)) {
            ids.removeAll(getAllParentOrganizationsByIds(ids));
            dslContext.deleteFrom(ORGANIZATION).where(ORGANIZATION.ID.in(ids)).execute();
            return true;
        }
        else {
            return false;
        }*/

        dslContext.deleteFrom(ORGANIZATION).where(ORGANIZATION.ID.in(ids)).execute();
    }

    public Boolean validateDeleteOrganization(List<Integer> ids)
    {
        return ids.size() > getAllParentOrganizationsByIds(ids).size();
    }

    public List<Integer> getAllParentOrganizationsByIds(List<Integer> ids)
    {
        return dslContext.selectDistinct(ORGANIZATION.PARENT_ORGANIZATION).from(ORGANIZATION).where(ORGANIZATION.ID.in(ids)).fetch().into(Integer.TYPE);
    }
}
