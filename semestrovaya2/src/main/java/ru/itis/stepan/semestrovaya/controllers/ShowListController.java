package ru.itis.stepan.semestrovaya.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import ru.itis.stepan.semestrovaya.repositories.UserRepository;

import java.util.stream.Collectors;

@Controller
public class ShowListController {


    @Autowired
    UserRepository userRepository;

    @GetMapping("/list")
    public ModelAndView getPage(@RequestParam(name = "name_substr", required = false, defaultValue = "") String substringInName) {
        ModelAndView mav = new ModelAndView("list");
        mav.addObject("users", userRepository.getAll()
                .stream()
                .filter(u ->
                        u.getNickname().contains(substringInName))
                .collect(Collectors.toList()));
        return mav;
    }
}
