package com.example.sushiapi;

import com.example.sushiapi.entity.SushiRoll;
import com.example.sushiapi.repo.SushiRollRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SushiApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(SushiApiApplication.class, args);
    }

//    @Bean
//    CommandLineRunner runner(SushiRollRepo sushiRollRepo){
//        return args -> {
//
//            SushiRoll sushiRoll = new SushiRoll(2,"fire roll","it's really good");
//
//            sushiRollRepo.insert(sushiRoll);
//        };
//
//    }
//

}
