package com.example.lanittesttask.dto.request;


import jakarta.xml.bind.annotation.*;
import lombok.NoArgsConstructor;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement(name = "Письмо_инопланетянам")
@XmlAccessorType(XmlAccessType.FIELD)
public class RequestEmail implements Serializable {
    @XmlElement(name = "код_расы")
    private Race race;

    @XmlElement(name = "created")
    private Created created;

    @XmlElement(name = "uid")
    private Uid uid;

    @XmlElement(name = "author")
    private List<Author> authors = new ArrayList<>();

    @XmlElement(name = "document")
    private Document document;

    public RequestEmail() {
    }

    public Race getRace() {
        return race;
    }

    public void setRace(Race race) {
        this.race = race;
    }

    public Created getCreated() {
        return created;
    }

    public void setCreated(Created created) {
        this.created = created;
    }

    public Uid getUid() {
        return uid;
    }

    public void setUid(Uid uid) {
        this.uid = uid;
    }

    public List<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(List<Author> authors) {
        this.authors = authors;
    }

    public Document getDocument() {
        return document;
    }

    public void setDocument(Document document) {
        this.document = document;
    }
}
