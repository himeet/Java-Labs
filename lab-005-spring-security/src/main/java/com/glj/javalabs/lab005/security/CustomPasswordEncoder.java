package com.glj.javalabs.lab005.security;

import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * @author glj
 * @version $Id: CustomPasswordEncoder.java, v 0.1 2023-02-20 10:43 下午 glj Exp $
 */
public class CustomPasswordEncoder implements PasswordEncoder {
    @Override
    public String encode(CharSequence rawPassword) {
        return rawPassword.toString();
    }

    @Override
    public boolean matches(CharSequence rawPassword, String encodedPassword) {
        return encodedPassword.equals(rawPassword.toString());
    }
}
