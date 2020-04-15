package ru.itis.stepan.semestrovaya.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import ru.itis.stepan.semestrovaya.models.User;
import ru.itis.stepan.semestrovaya.repositories.UserRepository;

@Controller
public class EditController {

    @Autowired
    UserRepository userRepository;

    @GetMapping("/user/{id}/edit")
    public ModelAndView getEditPage(@PathVariable long id) {
        User user = userRepository.find(id);
        return new ModelAndView("edit", "user", user);
    }

    @GetMapping("/update")
    public String updateUser(@ModelAttribute("user") User user) {
        userRepository.update(user);
        return "redirect:/list";
    }

    @PostMapping("/user/{id}/delete")
    public String deleteUser(@PathVariable long id) {
        User user = userRepository.find(id);
        userRepository.delete(user);
        return "redirect:/list";
    }
}
