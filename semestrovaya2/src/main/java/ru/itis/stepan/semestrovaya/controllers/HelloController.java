package ru.itis.stepan.semestrovaya.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import ru.itis.stepan.semestrovaya.dto.UserDto;

@Controller
@RequestMapping("/hello")
public class HelloController {

    @Autowired
    private UserDto userDto;

    @GetMapping
    public ModelAndView showPage() {
        return new ModelAndView("hello", "userDto", userDto);
    }
    @PostMapping
    public ModelAndView update(@ModelAttribute("userDto")UserDto userDto) {
        this.userDto = userDto;
        return new ModelAndView("hello", "userDto", userDto);
    }
}
