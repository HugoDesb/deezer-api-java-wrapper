package com.wrapper.deezer.requests.authorization.server_side;

import com.wrapper.deezer.enums.Output;
import com.wrapper.deezer.exceptions.DeezerApiException;
import com.wrapper.deezer.models.Credentials;
import com.wrapper.deezer.requests.AbstractRequest;
import com.wrapper.deezer.requests.authorization.AbstractAuthorizationRequest;
import org.apache.hc.core5.http.ParseException;

import java.io.IOException;

public class AuthorisationServerSideTokenRequest extends AbstractAuthorizationRequest<Credentials> {

    public AuthorisationServerSideTokenRequest(AbstractRequest.Builder<Credentials, ?> builder) {
        super(builder);
    }


    /**
     * Synchronously executes the request
     *
     * @return the data
     * @throws IOException        Exception related to the handling of the http protocol
     * @throws DeezerApiException See <a href="https://developers.deezer.com/api/errors"></>
     * @throws ParseException     if the data returned doesn't match the target object (There may be an error in the models then ?)
     */
    @Override
    public Credentials execute() throws IOException, DeezerApiException, ParseException {
        return matchTo(Credentials.class);
    }

    public static final class Builder extends AbstractAuthorizationRequest.Builder<Credentials, AuthorisationServerSideTokenRequest.Builder> {

        public Builder(String appId, String secretKey, String code) {
            super(appId);
            assert (secretKey != null && code != null);
            assert (!secretKey.isEmpty() && !code.isEmpty());
            setQueryParameter("secret", secretKey);
            setQueryParameter("code", code);
        }

        /**
         * Set the output format
         *
         * @param output the desired output format
         * @return The request builder up to that point
         */
        public Builder setOutput(Output output) {
            setQueryParameter("output", output.getValue());
            return self();
        }

        @Override
        protected Builder self() {
            return this;
        }

        /**
         * Builds the request
         *
         * @return the request
         */
        @Override
        public AuthorisationServerSideTokenRequest build() {
            return new AuthorisationServerSideTokenRequest(this);
        }
    }
}
