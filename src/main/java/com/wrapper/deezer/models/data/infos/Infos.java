package com.wrapper.deezer.models.data.infos;


import com.google.gson.annotations.SerializedName;

import java.util.List;


public class Infos {
    @SerializedName("country_iso")
    private String countryISO;
    private String country;
    private boolean open;
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
