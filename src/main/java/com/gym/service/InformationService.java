package com.gym.service;

import com.gym.domain.Information;
import com.gym.repositories.InformationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InformationService {

    @Autowired
    private InformationRepository informationRepos;

    public Information save(Information info){
        return informationRepos.save(info);
    }
}
