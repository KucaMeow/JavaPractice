package ru.itis.stepan.boot_app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import ru.itis.stepan.boot_app.Authentitication.MyAuth;
import ru.itis.stepan.boot_app.Services.ActionBean;
import ru.itis.stepan.boot_app.Services.LoginBean;

@SpringBootApplication
@EnableGlobalMethodSecurity(securedEnabled = true)
public class BootAppApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(BootAppApplication.class, args);

        ActionBean actionBean = (ActionBean)context.getBean("actionBean");
        LoginBean loginBean = (LoginBean)context.getBean("loginBean");

        SecurityContext securityContext = SecurityContextHolder.getContext();
        securityContext.setAuthentication(MyAuth.getInstance());

//        actionBean.doAction();

        loginBean.login("admin","admin");
        actionBean.doAction();
        loginBean.logout();
        try {
            actionBean.doAction();
        } catch (AccessDeniedException e) {
            System.out.println("You don't have enough permissions");
        }
    }

}
