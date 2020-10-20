package com.gym.web;

import com.gym.domain.Information;
import com.gym.repositories.InformationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Optional;

@Controller
public class ContactController {

    @Autowired
    InformationRepository informationRepo;

    @GetMapping("/contact")
    public String contactView(ModelMap model) {
        Optional<Information> infoOpt = informationRepo.findById(3);
        Information information = infoOpt.get();
        model.addAttribute("infos", information);

        return "contact"; }

}