package com.rbac.dao;

import com.rbac.entity.Organization;

import java.util.List;

/**
 * @author: zouzhihui
 * @date: 2016-08-18 17-19
 */
public interface OrganizationDao {
    public Organization createOrganization(Organization organization);
    public Organization updateOrganization(Organization organization);
    public void deleteOrganization(Long organizationId);

    Organization findOne(Long organizationId);
    List<Organization> findAll();

    List<Organization> findAllWithExclude(Organization excludeOraganization);

    void move(Organization source, Organization target);
}
