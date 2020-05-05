package ru.itis.semestrovaya.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import ru.itis.semestrovaya.dto.RegisterDto;
import ru.itis.semestrovaya.service.RegisterService;

@Controller
public class RegisterController {

    @Autowired
    private RegisterService registerService;

    @RequestMapping("/register")
    public ModelAndView getRegisterPage() {
        return new ModelAndView("register");
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public ModelAndView registerUser(RegisterDto user) {
        ModelAndView modelAndView = new ModelAndView();
        if(registerService.saveUser(user)) {
            modelAndView.setViewName("login");
        }
        else {
            modelAndView.setViewName("register");
        }
        return modelAndView;
    }
}
