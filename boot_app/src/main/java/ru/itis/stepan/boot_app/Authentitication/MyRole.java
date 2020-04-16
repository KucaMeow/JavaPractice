package ru.itis.stepan.boot_app.Authentitication;

import org.springframework.security.core.GrantedAuthority;

public class MyRole implements GrantedAuthority {

    private String rolename;

    public MyRole(String rolename) {
        this.rolename = rolename;
    }

    @Override
    public String getAuthority() {
        return rolename;
    }
}
