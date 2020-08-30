package com.wrapper.deezer.models.data.comments;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.wrapper.deezer.UnixDateDeserializer;
import com.wrapper.deezer.models.data.TypeObject;

import java.util.Date;

public class Comment {

    @JsonProperty("id")
    private Long id;
    @JsonProperty("text")
    private String text;
    @JsonProperty("date")
    @JsonDeserialize(using = UnixDateDeserializer.class)
    private Date date;
    @JsonProperty("object")
    private TypeObject object;
    @JsonProperty("author")
    private Author author;
    @JsonProperty("type")
    private String type;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public TypeObject getObject() {
        return object;
    }

    public void setObject(TypeObject object) {
        this.object = object;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Comment{" +
                "id=" + id +
                ", text='" + text + '\'' +
                ", date=" + date +
                ", object=" + object +
                ", author=" + author +
                ", type='" + type + '\'' +
                '}';
    }
}
