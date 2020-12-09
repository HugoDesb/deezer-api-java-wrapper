package io.github.hugodesb.data;

import io.github.hugodesb.MyTest;
import io.github.hugodesb.exceptions.DeezerApiException;
import io.github.hugodesb.models.Page;
import io.github.hugodesb.models.data.episode.Episode2;
import io.github.hugodesb.models.data.podcast.Podcast;
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
