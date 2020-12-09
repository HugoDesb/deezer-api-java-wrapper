package io.github.hugodesb.data;

import io.github.hugodesb.MyTest;
import io.github.hugodesb.exceptions.DeezerApiException;
import io.github.hugodesb.exceptions.detailled.DataNotFoundException;
import io.github.hugodesb.models.Page;
import io.github.hugodesb.models.data.album.Album4;
import io.github.hugodesb.models.data.artist.Artist;
import io.github.hugodesb.models.data.artist.Artist4;
import io.github.hugodesb.models.data.comments.Comment2;
import io.github.hugodesb.models.data.playlist.Playlist2;
import io.github.hugodesb.models.data.track.TrackRadio;
import io.github.hugodesb.models.data.track.TrackTop;
import io.github.hugodesb.models.data.user.User2;
import org.apache.hc.core5.http.ParseException;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class ArtistRequestTest implements MyTest {

    public static final Long artistEzekiel = 681L;
    public static final Long nonExistingArtist = 0L;
    public static final String albumEzekielJSON = "{\"id\":681,\"name\":\"EZ3kiel\",\"link\":\"https:\\/\\/www.deezer.com\\/artist\\/681\",\"share\":\"https:\\/\\/www.deezer.com\\/artist\\/681?utm_source=deezer&utm_content=artist-681&utm_term=0_1606680470&utm_medium=web\",\"picture\":\"https:\\/\\/api.deezer.com\\/artist\\/681\\/image\",\"picture_small\":\"https:\\/\\/cdns-images.dzcdn.net\\/images\\/artist\\/690df46f34e01131fb0bb681287dd85b\\/56x56-000000-80-0-0.jpg\",\"picture_medium\":\"https:\\/\\/cdns-images.dzcdn.net\\/images\\/artist\\/690df46f34e01131fb0bb681287dd85b\\/250x250-000000-80-0-0.jpg\",\"picture_big\":\"https:\\/\\/cdns-images.dzcdn.net\\/images\\/artist\\/690df46f34e01131fb0bb681287dd85b\\/500x500-000000-80-0-0.jpg\",\"picture_xl\":\"https:\\/\\/cdns-images.dzcdn.net\\/images\\/artist\\/690df46f34e01131fb0bb681287dd85b\\/1000x1000-000000-80-0-0.jpg\",\"nb_album\":13,\"nb_fan\":56816,\"radio\":true,\"tracklist\":\"https:\\/\\/api.deezer.com\\/artist\\/681\\/top?limit=50\",\"type\":\"artist\"}";
    public static Long albumFanPOM = 1897562882L;
    public static final Long albumEzekiel = 123235962L;
    public static Long albumCommentEzekiel = 2217021602L;
    public static String commentText = "comment_test_text";

    @Test
    public void shouldReturnArtist() {
        try {
            Artist ret = DEEZER_API.artist(artistEzekiel).build().execute();


            Artist fromSample = parser.fromJson(albumEzekielJSON, Artist.class);

            Assert.assertEquals(ret, fromSample);

        } catch (DeezerApiException | IOException | ParseException e) {
            e.printStackTrace();
        }
    }

    @Test(expected = DataNotFoundException.class)
    public void shouldThrowDataNotFoundException() throws ParseException, DeezerApiException, IOException {
        Artist ret = DEEZER_API.artist(nonExistingArtist).build().execute();


        Artist fromSample = parser.fromJson(albumEzekielJSON, Artist.class);

        Assert.assertEquals(ret, fromSample);

    }

    @Test
    public void shouldReturnArtistAlbum() {
        try {
            Page<Album4> ret = DEEZER_API.artist(artistEzekiel).albums().build().execute();

            Assert.assertEquals("The LUX album wasn't found", 1, ret.getData().stream().filter(album4 -> album4.getId().equals(albumEzekiel)).count());

        } catch (DeezerApiException | IOException | ParseException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void shouldReturnArtistComments() {
        try {
            Page<Comment2> ret = DEEZER_API.artist(artistEzekiel).comments().build().execute();

            Assert.assertNotNull("The first comment is null", ret.getData().stream().findFirst());

        } catch (DeezerApiException | IOException | ParseException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void shouldReturnArtistFans() {
        try {
            Page<User2> ret =
                    DEEZER_API.artist(artistEzekiel).fans().build().execute();

            Assert.assertNotNull("The fisrt fan is null", ret.getData().stream().findFirst());
        } catch (DeezerApiException | IOException | ParseException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void shouldReturnArtistPlaylist() {
        try {
            Page<Playlist2> ret = DEEZER_API.artist(artistEzekiel).playlists().build().execute();

            Assert.assertNotNull("The first playlist is null", ret.getData().stream().findFirst());

        } catch (DeezerApiException | IOException | ParseException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void shouldReturnArtistRadio() {
        try {
            Page<TrackRadio> ret = DEEZER_API.artist(artistEzekiel).radio().build().execute();

            Assert.assertNotNull("The first radio track is null", ret.getData().stream().findFirst());
        } catch (DeezerApiException | IOException | ParseException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void shouldReturnArtistTop() {
        try {
            Page<TrackTop> ret = DEEZER_API.artist(artistEzekiel).top().build().execute();

            Assert.assertNotNull("The first top track is null", ret.getData().stream().findFirst());

        } catch (DeezerApiException | IOException | ParseException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void shouldReturnArtistRelated() {
        try {
            Page<Artist4> ret = DEEZER_API.artist(artistEzekiel).related().build().execute();

            Assert.assertNotNull("The first related artist track is null", ret.getData().stream().findFirst());

        } catch (DeezerApiException | IOException | ParseException e) {
            e.printStackTrace();
        }
    }
}
