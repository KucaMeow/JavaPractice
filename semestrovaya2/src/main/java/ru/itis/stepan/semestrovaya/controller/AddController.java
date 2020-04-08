package ru.itis.stepan.semestrovaya.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import ru.itis.stepan.semestrovaya.dto.UserDto;
import ru.itis.stepan.semestrovaya.repositories.UserRepository;

@Controller
public class AddController {

    @Autowired
    UserRepository userRepository;

    @GetMapping("/add")
    public String showAddPage() {
        return "add";
    }

    @PostMapping("/add")
    public String addUser(@ModelAttribute("userDto")UserDto userDto) {
        if(userRepository.validate(userDto)) {
            userRepository.add(userDto);
            return "redirect:/list";
        }
        else {
            return "redirect:/add?error";
        }
    }
}
