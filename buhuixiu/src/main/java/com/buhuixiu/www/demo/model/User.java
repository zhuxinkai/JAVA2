package com.buhuixiu.www.demo.model;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * <h3>buhuixiu</h3>
 * <p>用户类</p>
 *
 * @author : zhuxinkai
 * @date : 2019-12-24 09:46
 **/


public class User implements UserDetails {
    private Integer id;
    private String username;
    private String password;
    private Boolean enable;
    private Boolean locked;
    private List<Role> roles;



    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        List<SimpleGrantedAuthority> authorities = new ArrayList<>();
        for (Role role: roles){
            authorities.add(new SimpleGrantedAuthority(role.getName()));
        }
        return authorities;

    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String getUsername() {
        return username;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return !locked;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return enable;
    }

    public Integer getId() {
        return id;
    }

    public Boolean getEnable() {
        return enable;
    }

    public Boolean getLocked() {
        return locked;
    }

    public List<Role> getRoles() {
        return roles;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setEnable(Boolean enable) {
        this.enable = enable;
    }

    public void setLocked(Boolean locked) {
        this.locked = locked;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }
}
