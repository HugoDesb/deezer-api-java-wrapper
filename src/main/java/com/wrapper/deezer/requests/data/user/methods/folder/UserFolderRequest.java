package com.wrapper.deezer.requests.data.user.methods.folder;

import com.google.gson.reflect.TypeToken;
import com.wrapper.deezer.exceptions.DeezerApiException;
import com.wrapper.deezer.models.Page;
import com.wrapper.deezer.models.data.folder.Folder;
import com.wrapper.deezer.requests.actions.ActionRequestIdObject;
import com.wrapper.deezer.requests.RequestMethod;
import com.wrapper.deezer.requests.data.AbstractPaginatedDataRequest;
import com.wrapper.deezer.requests.data.user.UserRequest;
import com.wrapper.deezer.requests.data.user.methods.folder.action.UserFolderAction;
import org.apache.hc.core5.http.ParseException;

import java.io.IOException;

public class UserFolderRequest extends AbstractPaginatedDataRequest<Folder> {
    public UserFolderRequest(Builder builder) {
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
    public Page<Folder> execute() throws IOException, DeezerApiException, ParseException {
        return matchTo(new TypeToken<Page<Folder>>() {
        }.getType());
    }

    public static class Builder extends AbstractPaginatedDataRequest.Builder<Folder, UserFolderRequest.Builder> {

        public Builder(UserRequest.Builder builder, String accessToken) {
            super(builder);
            setAccessToken(accessToken);
            addSegmentToPath("folders");
        }

        public ActionRequestIdObject.Builder create(String title) {
            ActionRequestIdObject.Builder builder = new ActionRequestIdObject.Builder(this, RequestMethod.POST);
            builder.setQueryParameter("title", title);
            return builder;
        }

        /**
         * Access the possible actions
         *
         * @param access_token a valid access token
         * @return an actions gateway
         */
        public UserFolderAction actions(String access_token) {
            return new UserFolderAction(this, access_token);
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
        public UserFolderRequest build() {
            return new UserFolderRequest(this);
        }
    }
}
