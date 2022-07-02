package com.example.sushiapi.entity;


import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
public class SushiRoll {

    @Id
    private Integer id;
    private String name;
    private String description;

    public SushiRoll(Integer id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    public SushiRoll() {
        
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
