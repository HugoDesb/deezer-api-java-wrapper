package io.github.hugodesb.data;

import io.github.hugodesb.MyTest;
import io.github.hugodesb.exceptions.DeezerApiException;
import io.github.hugodesb.models.data.infos.Infos;
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
