package io.github.hugodesb.data;

import io.github.hugodesb.MyTest;
import io.github.hugodesb.exceptions.DeezerApiException;
import io.github.hugodesb.models.Page;
import io.github.hugodesb.models.data.track.Track12;
import io.github.hugodesb.requests.data.search.AdvancedQuery;
import org.apache.hc.core5.http.ParseException;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class SearchTest implements MyTest {

    @Test
    public void shouldReturnSearch() throws ParseException, DeezerApiException, IOException {
        Page<Track12> ret = DEEZER_API.search("seven nation army").build().execute();
        Assert.assertTrue(ret.getData().stream().anyMatch(track12 -> sevenNationArmyId.equals(track12.getId())) );
    }

    @Test
    public void shouldReturnAdvancedSearch() throws ParseException, DeezerApiException, IOException {
        AdvancedQuery aq = new AdvancedQuery();
        aq.byTrack("seven nation army");
        Page<Track12> ret = DEEZER_API.search(aq).build().execute();
        Assert.assertTrue(ret.getData().stream().anyMatch(track12 -> sevenNationArmyId.equals(track12.getId())) );
    }
}
