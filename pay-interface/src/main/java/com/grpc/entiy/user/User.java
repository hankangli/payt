package com.grpc.entiy.user;

/**
 * @ClassName User
 * @Description TODO
 * @Author hankangli
 * @Date 2020/3/15 11:07
 * @Version 1.0
 **/
public class User {

    private String userId;

    private String name;

    private String password;

    private String perms;

    private String role;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPerms() {
        return perms;
    }

    public void setPerms(String perms) {
        this.perms = perms;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
