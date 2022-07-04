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

    private String imgLink;

    public SushiRoll(Integer id, String name, String description,
    String imageLink) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.imgLink = imageLink;
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

    public String getImgLink() {
        return imgLink;
    }

    public void setImgLink(String imgLink) {
        this.imgLink = imgLink;
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
