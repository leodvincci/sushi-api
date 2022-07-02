package com.example.sushiapi.service;


import com.example.sushiapi.entity.SushiRoll;
import com.example.sushiapi.repo.SushiRollRepo;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class SushiRollService {

    private final SushiRollRepo sushiRollRepo;

    public List<SushiRoll> getAllSushirolls(){
        return sushiRollRepo.findAll();
    }



}
