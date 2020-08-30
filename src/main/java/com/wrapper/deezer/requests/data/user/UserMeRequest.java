package com.wrapper.deezer.requests.data.user;

import com.wrapper.deezer.exceptions.DeezerException;
import com.wrapper.deezer.models.data.user.User;
import com.wrapper.deezer.requests.data.AbstractDataRequest;

import java.io.IOException;
import java.text.ParseException;

public class UserMeRequest extends AbstractDataRequest<User> {

    public UserMeRequest(UserMeRequest.Builder builder) {
        super(builder);
    }

    @Override
    public User execute() throws IOException, DeezerException, ParseException {
        return get().as(User.class);
    }

    public static class Builder extends AbstractDataRequest.Builder<User, UserMeRequest.Builder>{

        public Builder() {
            super();
            addSegmentToPath("user");
            addSegmentToPath("me");
        }

        @Override
        protected Builder self() {
            return this;
        }

        @Override
        public UserMeRequest build() {
            return new UserMeRequest(this);
        }
    }
}
