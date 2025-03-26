package com.saurabhtech.todoapp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class LoginController {

    private Logger logger = LoggerFactory.getLogger(getClass()); // Import from slf4j

    @GetMapping("/login")
    public String loginUser(@RequestParam String name, ModelMap model){
        model.put("name",name);
        logger.info("Request param is {}", name);
        logger.warn("Request param is {}", name); // Like this we can log on different levels
        return "login";
    }
}
