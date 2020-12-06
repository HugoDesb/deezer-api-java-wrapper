package com.wrapper.deezer.data;

import com.wrapper.deezer.MyTest;
import com.wrapper.deezer.exceptions.DeezerApiException;
import com.wrapper.deezer.models.data.options.Options;
import org.apache.hc.core5.http.ParseException;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class OptionsTest implements MyTest {
    @Test
    public void shouldReturnOptions() throws ParseException, DeezerApiException, IOException {
        Options ret = DEEZER_API.options().build().execute();
        Assert.assertNotNull(ret);
    }

    @Test
    public void shouldReturnOptionsForUser() throws ParseException, DeezerApiException, IOException {
        Options ret = DEEZER_API.options(OFFLINE_TOKEN).build().execute();
        Assert.assertNotNull(ret);
    }
}
