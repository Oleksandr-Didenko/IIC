package com.gym.web;

import com.gym.domain.Information;
import com.gym.repositories.InformationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Optional;

@Controller
public class RootController {

    @Autowired
    InformationRepository informationRepo;

    @GetMapping("/")
    public String rootView(ModelMap model){
        Optional<Information> infoOpt = informationRepo.findById(1);
        Information information = infoOpt.get();
        model.addAttribute("infos", information);

        return "index";
    }

}
