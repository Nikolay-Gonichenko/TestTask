package com.example.lanittesttask.dto.request;

import jakarta.xml.bind.annotation.*;

import java.io.Serializable;

@XmlRootElement(name = "uid")
@XmlAccessorType(XmlAccessType.FIELD)
public class Uid implements Serializable {

    @XmlElement(name = "code")
    private Code code;

    public Uid() {
    }

    public Code getCode() {
        return code;
    }

    public void setCode(Code code) {
        this.code = code;
    }
}
