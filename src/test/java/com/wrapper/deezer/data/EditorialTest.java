package com.wrapper.deezer.data;

import com.wrapper.deezer.MyTest;
import com.wrapper.deezer.exceptions.DeezerApiException;
import com.wrapper.deezer.models.Page;
import com.wrapper.deezer.models.data.album.Album6;
import com.wrapper.deezer.models.data.album.Album7;
import com.wrapper.deezer.models.data.chart.Chart;
import com.wrapper.deezer.models.data.editorial.Editorial;
import org.apache.hc.core5.http.ParseException;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class EditorialTest implements MyTest {

    @Test
    public void shouldReturnEditorials() throws ParseException, DeezerApiException, IOException {
        Page<Editorial> ret = DEEZER_API.editorials().build().execute();

        Assert.assertNotNull(ret);
    }

    @Test
    public void shouldReturnEditorialOne() throws ParseException, DeezerApiException, IOException {
        Editorial ret = DEEZER_API.editorials().number(editorialId).build().execute();

        Assert.assertNotNull(ret);
    }

    @Test
    public void shouldReturnEditorial() throws ParseException, DeezerApiException, IOException {
        Editorial ret = DEEZER_API.editorial(editorialId).build().execute();
        Assert.assertNotNull(ret);
    }

    @Test
    public void shouldReturnEditorialCharts() throws ParseException, DeezerApiException, IOException {
        Chart ret = DEEZER_API.editorial(editorialId).charts().build().execute();
        Assert.assertNotNull(ret);
    }

    @Test
    public void shouldReturnEditorialReleases() throws ParseException, DeezerApiException, IOException {
        Page<Album7> ret = DEEZER_API.editorial(editorialId).releases().build().execute();
        Assert.assertNotNull(ret);
    }

    @Test
    public void shouldReturnEditorialSelection() throws ParseException, DeezerApiException, IOException {
        Page<Album6> ret = DEEZER_API.editorial(editorialId).selection().build().execute();
        Assert.assertNotNull(ret);
    }


}
