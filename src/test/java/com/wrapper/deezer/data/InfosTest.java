package com.wrapper.deezer.data;

import com.wrapper.deezer.MyTest;
import com.wrapper.deezer.exceptions.DeezerApiException;
import com.wrapper.deezer.models.data.infos.Infos;
import org.apache.hc.core5.http.ParseException;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class InfosTest implements MyTest {

    @Test
    public void shouldReturnInfos() throws ParseException, DeezerApiException, IOException {
        Infos ret = DEEZER_API.infos().build().execute();
        Assert.assertNotNull(ret);
    }
}
