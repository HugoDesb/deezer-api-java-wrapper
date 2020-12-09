package io.github.hugodesb.requests.data.artist.methods;

import com.google.gson.reflect.TypeToken;
import io.github.hugodesb.exceptions.DeezerApiException;
import io.github.hugodesb.models.Page;
import io.github.hugodesb.models.data.track.TrackTop;
import io.github.hugodesb.requests.AbstractRequest;
import io.github.hugodesb.requests.data.AbstractPaginatedDataRequest;
import org.apache.hc.core5.http.ParseException;

import java.io.IOException;

public class ArtistTopRequest extends AbstractPaginatedDataRequest<TrackTop> {

    private ArtistTopRequest(final Builder builder) {
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
    public Page<TrackTop> execute() throws IOException, DeezerApiException, ParseException {
        return matchTo(new TypeToken<Page<TrackTop>>() {
        }.getType());
    }

    public static final class Builder extends AbstractPaginatedDataRequest.Builder<TrackTop, Builder> {

        public Builder(AbstractRequest.Builder builder) {
            super(builder);
            addSegmentToPath("top");
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
        public ArtistTopRequest build() {
            return new ArtistTopRequest(this);
        }
    }
}
