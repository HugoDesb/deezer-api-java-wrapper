package com.wrapper.deezer.models.data.infos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Infos {
    @JsonProperty("country_iso")
    private String countryISO;
    @JsonProperty("country")
    private String country;
    @JsonProperty("open")
    private boolean open;
    @JsonProperty("offers")
    private List<Offer> offers;

    public String getCountryISO() {
        return countryISO;
    }

    public void setCountryISO(String countryISO) {
        this.countryISO = countryISO;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public boolean isOpen() {
        return open;
    }

    public void setOpen(boolean open) {
        this.open = open;
    }

    public List<Offer> getOffers() {
        return offers;
    }

    public void setOffers(List<Offer> offers) {
        this.offers = offers;
    }

    @Override
    public String toString() {
        return "Infos{" +
                "countryISO='" + countryISO + '\'' +
                ", country='" + country + '\'' +
                ", open=" + open +
                ", offers=" + offers +
                '}';
    }
}
