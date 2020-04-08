package ru.itis.stepan.semestrovaya;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.annotation.SessionScope;
import ru.itis.stepan.semestrovaya.dto.UserDto;

@SpringBootApplication
public class SemestrovayaApplication {

    @Bean
    @SessionScope
    public UserDto userDto() {
        return UserDto.builder()
                .nickname("Name")
                .build();
    }

    public static void main(String[] args) {
        SpringApplication.run(SemestrovayaApplication.class, args);
    }

}
