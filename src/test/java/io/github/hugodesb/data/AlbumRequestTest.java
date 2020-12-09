package io.github.hugodesb.data;

import io.github.hugodesb.MyTest;
import io.github.hugodesb.exceptions.DeezerApiException;
import io.github.hugodesb.exceptions.detailled.DataNotFoundException;
import io.github.hugodesb.exceptions.detailled.TooManyRequestsException;
import io.github.hugodesb.models.Page;
import io.github.hugodesb.models.data.IdObject;
import io.github.hugodesb.models.data.album.Album;
import io.github.hugodesb.models.data.comments.Comment2;
import io.github.hugodesb.models.data.track.Track3;
import io.github.hugodesb.models.data.user.User2;
import io.github.hugodesb.requests.data.album.AlbumRequest;
import io.github.hugodesb.requests.data.album.methods.AlbumFansRequest;
import io.github.hugodesb.requests.data.album.methods.AlbumTracksRequest;
import org.apache.hc.core5.http.ParseException;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Optional;

public class AlbumRequestTest implements MyTest {

    public static final Long albumPOM = 172201832L;
    public static final Long nonExistingAlbum = 63L;
    public static final String albumPOMJSON = "{\"id\":172201832,\"title\":\"Down The Rabbit Hole\",\"upc\":\"190296815027\",\"link\":\"https:\\/\\/www.deezer.com\\/album\\/172201832\",\"share\":\"https:\\/\\/www.deezer.com\\/album\\/172201832?utm_source=deezer&utm_content=album-172201832&utm_term=0_1606662703&utm_medium=web\",\"cover\":\"https:\\/\\/api.deezer.com\\/album\\/172201832\\/image\",\"cover_small\":\"https:\\/\\/e-cdns-images.dzcdn.net\\/images\\/cover\\/5dbf287fa152c2e0eafec565072e114b\\/56x56-000000-80-0-0.jpg\",\"cover_medium\":\"https:\\/\\/e-cdns-images.dzcdn.net\\/images\\/cover\\/5dbf287fa152c2e0eafec565072e114b\\/250x250-000000-80-0-0.jpg\",\"cover_big\":\"https:\\/\\/e-cdns-images.dzcdn.net\\/images\\/cover\\/5dbf287fa152c2e0eafec565072e114b\\/500x500-000000-80-0-0.jpg\",\"cover_xl\":\"https:\\/\\/e-cdns-images.dzcdn.net\\/images\\/cover\\/5dbf287fa152c2e0eafec565072e114b\\/1000x1000-000000-80-0-0.jpg\",\"md5_image\":\"5dbf287fa152c2e0eafec565072e114b\",\"genre_id\":85,\"genres\":{\"data\":[{\"id\":85,\"name\":\"Alternative\",\"picture\":\"https:\\/\\/api.deezer.com\\/genre\\/85\\/image\",\"type\":\"genre\"},{\"id\":86,\"name\":\"Pop Ind\\u00e9\",\"picture\":\"https:\\/\\/api.deezer.com\\/genre\\/86\\/image\",\"type\":\"genre\"},{\"id\":87,\"name\":\"Rock ind\\u00e9\",\"picture\":\"https:\\/\\/api.deezer.com\\/genre\\/87\\/image\",\"type\":\"genre\"}]},\"label\":\"Mattan Records\",\"nb_tracks\":1,\"duration\":195,\"fans\":1,\"rating\":0,\"release_date\":\"2019-05-17\",\"record_type\":\"single\",\"available\":true,\"tracklist\":\"https:\\/\\/api.deezer.com\\/album\\/172201832\\/tracks\",\"explicit_lyrics\":false,\"explicit_content_lyrics\":6,\"explicit_content_cover\":2,\"contributors\":[{\"id\":65908352,\"name\":\"POM\",\"link\":\"https:\\/\\/www.deezer.com\\/artist\\/65908352\",\"share\":\"https:\\/\\/www.deezer.com\\/artist\\/65908352?utm_source=deezer&utm_content=artist-65908352&utm_term=0_1606662703&utm_medium=web\",\"picture\":\"https:\\/\\/api.deezer.com\\/artist\\/65908352\\/image\",\"picture_small\":\"https:\\/\\/e-cdns-images.dzcdn.net\\/images\\/artist\\/5dbf287fa152c2e0eafec565072e114b\\/56x56-000000-80-0-0.jpg\",\"picture_medium\":\"https:\\/\\/e-cdns-images.dzcdn.net\\/images\\/artist\\/5dbf287fa152c2e0eafec565072e114b\\/250x250-000000-80-0-0.jpg\",\"picture_big\":\"https:\\/\\/e-cdns-images.dzcdn.net\\/images\\/artist\\/5dbf287fa152c2e0eafec565072e114b\\/500x500-000000-80-0-0.jpg\",\"picture_xl\":\"https:\\/\\/e-cdns-images.dzcdn.net\\/images\\/artist\\/5dbf287fa152c2e0eafec565072e114b\\/1000x1000-000000-80-0-0.jpg\",\"radio\":false,\"tracklist\":\"https:\\/\\/api.deezer.com\\/artist\\/65908352\\/top?limit=50\",\"type\":\"artist\",\"role\":\"Main\"}],\"artist\":{\"id\":65908352,\"name\":\"POM\",\"picture\":\"https:\\/\\/api.deezer.com\\/artist\\/65908352\\/image\",\"picture_small\":\"https:\\/\\/e-cdns-images.dzcdn.net\\/images\\/artist\\/5dbf287fa152c2e0eafec565072e114b\\/56x56-000000-80-0-0.jpg\",\"picture_medium\":\"https:\\/\\/e-cdns-images.dzcdn.net\\/images\\/artist\\/5dbf287fa152c2e0eafec565072e114b\\/250x250-000000-80-0-0.jpg\",\"picture_big\":\"https:\\/\\/e-cdns-images.dzcdn.net\\/images\\/artist\\/5dbf287fa152c2e0eafec565072e114b\\/500x500-000000-80-0-0.jpg\",\"picture_xl\":\"https:\\/\\/e-cdns-images.dzcdn.net\\/images\\/artist\\/5dbf287fa152c2e0eafec565072e114b\\/1000x1000-000000-80-0-0.jpg\",\"tracklist\":\"https:\\/\\/api.deezer.com\\/artist\\/65908352\\/top?limit=50\",\"type\":\"artist\"},\"type\":\"album\",\"tracks\":{\"data\":[{\"id\":1075287922,\"readable\":true,\"title\":\"Down The Rabbit Hole\",\"title_short\":\"Down The Rabbit Hole\",\"title_version\":\"\",\"link\":\"https:\\/\\/www.deezer.com\\/track\\/1075287922\",\"duration\":195,\"rank\":100000,\"explicit_lyrics\":false,\"explicit_content_lyrics\":6,\"explicit_content_cover\":2,\"preview\":\"https:\\/\\/cdns-preview-3.dzcdn.net\\/stream\\/c-342e4ef601363e7f17ea5cdfc9caa5b7-2.mp3\",\"md5_image\":\"5dbf287fa152c2e0eafec565072e114b\",\"artist\":{\"id\":65908352,\"name\":\"POM\",\"tracklist\":\"https:\\/\\/api.deezer.com\\/artist\\/65908352\\/top?limit=50\",\"type\":\"artist\"},\"type\":\"track\"}]}}";
    public static final Long albumFanPOM = 1897562882L;
    public static final Long albumEzekiel = 123235962L;
    public static final Long albumCommentEzekiel = 2217021602L;
    public static final String commentText = "comment_test_text";


    @Test
    public void shouldReturnAlbum() {
        try {
            AlbumRequest ar = DEEZER_API.album(albumPOM).build();
            Album a = ar.execute();

            Album fromSample = parser.fromJson(albumPOMJSON, Album.class);

            Assert.assertEquals(a, fromSample);

        } catch (DeezerApiException | IOException | ParseException e) {
            e.printStackTrace();
        }
    }

    @Test(expected = DataNotFoundException.class)
    public void shouldThrowDataNotFoundException() throws DeezerApiException, IOException, ParseException {
        AlbumRequest ar = DEEZER_API.album(nonExistingAlbum).build();
        Album a = ar.execute();
    }

    @Ignore
    @Test(expected = TooManyRequestsException.class)
    public void shouldThrowTooManyRequestsException() throws ParseException, DeezerApiException, IOException {

        String notEnough = "not enough to trigger an exception (50/5s)";
        //Enough calls in a limited amount of time will eventually result in deezer throwing a TooManyRequestException
        int tries = 0, count=0, cycle=0;
        Duration duration = Duration.ofSeconds(5);
        LocalDateTime ref = LocalDateTime.now();

        while(tries<=100){
            DEEZER_API.album(albumPOM).actions(OFFLINE_TOKEN).rate(4).build().execute();
            count++;

            if(ref.plus(duration).isBefore(LocalDateTime.now())){
                //change ref
                ref = LocalDateTime.now();
                tries += count;
                System.out.printf("%s request executed in 5s : %s%n", count, notEnough);
                count = 0;
                cycle ++;
            }
        }

        System.err.printf("%s request executed in %ss : no exception were raised%n", tries, cycle*5);

    }

    @Test
    public void shouldReturnFans() {
        try {
            AlbumFansRequest ar = DEEZER_API.album(albumPOM).fans().build();
            Page<User2> hop = ar.execute();

            boolean exists = hop.getData().stream().filter(user2 -> user2.getId().equals(albumFanPOM)).count()==1;

            Assert.assertTrue("No fan with specified id was found", exists);

        } catch (DeezerApiException | IOException | ParseException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void shouldReturnComments() {
        try {
            Page<Comment2> hop =
                    DEEZER_API.album(albumEzekiel)
                            .comments()
                            .build()
                            .execute();

            boolean exists = hop.getData().stream().filter(comment2 -> comment2.getId().equals(albumCommentEzekiel)).count()==1;

            Assert.assertTrue("The comment expected wasn't found", exists);

        } catch (DeezerApiException | IOException | ParseException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void shouldReturnTracks() {
        try {
            AlbumTracksRequest ar = DEEZER_API.album(albumEzekiel).tracks().build();
            Page<Track3> hop = ar.execute();

            Assert.assertEquals("The number of album tracks is wrong", 10, hop.getData().size());

        } catch (DeezerApiException | IOException | ParseException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void shouldPostAComment() {
        try {
            IdObject success =
                    DEEZER_API.album(albumEzekiel)
                            .comments()
                            .actions(OFFLINE_TOKEN)
                            .comment(commentText)
                            .build()
                            .execute();
            Assert.assertNotNull("Failed to create the comment", success);

            Page<Comment2> comments = DEEZER_API.album(albumEzekiel).comments().build().execute();
            Optional<Comment2> comment = comments.getData().stream().filter(comment2 -> comment2.getId().equals(success.getId())).findFirst();
            Assert.assertTrue("The comment expected wasn't found",  comment.isPresent());

            deleteComment(success.getId());
        } catch (DeezerApiException | IOException | ParseException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void shouldRateAlbum(){
        try {
            Boolean success =
                    DEEZER_API.album(albumEzekiel)
                            .actions(OFFLINE_TOKEN)
                            .rate(4)
                            .build()
                            .execute();
            System.out.println(success);
            Assert.assertTrue("Failed to rate the album", success);

        } catch (DeezerApiException | IOException | ParseException e) {
            e.printStackTrace();
        }
    }

    private void deleteComment(Long id){
        Page<Comment2> comments = null;
        try {
            Boolean success = DEEZER_API.comment(id).actions(OFFLINE_TOKEN).delete().build().execute();
        } catch (IOException | DeezerApiException | ParseException e) {
            e.printStackTrace();
        }

    }
}
