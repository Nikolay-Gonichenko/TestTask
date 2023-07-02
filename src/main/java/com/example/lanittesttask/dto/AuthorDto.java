package com.example.lanittesttask.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


public class AuthorDto {
    private String id;
    private String lastName;
    private String name;
    private String secondName;
    private PositionDto position;

    public AuthorDto(String id, String lastName, String name, String secondName, PositionDto position) {
        this.id = id;
        this.lastName = lastName;
        this.name = name;
        this.secondName = secondName;
        this.position = position;
    }

    public AuthorDto() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public PositionDto getPosition() {
        return position;
    }

    public void setPosition(PositionDto position) {
        this.position = position;
    }
}
