package com.wrapper.deezer.models.data.user;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.net.URL;
import java.util.Date;
import java.util.List;

public class User {
    @JsonProperty("id")
    private Long id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("lastname")
    private String lastname;
    @JsonProperty("firstname")
    private String firstname;
    @JsonProperty("email")
    private String email;
    @JsonProperty("status")
    private int status;
    @JsonProperty("birthday")
    private Date birthday;
    @JsonProperty("inscription_date")
    private Date inscriptionDate;
    @JsonProperty("gender")
    private String gender;
    @JsonProperty("link")
    private URL link;
    @JsonProperty("picture")
    private URL picture;
    @JsonProperty("picture_small")
    private URL pictureSmall;
    @JsonProperty("picture_medium")
    private URL pictureMedium;
    @JsonProperty("picture_big")
    private URL pictureBig;
    @JsonProperty("picture_xl")
    private URL pictureXl;
    @JsonProperty("country")
    private String country;
    @JsonProperty("lang")
    private String language;
    @JsonProperty("is_kid")
    private Boolean isKid;
    @JsonProperty("explicit_content_level")
    private String explicitContentLevel;
    @JsonProperty("explicit_content_levels_available")
    private List<String> explicitContentLevelsAvailable;
    @JsonProperty("tracklist")
    private URL tracklist;
    @JsonProperty("type")
    private String type;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Date getInscriptionDate() {
        return inscriptionDate;
    }

    public void setInscriptionDate(Date inscriptionDate) {
        this.inscriptionDate = inscriptionDate;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public URL getLink() {
        return link;
    }

    public void setLink(URL link) {
        this.link = link;
    }

    public URL getPicture() {
        return picture;
    }

    public void setPicture(URL picture) {
        this.picture = picture;
    }

    public URL getPictureSmall() {
        return pictureSmall;
    }

    public void setPictureSmall(URL pictureSmall) {
        this.pictureSmall = pictureSmall;
    }

    public URL getPictureMedium() {
        return pictureMedium;
    }

    public void setPictureMedium(URL pictureMedium) {
        this.pictureMedium = pictureMedium;
    }

    public URL getPictureBig() {
        return pictureBig;
    }

    public void setPictureBig(URL pictureBig) {
        this.pictureBig = pictureBig;
    }

    public URL getPictureXl() {
        return pictureXl;
    }

    public void setPictureXl(URL pictureXl) {
        this.pictureXl = pictureXl;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public Boolean getKid() {
        return isKid;
    }

    public void setKid(Boolean kid) {
        isKid = kid;
    }

    public String getExplicitContentLevel() {
        return explicitContentLevel;
    }

    public void setExplicitContentLevel(String explicitContentLevel) {
        this.explicitContentLevel = explicitContentLevel;
    }

    public List<String> getExplicitContentLevelsAvailable() {
        return explicitContentLevelsAvailable;
    }

    public void setExplicitContentLevelsAvailable(List<String> explicitContentLevelsAvailable) {
        this.explicitContentLevelsAvailable = explicitContentLevelsAvailable;
    }

    public URL getTracklist() {
        return tracklist;
    }

    public void setTracklist(URL tracklist) {
        this.tracklist = tracklist;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", firstname='" + firstname + '\'' +
                ", email='" + email + '\'' +
                ", status=" + status +
                ", birthday=" + birthday +
                ", inscriptionDate=" + inscriptionDate +
                ", gender='" + gender + '\'' +
                ", link=" + link +
                ", picture=" + picture +
                ", pictureSmall=" + pictureSmall +
                ", pictureMedium=" + pictureMedium +
                ", pictureBig=" + pictureBig +
                ", pictureXl=" + pictureXl +
                ", country='" + country + '\'' +
                ", language='" + language + '\'' +
                ", isKid=" + isKid +
                ", explicitContentLevel='" + explicitContentLevel + '\'' +
                ", explicitContentLevelsAvailable=" + explicitContentLevelsAvailable +
                ", tracklist=" + tracklist +
                ", type='" + type + '\'' +
                '}';
    }
}
