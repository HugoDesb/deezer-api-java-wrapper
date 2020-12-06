package com.wrapper.deezer.requests.authorization.server_side;


import com.wrapper.deezer.enums.Permissions;
import com.wrapper.deezer.exceptions.DeezerApiException;
import com.wrapper.deezer.requests.authorization.AbstractAuthorizationRequest;
import org.apache.hc.core5.http.ParseException;

import java.io.IOException;
import java.net.URI;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public final class AuthorizationServerSideUriRequest extends AbstractAuthorizationRequest<URI> {


    public AuthorizationServerSideUriRequest(Builder builder) {
        super(builder);
    }

    /**
     * Synchronously executes the request
     *
     * @return the data
     */
    @Override
    public URI execute() {
        return getURI();
    }

    public static final class Builder extends AbstractAuthorizationRequest.Builder<URI, Builder> {

        private final Set<Permissions> permissionsList;

        public Builder(final String app_id, final URI redirectUri) {
            super(app_id);
            assert redirectUri != null;
            setQueryParameter("redirect_uri", redirectUri);

            this.permissionsList = new HashSet<>();
            this.permissionsList.add(Permissions.BASIC_ACCESS);
        }

        /**
         * Add permissions to this authorization Request
         *
         * @param permissions a suite of {@link Permissions}
         * @return this
         */
        public Builder addPermissions(Permissions... permissions) {
            permissionsList.addAll(Arrays.asList(permissions));
            return self();
        }

        /**
         * Builds the request
         *
         * @return the {@link AuthorizationServerSideUriRequest} request
         */
        public AuthorizationServerSideUriRequest build() {
            // permissions to a single string of permissions, comma separated
            String permissionsCommaSeparated = permissionsList.stream()
                    .map(Permissions::getValue)
                    .collect(Collectors.joining(","));
            // set permissions as a parameter
            setQueryParameter("perms", permissionsCommaSeparated);
            addSegmentToPath("oauth");
            addSegmentToPath("auth.php");
            return new AuthorizationServerSideUriRequest(this);
        }

        @Override
        protected Builder self() {
            return this;
        }
    }
}
