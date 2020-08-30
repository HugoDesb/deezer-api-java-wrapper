package com.wrapper.deezer.models.data.options;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Options {
    @JsonProperty("streaming")
    private boolean streaming;
    @JsonProperty("streaming_duration")
    private int streamingDuration;
    @JsonProperty("offline")
    private boolean offline;
    @JsonProperty("hq")
    private boolean hq;
    @JsonProperty("ads_display")
    private boolean adsDisplay;
    @JsonProperty("ads_audio")
    private boolean adsAudio;
    @JsonProperty("too_many_devices")
    private boolean tooManyDevices;
    @JsonProperty("can_suscribe")
    private boolean canSuscribe;
    @JsonProperty("radio_skips")
    private int radioSkips;
    @JsonProperty("lossless")
    private boolean lossless;
    @JsonProperty("preview")
    private boolean preview;
    @JsonProperty("radio")
    private boolean radio;
    @JsonProperty("type")
    private String type;

    public boolean isStreaming() {
        return streaming;
    }

    public void setStreaming(boolean streaming) {
        this.streaming = streaming;
    }

    public int getStreamingDuration() {
        return streamingDuration;
    }

    public void setStreamingDuration(int streamingDuration) {
        this.streamingDuration = streamingDuration;
    }

    public boolean isOffline() {
        return offline;
    }

    public void setOffline(boolean offline) {
        this.offline = offline;
    }

    public boolean isHq() {
        return hq;
    }

    public void setHq(boolean hq) {
        this.hq = hq;
    }

    public boolean isAdsDisplay() {
        return adsDisplay;
    }

    public void setAdsDisplay(boolean adsDisplay) {
        this.adsDisplay = adsDisplay;
    }

    public boolean isAdsAudio() {
        return adsAudio;
    }

    public void setAdsAudio(boolean adsAudio) {
        this.adsAudio = adsAudio;
    }

    public boolean isTooManyDevices() {
        return tooManyDevices;
    }

    public void setTooManyDevices(boolean tooManyDevices) {
        this.tooManyDevices = tooManyDevices;
    }

    public boolean isCanSuscribe() {
        return canSuscribe;
    }

    public void setCanSuscribe(boolean canSuscribe) {
        this.canSuscribe = canSuscribe;
    }

    public int getRadioSkips() {
        return radioSkips;
    }

    public void setRadioSkips(int radioSkips) {
        this.radioSkips = radioSkips;
    }

    public boolean isLossless() {
        return lossless;
    }

    public void setLossless(boolean lossless) {
        this.lossless = lossless;
    }

    public boolean isPreview() {
        return preview;
    }

    public void setPreview(boolean preview) {
        this.preview = preview;
    }

    public boolean isRadio() {
        return radio;
    }

    public void setRadio(boolean radio) {
        this.radio = radio;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Options{" +
                "streaming=" + streaming +
                ", streamingDuration=" + streamingDuration +
                ", offline=" + offline +
                ", hq=" + hq +
                ", adsDisplay=" + adsDisplay +
                ", adsAudio=" + adsAudio +
                ", tooManyDevices=" + tooManyDevices +
                ", canSuscribe=" + canSuscribe +
                ", radioSkips=" + radioSkips +
                ", lossless=" + lossless +
                ", preview=" + preview +
                ", radio=" + radio +
                ", type='" + type + '\'' +
                '}';
    }
}
