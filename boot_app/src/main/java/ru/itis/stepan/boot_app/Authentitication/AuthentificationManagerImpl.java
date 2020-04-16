package ru.itis.stepan.boot_app.Authentitication;

import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.stereotype.Component;

import java.util.Set;

@Component
public class AuthentificationManagerImpl implements AuthenticationManager {
    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
        String username = (String) authentication.getPrincipal();
        String password = (String) authentication.getCredentials();

        MyAuth auth;

        if(username.equals("admin") && password.equals("admin")) {
            auth = new MyAuth(username, password);
            ((Set<MyRole>) auth.getAuthorities()).add((new MyRole("ROLE_ADMIN")));
            auth.setAuthenticated(true);
        }
        else {
            auth = MyAuth.getInstance();
        }
        return auth;
    }
}
