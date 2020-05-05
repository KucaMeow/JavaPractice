package ru.itis.semestrovaya.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.http.HttpRequest;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.itis.semestrovaya.service.ErrorsService;

import javax.servlet.http.HttpServletRequest;

@Controller
public class AppErrorController implements ErrorController {

    @Autowired
    ErrorsService errorsService;

    @RequestMapping("/error")
    public String handleError(Model model, HttpStatus httpStatus) {
//        model.addAttribute("errorMsg", errorsService.getErrorMessage(httpStatus.value()));
        return "errorPage";
    }

    @Override
    public String getErrorPath() {
        return "/error";
    }
}
