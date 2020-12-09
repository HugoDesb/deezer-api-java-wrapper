package io.github.hugodesb.data;

import io.github.hugodesb.MyTest;
import io.github.hugodesb.exceptions.DeezerApiException;
import io.github.hugodesb.models.data.IdObject;
import org.apache.hc.core5.http.ParseException;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class CommentTest implements MyTest {

    public static final Long albumPOM = 172201832L;

    @Test
    public void testDelete(){
        Long id = commentAlbum();
        try {
            Boolean success = DEEZER_API.comment(id).actions(OFFLINE_TOKEN).delete().build().execute();
            Assert.assertTrue(success);
        } catch (IOException | DeezerApiException | ParseException e) {
            e.printStackTrace();
        }
    }

    public Long commentAlbum(){
        try {
            IdObject idObject = DEEZER_API.album(albumPOM).comments().actions(OFFLINE_TOKEN).comment("sample_comment").build().execute();
            return idObject.getId();
        } catch (IOException | DeezerApiException | ParseException e) {
            e.printStackTrace();
        }
        return null;
    }
}
