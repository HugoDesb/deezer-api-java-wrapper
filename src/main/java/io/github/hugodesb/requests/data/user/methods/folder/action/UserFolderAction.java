package io.github.hugodesb.requests.data.user.methods.folder.action;

import io.github.hugodesb.requests.actions.ActionRequestBoolean;
import io.github.hugodesb.requests.RequestMethod;
import io.github.hugodesb.requests.actions.AbstractAction;
import io.github.hugodesb.requests.data.user.methods.folder.UserFolderRequest;

public class UserFolderAction extends AbstractAction<UserFolderRequest.Builder> {

    public UserFolderAction(UserFolderRequest.Builder builder, String accessToken) {
        super(builder, accessToken);
    }

    /**
     * Create the folder using the given name
     * @param title the title for the folder
     * @return The request builder up to that point
     */
    public ActionRequestBoolean.Builder create(String title) {
        ActionRequestBoolean.Builder builder = new ActionRequestBoolean.Builder(this.builder, RequestMethod.POST);
        builder.setBodyParameter("title", title);
        return builder;
    }
}
