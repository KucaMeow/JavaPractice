package ru.itis.stepan.semestrovaya.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import ru.itis.stepan.semestrovaya.dto.UserDto;
import ru.itis.stepan.semestrovaya.model.User;
import ru.itis.stepan.semestrovaya.repositories.UserRepository;

@Controller
public class EditController {

    @Autowired
    UserRepository userRepository;

    @GetMapping("/edit")
    public ModelAndView getEditPage(@RequestParam long id) {
        User user = userRepository.find(id);
        return new ModelAndView("edit", "user", user);
    }

    @GetMapping("/update")
    public String updateUser(@ModelAttribute("user") User user) {
        userRepository.update(user);
        return "redirect:/list";
    }

    @PostMapping("edit")
    public String deleteUser(@RequestParam long id) {
        User user = userRepository.find(id);
        userRepository.delete(user);
        return "redirect:/list";
    }
}
