package com.gym.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AdminPanelController {

    @GetMapping("/adminPanel")
    public String adminView(){
        return "adminPanel";
    }

}
