package io.github.hugodesb.data;

import io.github.hugodesb.models.DataContainer;
import io.github.hugodesb.MyTest;
import io.github.hugodesb.exceptions.DeezerApiException;
import io.github.hugodesb.models.Page;
import io.github.hugodesb.models.data.radio.Radio;
import io.github.hugodesb.models.data.radio.Radio2;
import io.github.hugodesb.models.data.radio.RadiosByGenre;
import io.github.hugodesb.models.data.track.Track11;
import org.apache.hc.core5.http.ParseException;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class RadioTest implements MyTest {

    @Test
    public void shouldReturnRadios() throws ParseException, DeezerApiException, IOException {
        DataContainer<Radio2> ret = DEEZER_API.radios().build().execute();
        Assert.assertNotNull(ret);
    }

    @Test
    public void shouldReturnRadioOne() throws ParseException, DeezerApiException, IOException {
        Radio ret = DEEZER_API.radio(radioId).build().execute();
        Assert.assertNotNull(ret);
    }

    @Test
    public void shouldReturnRadioTracks() throws ParseException, DeezerApiException, IOException {
        Page<Track11> ret = DEEZER_API.radio(radioId).tracks().build().execute();
        Assert.assertNotNull(ret);
    }

    @Test
    public void shouldReturnRadiosByGenre() throws ParseException, DeezerApiException, IOException {
        DataContainer<RadiosByGenre> ret = DEEZER_API.radios().genres().build().execute();
        Assert.assertNotNull(ret);
    }

    @Test
    public void shouldReturnPersonalRadiosByGenre() throws ParseException, DeezerApiException, IOException {
        Page<Radio2> ret = DEEZER_API.radios().lists().build().execute();
        Assert.assertNotNull(ret);
    }

    @Test
    public void shouldReturnTopRadios() throws ParseException, DeezerApiException, IOException {
        Page<Radio2> ret = DEEZER_API.radios().top().build().execute();
        Assert.assertNotNull(ret);
    }
}
