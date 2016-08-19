package com.rbac.web.bind.annotation;

import com.rbac.utils.Constants;

import java.lang.annotation.*;

/**
 * @author: zouzhihui
 * @date: 2016-08-19 15-54
 */
@Target({ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface CurrentUser {
    /**
     * 当前用户在request中的名字
     *
     * @return
     */
    String value() default Constants.CURRENT_USER;
}
