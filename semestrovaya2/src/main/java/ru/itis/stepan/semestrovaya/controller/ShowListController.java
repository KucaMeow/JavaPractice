package ru.itis.stepan.semestrovaya.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;
import ru.itis.stepan.semestrovaya.repositories.UserRepository;

@Controller
public class ShowListController {


    @Autowired
    UserRepository userRepository;

    @GetMapping("/list")
    public ModelAndView getPage() {
        ModelAndView mav = new ModelAndView("list");
        mav.addObject("users", userRepository.getAll());
        return mav;
    }
}
