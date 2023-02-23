package com.glj.javalabs.lab005.controller;

import org.apache.catalina.User;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.security.access.prepost.PostAuthorize;
import org.springframework.security.access.prepost.PostFilter;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.access.prepost.PreFilter;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author glj
 * @version $Id: DemoController.java, v 0.1 2023-02-20 9:56 下午 glj Exp $
 */
@RestController
@EnableAutoConfiguration
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class DemoController {

    @RequestMapping("/")
    public String noAuth() {
        return "hello no auth!";
    }

    @RequestMapping("/auth")
    public String auth() {
        return "hello auth!";
    }

    // 方法调用前进行权限检查
    @PreAuthorize("hasRole(\"ROLE_ADMIN\")")
    // 方法调用后进行权限检查
    @PostAuthorize("hasRole(\"ROLE_ADMIN\") or hasRole(\"ROLE_USER\")")
    // 方法调用前对集合进行过滤
    @PreFilter("")
    // 方法调用后对集合类型的返回值进行过滤
    @PostFilter("")
    @RequestMapping("/roleAuth")
    public String roleAuth() {
        return "hello role auth!";
    }

    @PreAuthorize("#id<10 or principal.username.equals(#username) and #user.username.equals(\"Mike\")")
    @PostAuthorize("returnObject%2==0")  // 校验返回值是否是偶数
    public Integer testAuthorize(Integer id, String username, User user) {
        return id;
    }

    @PreFilter("filterObject%2==0")
    @PostFilter("filterObject%4==0")
    public List<Integer> testFilter(List<Integer> idList) {
        return idList;
    }
}
