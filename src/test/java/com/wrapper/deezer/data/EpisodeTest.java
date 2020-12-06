package com.wrapper.deezer.data;

import com.wrapper.deezer.MyTest;
import com.wrapper.deezer.exceptions.DeezerApiException;
import com.wrapper.deezer.models.data.episode.Episode;
import org.apache.hc.core5.http.ParseException;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class EpisodeTest implements MyTest {

    @Test
    public void shouldReturnEpisode() throws ParseException, DeezerApiException, IOException {
        Episode ret = DEEZER_API.episode(episodeId).build().execute();
        Assert.assertNotNull(ret);
    }

    @Test
    public void shouldSetBookmark() throws ParseException, DeezerApiException, IOException {
        Boolean ret = DEEZER_API.episode(episodeId).actions(OFFLINE_TOKEN).setBookmark(5).build().execute();
        Assert.assertNotNull(ret);
    }

    @Test
    public void shouldDeleteBookmark() throws ParseException, DeezerApiException, IOException {
        Boolean ret = DEEZER_API.episode(episodeId).actions(OFFLINE_TOKEN).deleteBookmark().build().execute();
        Assert.assertNotNull(ret);
    }
}
