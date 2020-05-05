package ru.itis.semestrovaya.controller;

import org.springframework.security.access.annotation.Secured;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainPageController {
    @PreAuthorize("hasAuthority(\"ROLE_ADMIN\")")
    @GetMapping("/hello")
    public String getMainPage() {
        return "home";
    }

    @GetMapping
    public String getDefaultPage() {
        return "redirect:/hello";
    }
}
