package com.wrapper.deezer.models.data.options;

import com.google.gson.annotations.SerializedName;

public class Options {
    private boolean streaming;
    @SerializedName("streaming_duration")
    private int streamingDuration;
    private boolean offline;
    private boolean hq;
    @SerializedName("ads_display")
    private boolean adsDisplay;
    @SerializedName("ads_audio")
    private boolean adsAudio;
    @SerializedName("too_many_devices")
    private boolean tooManyDevices;
    @SerializedName("can_subscribe")
    private boolean canSubscribe;
    @SerializedName("radio_skips")
    private int radioSkips;
    private boolean lossless;
    private boolean preview;
    private boolean radio;
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

    public boolean isCanSubscribe() {
        return canSubscribe;
    }

    public void setCanSubscribe(boolean canSubscribe) {
        this.canSubscribe = canSubscribe;
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
                ", canSubscribe=" + canSubscribe +
                ", radioSkips=" + radioSkips +
                ", lossless=" + lossless +
                ", preview=" + preview +
                ", radio=" + radio +
                ", type='" + type + '\'' +
                '}';
    }
}
