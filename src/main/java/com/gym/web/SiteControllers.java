package com.gym.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class SiteControllers {

    @RequestMapping(value = "/contact", method = RequestMethod.GET)
    public String contactView() { return "contact"; }

    @RequestMapping(value = "/schedule", method = RequestMethod.GET)
    public String scheduleView(){
        return "schedule";
    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String loginView(){
        return "login";
    }

    @RequestMapping(value = "/adminPanel", method = RequestMethod.GET)
    public String adminView(){
        return "adminPanel";
    }
}
