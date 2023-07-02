package com.example.lanittesttask.dto.request;


import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlRootElement;

import java.io.Serializable;

@XmlRootElement(name = "created")
@XmlAccessorType(XmlAccessType.FIELD)
public class Created implements Serializable {
    @XmlAttribute(name = "date_time")
    private String dateTime;

    public Created() {
    }

    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }
}
