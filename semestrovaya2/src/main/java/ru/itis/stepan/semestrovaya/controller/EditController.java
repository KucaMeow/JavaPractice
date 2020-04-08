package ru.itis.stepan.semestrovaya.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;
import ru.itis.stepan.semestrovaya.repositories.UserRepository;

@Controller
public class EditController {


    @Autowired
    UserRepository userRepository;

    @GetMapping("/edit")
    public ModelAndView getPage() {
        ModelAndView mav = new ModelAndView("edit");
        mav.addObject("users", userRepository.getAll());
        return mav;
    }
}
