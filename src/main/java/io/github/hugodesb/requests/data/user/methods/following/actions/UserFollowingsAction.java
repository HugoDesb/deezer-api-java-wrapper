package io.github.hugodesb.requests.data.user.methods.following.actions;

import io.github.hugodesb.requests.actions.ActionRequestBoolean;
import io.github.hugodesb.requests.RequestMethod;
import io.github.hugodesb.requests.actions.AbstractAction;
import io.github.hugodesb.requests.data.user.methods.following.UserFollowingsRequest;

public class UserFollowingsAction extends AbstractAction<UserFollowingsRequest.Builder> {
    public UserFollowingsAction(UserFollowingsRequest.Builder builder, String accessToken) {
        super(builder, accessToken);
    }

    /**
     * Follow the specified user
     * @param id the user id
     * @return The request builder up to that point
     */
    public ActionRequestBoolean.Builder follow(Long id) {
        ActionRequestBoolean.Builder builder = new ActionRequestBoolean.Builder(this.builder, RequestMethod.POST);
        builder.setBodyParameter("user_id", id.toString());
        return builder;

    }

    /**
     * Unfollow the specified user
     * @param id the user id
     * @return The request builder up to that point
     */
    public ActionRequestBoolean.Builder unfollow(Long id) {
        ActionRequestBoolean.Builder builder = new ActionRequestBoolean.Builder(this.builder, RequestMethod.DELETE);
        builder.setQueryParameter("user_id", id.toString());
        return builder;
    }
}
