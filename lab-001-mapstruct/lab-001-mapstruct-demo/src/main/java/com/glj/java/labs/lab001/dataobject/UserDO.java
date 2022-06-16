package com.glj.java.labs.lab001.dataobject;

/**
 * @ClassName UserDO
 * @Description
 *
 * User 的 DO
 *
 * @Author glj
 * @Date 2022/5/20 5:51 下午
 * @Version 1.0
 */
public class UserDO {

    private Integer id;

    private String username;

    private String password;

    public Integer getId() {
        return id;
    }

    public UserDO setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getUsername() {
        return username;
    }

    public UserDO setUsername(String username) {
        this.username = username;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public UserDO setPassword(String password) {
        this.password = password;
        return this;
    }
}
