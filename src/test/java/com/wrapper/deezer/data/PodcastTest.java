package com.wrapper.deezer.data;

import com.wrapper.deezer.MyTest;
import com.wrapper.deezer.exceptions.DeezerApiException;
import com.wrapper.deezer.models.Page;
import com.wrapper.deezer.models.data.episode.Episode2;
import com.wrapper.deezer.models.data.podcast.Podcast;
import org.apache.hc.core5.http.ParseException;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class PodcastTest implements MyTest {

    @Test
    public void shouldReturnPodcast() throws ParseException, DeezerApiException, IOException {
        Podcast ret = DEEZER_API.podcast(podcastId).build().execute();
        Assert.assertNotNull(ret);
    }

    @Test
    public void shouldReturnPodcastEpisodes() throws ParseException, DeezerApiException, IOException {
        Page<Episode2> ret = DEEZER_API.podcast(podcastId).episodes().build().execute();
        Assert.assertNotNull(ret);
    }
}
