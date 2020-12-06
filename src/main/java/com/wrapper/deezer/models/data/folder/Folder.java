package com.wrapper.deezer.models.data.folder;


public class Folder {
    private Long id;
    private String title;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Folder{" +
                "id=" + id +
                ", title='" + title + '\'' +
                '}';
    }
}