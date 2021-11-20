package com.panda.thymeleafbypass;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Bypass {
    Logger log =  LoggerFactory.getLogger(com.panda.thymeleafbypass.Bypass.class);

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("message", "hello world!");
        return "index";
    }

    @GetMapping("/admin")
    public String path(@RequestParam String language) {
        return "language/" + language + "/admin";
    }


}
