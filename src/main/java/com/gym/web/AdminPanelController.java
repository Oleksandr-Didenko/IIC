package com.gym.web;

import com.gym.domain.Information;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

@Controller
public class AdminPanelController {

    @GetMapping("/adminPanel")
    public String adminView(ModelMap model){
        model.put("information", new Information());
        return "adminPanel";
    }

    @PostMapping("/adminPanel")
    public String updateInfo(@ModelAttribute Information info){
        System.out.println(info);
        return "redirect:/adminPanel";
    }
}
