package com.wrapper.deezer.requests.authorization.server_side;

import com.wrapper.deezer.enums.Output;
import com.wrapper.deezer.exceptions.DeezerException;
import com.wrapper.deezer.models.Credentials;
import com.wrapper.deezer.requests.AbstractRequest;

import java.io.IOException;
import java.text.ParseException;

import static io.restassured.RestAssured.given;

public class AuthorisationServerSideTokenRequest extends AbstractAuthorizationRequest<Credentials>{

    public AuthorisationServerSideTokenRequest(AbstractRequest.Builder<Credentials, ?> builder) {
        super(builder);
    }

    @Override
    public Credentials execute() throws IOException, DeezerException, ParseException {
        return given().get(getURI()).as(Credentials.class);
    }

    public static final class Builder extends AbstractAuthorizationRequest.Builder<Credentials, AuthorisationServerSideTokenRequest.Builder>{

        public Builder(String appId, String secretKey, String code) {
            super(appId);
            assert (secretKey != null && code != null);
            assert (!secretKey.isEmpty() && !code.isEmpty());
            setQueryParameter("secret",secretKey);
            setQueryParameter("code", code);
        }

        public Builder setOutput(Output output){
            setQueryParameter("output", output.getValue());
            return self();
        }

        @Override
        protected Builder self() {
            return this;
        }

        @Override
        public RequestBehavior<Credentials> build() {
            return new AuthorisationServerSideTokenRequest(this);
        }
    }
}
