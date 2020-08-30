package com.wrapper.deezer.requests.authorization.server_side;


import com.wrapper.deezer.enums.Permissions;
import com.wrapper.deezer.exceptions.DeezerException;
import com.wrapper.deezer.requests.authorization.AbstractAuthorizationRequest;
import com.wrapper.deezer.requests.data.chart.ChartRequest;

import java.io.IOException;
import java.net.URI;
import java.text.ParseException;
import java.util.*;
import java.util.stream.Collectors;

public final class AuthorizationServerSideUriRequest extends AbstractAuthorizationRequest<URI> {


    public AuthorizationServerSideUriRequest(Builder builder) {
        super(builder);
    }

    public URI execute() throws IOException, DeezerException, ParseException {
        return getURI();
    }

    public static final class Builder extends AbstractAuthorizationRequest.Builder<URI, Builder> {

        private Set<Permissions> permissionsList;

        public Builder(final String app_id, final URI redirectUri) {
            super(app_id);
            assert redirectUri != null;
            setQueryParameter("redirect_uri", redirectUri);

            this.permissionsList = new HashSet<>();
            this.permissionsList.add(Permissions.BASIC_ACCESS);
        }

        public Builder addPermisisons(Permissions ... permissions){
            permissionsList.addAll(Arrays.asList(permissions));
            return self();
        }

        public AuthorizationServerSideUriRequest build(){
            // permissions to a single string of permissions, comma separated
            String permissionsCommaSeparated = permissionsList.stream()
                    .map((perm)->{
                        return perm.getValue();
                    })
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
