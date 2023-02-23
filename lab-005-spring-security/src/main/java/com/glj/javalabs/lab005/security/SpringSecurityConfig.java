package com.glj.javalabs.lab005.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * @author glj
 * @version $Id: SpringSecurityConfig.java, v 0.1 2023-02-20 9:58 下午 glj Exp $
 */
@Configuration
@EnableWebSecurity
public class SpringSecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    MyUserService myUserService;

    @Override
    public void configure(WebSecurity web) throws Exception {
        web.ignoring().antMatchers("/js/**", "/css/**", "/images/**");
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .antMatchers("/").permitAll()  // 项目主路径是可以直接访问的
                .anyRequest().authenticated()  // 其他请求都是要认证后才能访问
                .and()
                .logout().permitAll() // 注销接口是可以直接访问的
                .and()
                .formLogin();  // 支持表单登录

        http.csrf().disable();  // 关闭csrf认证
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//        auth.inMemoryAuthentication().withUser("admin").password("123456")
//                .roles("ADMIN").and().passwordEncoder(new CustomPasswordEncoder());
//        auth.inMemoryAuthentication().withUser("zhangsan").password("123456")
//                .roles("ADMIN").and().passwordEncoder(new CustomPasswordEncoder());
//        auth.inMemoryAuthentication().withUser("c").password("123456")
//                .roles("USER").and().passwordEncoder(new CustomPasswordEncoder());

        auth.userDetailsService(myUserService).passwordEncoder(new MyPasswordEncoder());

        auth.jdbcAuthentication().usersByUsernameQuery("")
                .authoritiesByUsernameQuery("").passwordEncoder(new MyPasswordEncoder());
    }
}
