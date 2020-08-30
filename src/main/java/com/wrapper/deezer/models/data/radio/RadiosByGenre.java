package com.wrapper.deezer.models.data.radio;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class RadiosByGenre {
    @JsonProperty("id")
    private Long id;
    @JsonProperty("title")
    private String title;
    @JsonProperty("radios")
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
