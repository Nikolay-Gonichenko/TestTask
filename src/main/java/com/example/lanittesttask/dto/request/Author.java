package com.example.lanittesttask.dto.request;

import jakarta.xml.bind.annotation.*;

import java.io.Serializable;


@XmlRootElement(name = "author")
@XmlAccessorType(XmlAccessType.FIELD)
public class Author implements Serializable {

    @XmlElement(name = "id")
    private AuthorId authorId;

    public Author() {
    }

    public AuthorId getAuthorId() {
        return authorId;
    }

    public void setAuthorId(AuthorId authorId) {
        this.authorId = authorId;
    }
}
