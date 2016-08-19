package com.rbac.web.controller;

import com.rbac.entity.Resource;
import com.rbac.entity.User;
import com.rbac.service.AuthorizationService;
import com.rbac.service.ResourceService;
import com.rbac.utils.Constants;
import com.rbac.web.bind.annotation.CurrentUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Set;

/**
 * @author: zouzhihui
 * @date: 2016-08-19 16-01
 */
@Controller
public class IndexController {
    @Autowired
    private ResourceService resourceService;
    @Autowired
    private AuthorizationService authorizationService;

    @RequestMapping("/")
    public String index(@CurrentUser User loginUser, Model model) {
        Set<String> permissions = authorizationService.findPermissions(Constants.SERVER_APP_KEY, loginUser.getUsername());
        List<Resource> menus = resourceService.findMenus(permissions);
        model.addAttribute("menus", menus);
        return "index";
    }

    @RequestMapping("/welcome")
    public String welcome() {
        return "welcome";
    }
}
