package ru.itis.semestrovaya.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.social.connect.Connection;
import org.springframework.social.connect.web.SignInAdapter;
import org.springframework.web.context.request.NativeWebRequest;
import ru.itis.semestrovaya.container.SessionUserContainer;

import java.util.Arrays;

public class FacebookSignInAdapter implements SignInAdapter {

    @Override
    public String signIn(
            String localUserId,
            Connection<?> connection,
            NativeWebRequest request) {

        SecurityContextHolder.getContext().setAuthentication(
                new UsernamePasswordAuthenticationToken(
                        connection.getDisplayName(), null,
                        Arrays.asList(new SimpleGrantedAuthority("ROLE_USER"))));

        return null;
    }
}
