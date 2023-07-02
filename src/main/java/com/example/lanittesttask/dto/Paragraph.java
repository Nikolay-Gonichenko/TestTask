package com.example.lanittesttask.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


public class Paragraph {
    private String value;

    public Paragraph(String value) {
        this.value = value;
    }

    public Paragraph() {
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
