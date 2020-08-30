package com.wrapper.deezer.models.data.comments;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.wrapper.deezer.UnixDateDeserializer;

import java.util.Date;

public class Comment2 {

    @JsonProperty("id")
    private Long id;
    @JsonProperty("text")
    private String text;
    @JsonProperty("date")
    @JsonDeserialize(using = UnixDateDeserializer.class)
    private Date date;
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
                ", author=" + author +
                ", type='" + type + '\'' +
                '}';
    }
}
