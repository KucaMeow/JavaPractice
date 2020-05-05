package ru.itis.semestrovaya.aop;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;
import ru.itis.semestrovaya.dto.RegisterDto;

@Aspect
@Component
@Slf4j
public class MyLogAspect {

    @After(value = "execution(* ru.itis.semestrovaya.service.RegisterService.saveUser(*))")
    public void after(JoinPoint joinPoint) {
        log.info("User with email " + ((RegisterDto)joinPoint.getArgs()[0]).getEmail() + " registered");
    }
}
