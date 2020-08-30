package com.wrapper.deezer.data.album;

import com.wrapper.deezer.DeezerApi;
import com.wrapper.deezer.MyTest;
import com.wrapper.deezer.enums.Permissions;
import com.wrapper.deezer.exceptions.DeezerException;
import com.wrapper.deezer.models.data.album.Album;
import com.wrapper.deezer.requests.authorization.server_side.AuthorizationServerSideUriRequest;
import com.wrapper.deezer.requests.data.album.AlbumRequest;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.text.ParseException;

public class AlbumRequestTest implements MyTest<Album> {

    public static Long testAlbumNumber = 302127L;
    public static String testAlbumTitle = "Discovery";


    @Test
    public void getTest(){
        try {
            AlbumRequest ar = DEEZER_API.getAlbum(Long.toString(testAlbumNumber)).build();

            Album a = ar.execute();

            Assert.assertEquals(testAlbumNumber, a.getId());
            Assert.assertEquals(testAlbumTitle, a.getTitle());

        } catch (ParseException | DeezerException | IOException e) {
            e.printStackTrace();
        }

    }
}
