package com.gym.web;

import com.gym.domain.Information;
import com.gym.repositories.InformationRepository;
import com.gym.service.InformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

@Controller
public class AdminPanelController {

    @Autowired
    private InformationService infoService;

    @GetMapping("/adminPanel")
    public String adminView(ModelMap model){
        model.put("information", new Information());
        return "adminPanel";
    }

    @PostMapping("/adminPanel")
    public String updateInfo(@ModelAttribute Information info){
        infoService.save(info);
        return "redirect:/adminPanel";
    }
}
