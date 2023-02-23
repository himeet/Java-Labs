package com.glj.javalabs.lab005.security;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

/**
 * @author glj
 * @version $Id: MyUserService.java, v 0.1 2023-02-23 9:21 下午 glj Exp $
 */
@Component
public class MyUserService implements UserDetailsService {
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        // 这里引入DB进行操作
        return null;
    }
}
