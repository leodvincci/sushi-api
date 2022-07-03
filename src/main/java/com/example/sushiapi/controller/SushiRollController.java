package com.example.sushiapi.controller;

import com.example.sushiapi.entity.SushiRoll;
import com.example.sushiapi.service.SushiRollService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@CrossOrigin
@RequestMapping("api/v1/sushirolls")
@AllArgsConstructor
public class SushiRollController {

    private final SushiRollService sushiRollService;

    @GetMapping()
    public List<SushiRoll> fetchAllStudents(){
        return sushiRollService.getAllSushirolls();
    }


}


