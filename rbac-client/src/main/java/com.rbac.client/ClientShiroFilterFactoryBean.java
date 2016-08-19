package com.rbac.client;

import org.apache.commons.lang3.StringUtils;
import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import javax.servlet.Filter;

/**
 * @author: zouzhihui
 * @date: 2016-08-19 16-56
 */
public class ClientShiroFilterFactoryBean extends ShiroFilterFactoryBean implements ApplicationContextAware {
    private ApplicationContext applicationContext;

    public void setApplicationContext(ApplicationContext applicationContext) {
        this.applicationContext = applicationContext;
    }

    public void setFiltersStr(String filters) {
        if(StringUtils.isEmpty(filters)) {
            return;
        }
        String[] filterArray = filters.split(";");
        for(String filter : filterArray) {
            String[] o = filter.split("=");
            getFilters().put(o[0], (Filter)applicationContext.getBean(o[1]));
        }
    }

    public void setFilterChainDefinitionsStr(String filterChainDefinitions) {
        if(StringUtils.isEmpty(filterChainDefinitions)) {
            return;
        }
        String[] chainDefinitionsArray = filterChainDefinitions.split(";");
        for(String filter : chainDefinitionsArray) {
            String[] o = filter.split("=");
            getFilterChainDefinitionMap().put(o[0], o[1]);
        }
    }
}
