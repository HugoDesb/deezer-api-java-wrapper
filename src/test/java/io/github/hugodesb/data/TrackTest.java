package io.github.hugodesb.data;

import io.github.hugodesb.MyTest;
import io.github.hugodesb.exceptions.DeezerApiException;
import io.github.hugodesb.models.data.track.Track;
import org.apache.hc.core5.http.ParseException;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class TrackTest implements MyTest {

    @Test
    public void shouldReturnTrack() throws ParseException, DeezerApiException, IOException {
        Track ret = DEEZER_API.track(sevenNationArmyId).build().execute();
        Assert.assertNotNull(ret);
    }

    @Test
    public void shouldUpdateTrack() throws ParseException, DeezerApiException, IOException {
        Boolean ret = DEEZER_API.track(-285992881L).actions(OFFLINE_TOKEN).update().setTitle("Dub Invaders").build().execute();
        Assert.assertNotNull(ret);
    }

    @Test
    public void shouldDeleteTrack() throws ParseException, DeezerApiException, IOException {
        Boolean ret = DEEZER_API.track(-285992051L).actions(OFFLINE_TOKEN).delete().build().execute();
        Assert.assertNotNull(ret);
    }

}
