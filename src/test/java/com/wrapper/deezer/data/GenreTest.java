package com.wrapper.deezer.data;

import com.wrapper.deezer.models.DataContainer;
import com.wrapper.deezer.MyTest;
import com.wrapper.deezer.exceptions.DeezerApiException;
import com.wrapper.deezer.models.Page;
import com.wrapper.deezer.models.data.artist.Artist9;
import com.wrapper.deezer.models.data.genre.Genre;
import com.wrapper.deezer.models.data.podcast.Podcast4;
import com.wrapper.deezer.models.data.radio.Radio2;
import org.apache.hc.core5.http.ParseException;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class GenreTest implements MyTest {

    @Test
    public void shouldReturnGenres() throws ParseException, DeezerApiException, IOException {
        DataContainer<Genre> ret = DEEZER_API.genres().build().execute();
        Assert.assertNotNull(ret);
    }

    @Test
    public void shouldReturnEditorialOne() throws ParseException, DeezerApiException, IOException {
        Genre ret = DEEZER_API.genres().number(genreId).build().execute();
        Assert.assertNotNull(ret);
    }

    @Test
    public void shouldReturnEditorial() throws ParseException, DeezerApiException, IOException {
        Genre ret = DEEZER_API.genre(genreId).build().execute();
        Assert.assertNotNull(ret);
    }

    @Test
    public void shouldReturnEditorialCharts() throws ParseException, DeezerApiException, IOException {
        DataContainer<Artist9> ret = DEEZER_API.genre(genreId).artists().build().execute();
        Assert.assertNotNull(ret);
    }

    @Test
    public void shouldReturnEditorialReleases() throws ParseException, DeezerApiException, IOException {
        Page<Podcast4> ret = DEEZER_API.genre(genreId).podcasts().build().execute();
        Assert.assertNotNull(ret);
    }

    @Test
    public void shouldReturnGenreSelection() throws ParseException, DeezerApiException, IOException {
        DataContainer<Radio2> ret = DEEZER_API.genre(genreId).radios().build().execute();
        Assert.assertNotNull(ret);
    }
}
