package com.gym.web;

import com.gym.domain.Information;
import com.gym.repositories.InformationRepository;
import com.gym.service.InformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.List;
import java.util.Optional;

@Controller
public class ScheduleController {

    @Autowired
    private InformationRepository informationRepo;
    private InformationService informationService;

    @GetMapping("/schedule")
    public String scheduleView(ModelMap model){

        Optional<Information> infoOpt = informationRepo.findById(2);
        Information information = infoOpt.get();
        model.addAttribute("infos", information);

        return "schedule";
    }

}
