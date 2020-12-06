package com.wrapper.deezer.data;

import com.wrapper.deezer.MyTest;
import com.wrapper.deezer.exceptions.DeezerApiException;
import com.wrapper.deezer.models.Page;
import com.wrapper.deezer.models.data.album.Album5;
import com.wrapper.deezer.models.data.artist.Artist7;
import com.wrapper.deezer.models.data.chart.Chart;
import com.wrapper.deezer.models.data.playlist.Playlist3;
import com.wrapper.deezer.models.data.podcast.Podcast2;
import com.wrapper.deezer.models.data.track.Track5;
import org.apache.hc.core5.http.ParseException;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class ChartRequestTest implements MyTest {

    @Test
    public void shouldReturnChart(){
        try {
            Page<Chart> chart = DEEZER_API.chart().build().execute();

            Assert.assertNotNull(chart);

        } catch (IOException | DeezerApiException | ParseException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void shouldReturnChartAlbums(){
        try {
            Page<Album5> chart = DEEZER_API.chart().albums().build().execute();

            Assert.assertNotNull(chart);

        } catch (IOException | DeezerApiException | ParseException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void shouldReturnChartArtists(){
        try {
            Page<Artist7> chart = DEEZER_API.chart().artists().build().execute();

            Assert.assertNotNull(chart);

        } catch (IOException | DeezerApiException | ParseException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void shouldReturnChartPlaylists(){
        try {
            Page<Playlist3> chart = DEEZER_API.chart().playlists().build().execute();

            Assert.assertNotNull(chart);

        } catch (IOException | DeezerApiException | ParseException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void shouldReturnChartPodcasts(){
        try {
            Page<Podcast2> chart = DEEZER_API.chart().podcasts().build().execute();

            Assert.assertNotNull(chart);

        } catch (IOException | DeezerApiException | ParseException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void shouldReturnChartTracks(){
        try {
            Page<Track5> chart = DEEZER_API.chart().tracks().build().execute();

            Assert.assertNotNull(chart);

        } catch (IOException | DeezerApiException | ParseException e) {
            e.printStackTrace();
        }
    }
}
