package com.example.lanittesttask.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


public class PositionDto {
    private String id;
    private String name;

    public PositionDto(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public PositionDto() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
