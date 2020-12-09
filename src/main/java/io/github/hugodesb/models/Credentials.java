package io.github.hugodesb.models;

public class Credentials {

    private final String accessToken;
    private final int expires;

    public Credentials(String accessToken, int expires) {
        this.accessToken = accessToken;
        this.expires = expires;
    }

    @Override
    public String toString() {
        return "Credentials{" +
                "accessToken='" + accessToken + '\'' +
                ", expires=" + expires +
                '}';
    }
}
