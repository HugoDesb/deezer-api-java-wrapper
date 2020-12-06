package com.wrapper.deezer.models.data.radio;

import java.util.List;

public class RadiosByGenre {
    private Long id;
    private String title;
    private List<Radio2> radios;

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

    public List<Radio2> getRadios() {
        return radios;
    }

    public void setRadios(List<Radio2> radios) {
        this.radios = radios;
    }

    @Override
    public String toString() {
        return "RadiosByGenre{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", radios=" + radios +
                '}';
    }
}
