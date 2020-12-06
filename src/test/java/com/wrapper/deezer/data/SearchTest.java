package com.wrapper.deezer.data;

import com.wrapper.deezer.MyTest;
import com.wrapper.deezer.exceptions.DeezerApiException;
import com.wrapper.deezer.models.Page;
import com.wrapper.deezer.models.data.track.Track12;
import com.wrapper.deezer.requests.data.search.AdvancedQuery;
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
