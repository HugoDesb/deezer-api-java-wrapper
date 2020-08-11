package com.wrapper.deezer;

import com.wrapper.deezer.requests.authorization.server_side.AuthorisationServerSideTokenRequest;
import com.wrapper.deezer.requests.authorization.server_side.AuthorizationServerSideUriRequest;
import com.wrapper.deezer.requests.data.artist.ArtistRequest;

import java.net.URI;

public class DeezerApi {


    private String app_id;
    private URI redirectURI;
    private String accessToken;

    public static Builder builder(){
        return new Builder();
    }

    public DeezerApi(Builder builder) {
        this.app_id = builder.appId;
        this.redirectURI = builder.redirectURI;
        this.accessToken = builder.accessToken;
    }

    public ArtistRequest.Builder getArtist(String artistId){
        return new ArtistRequest.Builder(artistId);
    }

    public AuthorizationServerSideUriRequest.Builder getAuthorizationServerSideUri(String app_id, URI redirectURI){
        return new AuthorizationServerSideUriRequest.Builder(app_id, redirectURI);
    }

    public AuthorisationServerSideTokenRequest.Builder getAuthorisationServerSideToken(String appId, String secretKey, String code){
        return new AuthorisationServerSideTokenRequest.Builder(appId, secretKey, code);
    }

    public static class Builder {
        private String appId;
        private URI redirectURI;
        private String accessToken;

        public Builder setAppId(String appId) {
            this.appId = appId;
            return this;
        }

        public Builder setRedirectURI(URI redirectURI) {
            this.redirectURI = redirectURI;
            return this;
        }

        public Builder setAccessToken(String accessToken) {
            this.accessToken = accessToken;
            return this;
        }

        public DeezerApi build(){
            return new DeezerApi(this);
        }
    }


}
