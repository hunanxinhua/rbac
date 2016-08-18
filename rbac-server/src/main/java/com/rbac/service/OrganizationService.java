package com.rbac.service;

import com.rbac.entity.Organization;

import java.util.List;

/**
 * @author: zouzhihui
 * @date: 2016-08-18 17-53
 */
public interface OrganizationService {
    public Organization createOrganization(Organization organization);
    public Organization updateOrganization(Organization organization);
    public void deleteOrganization(Long organizationId);

    Organization findOne(Long organizationId);
    List<Organization> findAll();

    Object findAllWithExclude(Organization excludeOraganization);

    void move(Organization source, Organization target);
}
