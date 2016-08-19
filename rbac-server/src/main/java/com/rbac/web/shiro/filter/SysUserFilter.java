package com.rbac.web.shiro.filter;

import com.rbac.service.UserService;
import com.rbac.utils.Constants;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.web.filter.PathMatchingFilter;
import org.springframework.beans.factory.annotation.Autowired;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 * @author: zouzhihui
 * @date: 2016-08-19 16-10
 */
public class SysUserFilter extends PathMatchingFilter {
    @Autowired
    private UserService userService;

    @Override
    protected boolean onPreHandle(ServletRequest request, ServletResponse response, Object mappedValue) throws Exception {

        String username = (String) SecurityUtils.getSubject().getPrincipal();
        request.setAttribute(Constants.CURRENT_USER, userService.findByUsername(username));
        return true;
    }
}
