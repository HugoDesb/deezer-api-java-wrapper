package com.wrapper.deezer.authorization;


import com.wrapper.deezer.MyTest;
import com.wrapper.deezer.enums.Permissions;
import com.wrapper.deezer.exceptions.DeezerApiException;
import com.wrapper.deezer.requests.authorization.server_side.AuthorizationServerSideUriRequest;
import org.apache.hc.core5.http.ParseException;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class AuthorizationServerSideUriTest implements MyTest {

    @Test
    public void mainTest() {
        try {
            URI uri = new URI(REDIRECT_URI);
            AuthorizationServerSideUriRequest request = DEEZER_API.getAuthorizationServerSideUri(APP_ID, uri)
                    .addPermissions(Permissions.BASIC_ACCESS, Permissions.EMAIL)
                    .build();
            System.out.println();
            Assert.assertEquals(request.execute().toString(), "https://connect.deezer.com/oauth/auth.php?app_id=429342&redirect_uri=http%3A%2F%2Flocalhost%3A8080%2Fredirect&perms=email%2Cbasic_access");

        } catch (URISyntaxException e) {
            e.printStackTrace();
        }

    }
}
