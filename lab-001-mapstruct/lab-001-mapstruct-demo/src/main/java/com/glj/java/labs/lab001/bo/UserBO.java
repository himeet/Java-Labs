package com.glj.java.labs.lab001.bo;

/**
 * @ClassName UserBO
 * @Description
 *
 * User 的 BO
 *
 * @Author glj
 * @Date 2022/5/20 5:53 下午
 * @Version 1.0
 */
public class UserBO {

    private Integer id;

    private String username;

    private String password;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "UserBO{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
