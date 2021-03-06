package io.github.hugodesb.models.data.comments;

import io.github.hugodesb.models.data.TypeObject;

import java.sql.Timestamp;

public class Comment {

    private Long id;
    private String text;

    private Timestamp date;
    private TypeObject object;
    private Author author;
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

    public Timestamp getDate() {
        return date;
    }

    public void setDate(Timestamp date) {
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
