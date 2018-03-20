package com.spring4all.entity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @Company
 * @Discription
 * @Author guoxiaojing
 * @CreateDate 2018/3/20 16:09
 * @Version 1.0
 */
public class CustomEntity {

    private String username;

    private String password;

//    private List<GrantedAuthority> roles;

    private String roles;
    private List<String> permissions;

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

//    public List<GrantedAuthority> getRoles() {
//        return roles;
//    }
//
//    public void setRoles(List<GrantedAuthority> roles) {
//        this.roles = roles;
//    }
//
//    public void setRoles(String... roles) {
//        List<GrantedAuthority> roleList = new ArrayList<GrantedAuthority>();
//        for (String role : roles) {
//            SimpleGrantedAuthority authority = new SimpleGrantedAuthority(role);
//            roleList.add(authority);
//        }
//        this.roles = roleList;
//    }

    public String getRoles() {
        return roles;
    }
    public void setRoles(String roles) {
        this.roles = roles;
    }


    public List<String> getPermissions() {
        return permissions;
    }

    public void setPermissions(List<String> permissions) {
        this.permissions = permissions;
    }

    public void setPermissions(String... permissions) {
        List<String> permissionList = new ArrayList<String>();
        Collections.addAll(permissionList, permissions);
        this.permissions = permissionList;
    }
}
