package com.example.lanittesttask.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


public class TitleDto {
    private String code;
    private String description;
    private String theme;

    public TitleDto(String code, String description, String theme) {
        this.code = code;
        this.description = description;
        this.theme = theme;
    }

    public TitleDto() {
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }



    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }
}
