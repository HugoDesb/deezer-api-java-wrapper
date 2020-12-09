package io.github.hugodesb.requests.data.search.methods;

import com.google.gson.reflect.TypeToken;
import io.github.hugodesb.exceptions.DeezerApiException;
import io.github.hugodesb.models.Page;
import io.github.hugodesb.models.data.album.Album8;
import io.github.hugodesb.requests.data.search.AbstractSearchRequest;
import io.github.hugodesb.requests.data.search.SearchRequest;
import org.apache.hc.core5.http.ParseException;

import java.io.IOException;

public class SearchAlbumRequest extends AbstractSearchRequest<Album8> {

    public SearchAlbumRequest(Builder builder) {
        super(builder);
    }

    /**
     * Synchronously executes the request
     *
     * @return the data
     * @throws IOException        Exception related to the handling of the http protocol
     * @throws DeezerApiException See <a href="https://developers.deezer.com/api/errors"></>
     * @throws ParseException     if the data returned doesn't match the target object (There may be an error in the models then ?)
     */
    @Override
    public Page<Album8> execute() throws IOException, DeezerApiException, ParseException {
        return matchTo(new TypeToken<Page<Album8>>() {
        }.getType());
    }

    public static class Builder extends AbstractSearchRequest.Builder<Album8, SearchAlbumRequest.Builder> {

        public Builder(SearchRequest.Builder builder) {
            super(builder);
            addSegmentToPath("album");
        }

        @Override
        protected Builder self() {
            return this;
        }

        /**
         * Builds the request
         *
         * @return the request
         */
        @Override
        public SearchAlbumRequest build() {
            return new SearchAlbumRequest(this);
        }
    }
}
