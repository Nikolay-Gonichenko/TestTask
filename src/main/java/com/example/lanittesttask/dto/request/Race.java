package com.example.lanittesttask.dto.request;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

import java.io.Serializable;

@XmlRootElement(name = "код_расы")
@XmlAccessorType(XmlAccessType.FIELD)
public class Race implements Serializable {

    @XmlElement(name = "value")
    private String value;

    public Race() {
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
