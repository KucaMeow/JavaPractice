package ru.itis.semestrovaya;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan("ru.itis.semestrovaya.model")
public class SemestrovayaApplication {

    public static void main(String[] args) {
        SpringApplication.run(SemestrovayaApplication.class, args);
    }

}
