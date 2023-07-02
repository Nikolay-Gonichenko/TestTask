package com.example.lanittesttask.dto.request;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

import java.io.Serializable;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Document implements Serializable {
    @XmlElement(name = "text")
    private String text;

    @XmlElement(name = "address")
    private Address address;

    @XmlElement(name = "tel")
    private Tel phone;

    public Document() {
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Tel getPhone() {
        return phone;
    }

    public void setPhone(Tel phone) {
        this.phone = phone;
    }
}
