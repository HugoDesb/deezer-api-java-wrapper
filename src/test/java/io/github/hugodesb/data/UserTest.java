package io.github.hugodesb.data;

import io.github.hugodesb.MyTest;
import io.github.hugodesb.exceptions.DeezerApiException;
import io.github.hugodesb.models.Page;
import io.github.hugodesb.models.Success;
import io.github.hugodesb.models.data.IdObject;
import io.github.hugodesb.models.data.album.Album12;
import io.github.hugodesb.models.data.album.Album13;
import io.github.hugodesb.models.data.album.Album9;
import io.github.hugodesb.models.data.artist.Artist12;
import io.github.hugodesb.models.data.artist.Artist4;
import io.github.hugodesb.models.data.artist.Artist9;
import io.github.hugodesb.models.data.folder.Folder;
import io.github.hugodesb.models.data.options.Options;
import io.github.hugodesb.models.data.playlist.Playlist3;
import io.github.hugodesb.models.data.podcast.Podcast5;
import io.github.hugodesb.models.data.radio.Radio2;
import io.github.hugodesb.models.data.radio.Radio3;
import io.github.hugodesb.models.data.track.*;
import io.github.hugodesb.models.data.track.*;
import io.github.hugodesb.models.data.user.User;
import io.github.hugodesb.models.data.user.User4;
import org.apache.hc.core5.http.ParseException;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class UserTest implements MyTest {

    @Test
    public void shouldReturnMe() throws ParseException, DeezerApiException, IOException {
        User ret = DEEZER_API.me(OFFLINE_TOKEN).build().execute();
        Assert.assertNotNull(ret);
    }

    @Test
    public void shouldReturnUser() throws ParseException, DeezerApiException, IOException {
        User ret = DEEZER_API.user(USER_ME_ID).build().execute();
        Assert.assertNotNull(ret);
    }

    @Test
    public void shouldReturnUserAlbums() throws ParseException, DeezerApiException, IOException {
        Page<Album9> ret = DEEZER_API.user(USER_ME_ID).albums().build().execute();
        Assert.assertNotNull(ret);
    }

    @Test
    public void shouldAddUserAlbums() throws ParseException, DeezerApiException, IOException {
        Boolean ret = DEEZER_API.user(USER_ME_ID).albums().actions(OFFLINE_TOKEN).fav(albumPOM).build().execute();
        Assert.assertNotNull(ret);
    }
    @Test
    public void shouldRemoveUserAlbums() throws ParseException, DeezerApiException, IOException {
        Boolean ret = DEEZER_API.user(USER_ME_ID).albums().actions(OFFLINE_TOKEN).unfav(albumPOM).build().execute();
        Assert.assertNotNull(ret);
    }

    @Test
    public void shouldReturnUserArtists() throws ParseException, DeezerApiException, IOException {
        Page<Artist12> ret = DEEZER_API.user(USER_ME_ID).artists().build().execute();
        Assert.assertNotNull(ret);
    }

    @Test
    public void shouldAddUserArtists() throws ParseException, DeezerApiException, IOException {
        Boolean ret = DEEZER_API.user(USER_ME_ID).artists().actions(OFFLINE_TOKEN).add(albumPOM).build().execute();
        Assert.assertNotNull(ret);
    }
    @Test
    public void shouldRemoveUserArtists() throws ParseException, DeezerApiException, IOException {
        Boolean ret = DEEZER_API.user(USER_ME_ID).artists().actions(OFFLINE_TOKEN).remove(albumPOM).build().execute();
        Assert.assertNotNull(ret);
    }

    @Test
    public void shouldReturnUserChartsAlbums() throws ParseException, DeezerApiException, IOException {
        Page<Album13> ret = DEEZER_API.user(USER_ME_ID).charts().albums().build().execute();
        Assert.assertNotNull(ret);
    }

    @Test
    public void shouldReturnUserChartsArtists() throws ParseException, DeezerApiException, IOException {
        Page<Artist4> ret = DEEZER_API.user(USER_ME_ID).charts().artists().build().execute();
        Assert.assertNotNull(ret);
    }

    @Test
    public void shouldReturnUserChartsPlaylist() throws ParseException, DeezerApiException, IOException {
        Page<Object> ret = DEEZER_API.user(USER_ME_ID).charts().playlists().build().execute();
        Assert.assertNotNull(ret);
    }

    @Test
    public void shouldReturnUserChartsTracks() throws ParseException, DeezerApiException, IOException {
        Page<Track13> ret = DEEZER_API.user(USER_ME_ID).charts().tracks().build().execute();
        Assert.assertNotNull(ret);
    }

    @Test
    public void shouldReturnUserFlow() throws ParseException, DeezerApiException, IOException {
        Page<Track14> ret = DEEZER_API.user(USER_ME_ID).flow().build().execute();
        Assert.assertNotNull(ret);
    }

    @Test
    public void shouldReturnUserFollowers() throws ParseException, DeezerApiException, IOException {
        Page<User4> ret = DEEZER_API.user(USER_ME_ID).followers().build().execute();
        Assert.assertNotNull(ret);
    }

    @Test
    public void shouldReturnUserFollowings() throws ParseException, DeezerApiException, IOException {
        Page<User4> ret = DEEZER_API.user(USER_ME_ID).followings().build().execute();
        Assert.assertNotNull(ret);
    }

    @Test
    public void shouldFollowDeezerEditor() throws ParseException, DeezerApiException, IOException {
        Boolean ret = DEEZER_API.user(USER_ME_ID).followings().actions(OFFLINE_TOKEN).follow(deezerEditor).build().execute();
        Assert.assertNotNull(ret);
    }

    @Test
    public void shouldUnfollowDeezerEditor() throws ParseException, DeezerApiException, IOException {
        Boolean ret = DEEZER_API.user(USER_ME_ID).followings().actions(OFFLINE_TOKEN).unfollow(deezerEditor).build().execute();
        Assert.assertNotNull(ret);
    }

    @Test
    public void shouldReturnUserFolders() throws ParseException, DeezerApiException, IOException {
        Page<Folder> ret = DEEZER_API.user(USER_ME_ID).folders(OFFLINE_TOKEN).build().execute();
        Assert.assertNotNull(ret);
    }

    @Test
    public void shouldCreateUserFolders() throws ParseException, DeezerApiException, IOException {
        IdObject ret = DEEZER_API.user(USER_ME_ID).folders(OFFLINE_TOKEN).create("Hop").build().execute();
        Assert.assertNotNull(ret);
    }

    @Test
    public void shouldReturnUserHistory() throws ParseException, DeezerApiException, IOException {
        Page<Track15> ret = DEEZER_API.user(USER_ME_ID).history(OFFLINE_TOKEN).build().execute();
        Assert.assertNotNull(ret);
    }

    @Test
    public void shouldSendUserNotification() throws ParseException, DeezerApiException, IOException {
        Success ret = DEEZER_API.user(USER_ME_ID).notifications().actions(OFFLINE_TOKEN).send("Message").build().execute();
        Assert.assertNotNull(ret);
    }

    @Test
    public void shouldReturnUserOptions() throws ParseException, DeezerApiException, IOException {
        Options ret = DEEZER_API.user(USER_ME_ID).options(OFFLINE_TOKEN).build().execute();
        Assert.assertNotNull(ret);
    }

    @Test
    public void shouldReturnUserPersonalSongs() throws ParseException, DeezerApiException, IOException {
        Page<Track16> ret = DEEZER_API.user(USER_ME_ID).personalSongs(OFFLINE_TOKEN).build().execute();
        Assert.assertNotNull(ret);
    }

    @Test
    public void shouldReturnUserPodcasts() throws ParseException, DeezerApiException, IOException {
        Page<Podcast5> ret = DEEZER_API.user(USER_ME_ID).podcasts().build().execute();
        Assert.assertNotNull(ret);
    }

    @Test
    public void shouldFavUserPodcasts() throws ParseException, DeezerApiException, IOException {
        Boolean ret = DEEZER_API.user(USER_ME_ID).podcasts().actions(OFFLINE_TOKEN).fav(momentMeurice).build().execute();
        Assert.assertNotNull(ret);
    }

    @Test
    public void shouldUnfavUserPodcasts() throws ParseException, DeezerApiException, IOException {
        Boolean ret = DEEZER_API.user(USER_ME_ID).podcasts().actions(OFFLINE_TOKEN).unfav(momentMeurice).build().execute();
        Assert.assertNotNull(ret);
    }

    @Test
    public void shouldReturnUserRadios() throws ParseException, DeezerApiException, IOException {
        Page<Radio3> ret = DEEZER_API.user(USER_ME_ID).radios().build().execute();
        Assert.assertNotNull(ret);
    }

    @Test
    public void shouldFavUserRadios() throws ParseException, DeezerApiException, IOException {
        Boolean ret = DEEZER_API.user(USER_ME_ID).radios().actions(OFFLINE_TOKEN).fav(radioElectro).build().execute();
        Assert.assertNotNull(ret);
    }

    @Test
    public void shouldUnFavUserRadios() throws ParseException, DeezerApiException, IOException {
        Boolean ret = DEEZER_API.user(USER_ME_ID).radios().actions(OFFLINE_TOKEN).unfav(radioElectro).build().execute();
        Assert.assertNotNull(ret);
    }

    @Test
    public void shouldReturnUserRecommendationsAlbums() throws ParseException, DeezerApiException, IOException {
        Page<Album12> ret = DEEZER_API.user(USER_ME_ID).recommendations(OFFLINE_TOKEN).albums().build().execute();
        Assert.assertNotNull(ret);
    }
    @Test
    public void shouldReturnUserRecommendationsArtists() throws ParseException, DeezerApiException, IOException {
        Page<Artist9> ret = DEEZER_API.user(USER_ME_ID).recommendations(OFFLINE_TOKEN).artists().build().execute();
        Assert.assertNotNull(ret);
    }

    @Test
    public void shouldReturnUserRecommendationsPlaylist() throws ParseException, DeezerApiException, IOException {
        Page<Playlist3> ret = DEEZER_API.user(USER_ME_ID).recommendations(OFFLINE_TOKEN).playlists().build().execute();
        Assert.assertNotNull(ret);
    }

    @Test
    public void shouldReturnUserRecommendationsRadios() throws ParseException, DeezerApiException, IOException {
        Page<Radio2> ret = DEEZER_API.user(USER_ME_ID).recommendations(OFFLINE_TOKEN).radios().build().execute();
        Assert.assertNotNull(ret);
    }

    @Test
    public void shouldReturnUserRecommendationsTracks() throws ParseException, DeezerApiException, IOException {
        Page<Track18> ret = DEEZER_API.user(USER_ME_ID).recommendations(OFFLINE_TOKEN).tracks().build().execute();
        Assert.assertNotNull(ret);
    }

    @Test
    public void shouldReturnUserTracks() throws ParseException, DeezerApiException, IOException {
        Page<Track17> ret = DEEZER_API.user(USER_ME_ID).tracks().build().execute();
        Assert.assertNotNull(ret);
    }

    @Test
    public void shouldFavTrack() throws ParseException, DeezerApiException, IOException {
        Boolean ret = DEEZER_API.user(USER_ME_ID).tracks().actions(OFFLINE_TOKEN).fav(sevenNationArmyId).build().execute();
        Assert.assertNotNull(ret);
    }

    @Test
    public void shouldUnfavTrack() throws ParseException, DeezerApiException, IOException {
        Boolean ret = DEEZER_API.user(USER_ME_ID).tracks().actions(OFFLINE_TOKEN).unfav(sevenNationArmyId).build().execute();
        Assert.assertNotNull(ret);
    }


}
