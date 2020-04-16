package ru.itis.stepan.boot_app.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;
import ru.itis.stepan.boot_app.Authentitication.MyAuth;

@Component
public class LoginBean {

    @Autowired
    AuthenticationManager authenticationManager;

    public void login(String username, String password) {
        UsernamePasswordAuthenticationToken token = new UsernamePasswordAuthenticationToken(username, password);
        Authentication authentication = authenticationManager.authenticate(token);

        SecurityContext context = SecurityContextHolder.getContext();
        context.setAuthentication(authentication);
    }

    public void logout() {
        Authentication authentication = MyAuth.getInstance();

        SecurityContext context = SecurityContextHolder.getContext();
        context.setAuthentication(authentication);
    }
}
