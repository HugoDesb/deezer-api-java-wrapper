package com.wrapper.deezer.data;

import com.wrapper.deezer.MyTest;
import com.wrapper.deezer.exceptions.DeezerApiException;
import com.wrapper.deezer.models.Page;
import com.wrapper.deezer.models.data.IdObject;
import com.wrapper.deezer.models.data.comments.Comment2;
import com.wrapper.deezer.models.data.playlist.Playlist;
import com.wrapper.deezer.models.data.track.Track9;
import com.wrapper.deezer.models.data.user.User2;
import org.apache.hc.core5.http.ParseException;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class PlaylistTest implements MyTest {

    @Test
    public void shouldReturnPlaylist() throws ParseException, DeezerApiException, IOException {
        Playlist ret = DEEZER_API.playlist(playlistId).build().execute();
        Assert.assertNotNull(ret);
    }

    @Test
    public void shouldDeletePlaylist() throws ParseException, DeezerApiException, IOException {
        IdObject idObject = DEEZER_API.user(USER_ME_ID).playlists().actions(OFFLINE_TOKEN).create("Test").build().execute();
        Boolean ret = DEEZER_API.playlist(idObject.getId()).actions(OFFLINE_TOKEN).delete().build().execute();
        Assert.assertTrue(ret);
    }

    @Test
    public void shouldSeenPlaylist() throws ParseException, DeezerApiException, IOException {
        Boolean ret = DEEZER_API.playlist(playlistId).actions(OFFLINE_TOKEN).seen().build().execute();
        Assert.assertTrue(ret);
    }

    @Test
    public void shouldUpdatePlaylist() throws ParseException, DeezerApiException, IOException {
        Boolean ret = DEEZER_API.playlist(playlistId).actions(OFFLINE_TOKEN).update().build().execute();
        Assert.assertTrue(ret);
    }

    @Test
    public void shouldRatePlaylist() throws ParseException, DeezerApiException, IOException {
        Boolean ret = DEEZER_API.playlist(playlistId).actions(OFFLINE_TOKEN).rate(1).build().execute();
        Assert.assertTrue(ret);

    }

    @Test
    public void shouldReturnPlaylistComments() throws ParseException, DeezerApiException, IOException {
        Page<Comment2> ret = DEEZER_API.playlist(playlistId).comments().build().execute();
        Assert.assertNotNull(ret);
    }

    @Test
    public void shouldAddCommentToPlaylist() throws ParseException, DeezerApiException, IOException {
        IdObject ret = DEEZER_API.playlist(playlistId).comments().actions(OFFLINE_TOKEN).add("sampleComment").build().execute();
        System.out.println(ret);
        Assert.assertNotNull(ret);
        DEEZER_API.comment(ret.getId()).actions(OFFLINE_TOKEN).delete();
    }

    @Test
    public void shouldReturnPlaylistFans() throws ParseException, DeezerApiException, IOException {
        Page<User2> ret = DEEZER_API.playlist(playlistId).fans().build().execute();
        Assert.assertNotNull(ret);
    }

    @Test
    public void shouldReturnPlaylistRadio() throws ParseException, DeezerApiException, IOException {
        Boolean ret = DEEZER_API.playlist(playlistId).radio().build().execute();
        Assert.assertFalse(ret);
    }

    @Test
    public void shouldReturnPlaylistTracks() throws ParseException, DeezerApiException, IOException {
        Page<Track9> ret = DEEZER_API.playlist(playlistId).tracks().build().execute();
        Assert.assertNotNull(ret);
    }

    @Test
    public void shouldAddPlaylistTracks() throws ParseException, DeezerApiException, IOException {
        Boolean ret = DEEZER_API.playlist(playlistId).tracks().actions(OFFLINE_TOKEN).add(932235422L).build().execute();
        Assert.assertNotNull(ret);
    }

    @Test
    public void shouldOrderPlaylistTracks() throws ParseException, DeezerApiException, IOException {
        Boolean ret = DEEZER_API.playlist(playlistId).tracks().actions(OFFLINE_TOKEN).order(932235422L, -285992051L).build().execute();
        Assert.assertNotNull(ret);
    }

    @Test
    public void shouldRemovePlaylistTracks() throws ParseException, DeezerApiException, IOException {
        Boolean ret = DEEZER_API.playlist(playlistId).tracks().actions(OFFLINE_TOKEN).remove(932235422L).build().execute();
        Assert.assertNotNull(ret);
    }


}
