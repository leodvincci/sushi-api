package com.example.sushiapi.repo;

import com.example.sushiapi.entity.SushiRoll;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface SushiRollRepo extends MongoRepository <SushiRoll, Long> {
}
