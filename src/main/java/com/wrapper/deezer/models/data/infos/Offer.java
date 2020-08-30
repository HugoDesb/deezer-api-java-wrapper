package com.wrapper.deezer.models.data.infos;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.net.URL;

public class Offer {
    @JsonProperty("id")
    private int id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("amount")
    private String amount;
    @JsonProperty("currency")
    private String currency;
    @JsonProperty("displayed_amount")
    private String displayedAmount;
    @JsonProperty("tc")
    private URL tc;
    @JsonProperty("tc_html")
    private URL tcHTML;
    @JsonProperty("tc_txt")
    private URL tcTXT;
    @JsonProperty("try_and_buy")
    private int tryAndBuy;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getDisplayedAmount() {
        return displayedAmount;
    }

    public void setDisplayedAmount(String displayedAmount) {
        this.displayedAmount = displayedAmount;
    }

    public URL getTc() {
        return tc;
    }

    public void setTc(URL tc) {
        this.tc = tc;
    }

    public URL getTcHTML() {
        return tcHTML;
    }

    public void setTcHTML(URL tcHTML) {
        this.tcHTML = tcHTML;
    }

    public URL getTcTXT() {
        return tcTXT;
    }

    public void setTcTXT(URL tcTXT) {
        this.tcTXT = tcTXT;
    }

    public int getTryAndBuy() {
        return tryAndBuy;
    }

    public void setTryAndBuy(int tryAndBuy) {
        this.tryAndBuy = tryAndBuy;
    }

    @Override
    public String toString() {
        return "Offer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", amount='" + amount + '\'' +
                ", currency='" + currency + '\'' +
                ", displayedAmount='" + displayedAmount + '\'' +
                ", tc=" + tc +
                ", tcHTML=" + tcHTML +
                ", tcTXT=" + tcTXT +
                ", tryAndBuy=" + tryAndBuy +
                '}';
    }
}
