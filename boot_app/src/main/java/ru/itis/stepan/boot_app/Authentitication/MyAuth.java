package ru.itis.stepan.boot_app.Authentitication;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class MyAuth implements Authentication {

    private Collection<? extends GrantedAuthority> roles = new HashSet<>();
    private String username, password;
    private boolean authenticated;

    public MyAuth(String username, String password) {
        this.username = username;
        this.password = password;
    }

    private MyAuth(String username, String password, boolean authenticated) {
        this.username = username;
        this.password = password;
        this.authenticated = authenticated;
    }

    public static MyAuth getInstance() {
        return new MyAuth("anonymous", "-", false);
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return roles;
    }

    @Override
    public Object getCredentials() {
        return password;
    }

    @Override
    public Object getDetails() {
        return null;
    }

    @Override
    public Object getPrincipal() {
        return username;
    }

    @Override
    public boolean isAuthenticated() {
        return authenticated;
    }

    @Override
    public void setAuthenticated(boolean b) throws IllegalArgumentException {
        authenticated = b;
    }

    @Override
    public String getName() {
        return null;
    }
}
