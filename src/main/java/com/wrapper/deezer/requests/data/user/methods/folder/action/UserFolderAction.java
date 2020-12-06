package com.wrapper.deezer.requests.data.user.methods.folder.action;

import com.wrapper.deezer.requests.actions.ActionRequestBoolean;
import com.wrapper.deezer.requests.RequestMethod;
import com.wrapper.deezer.requests.actions.AbstractAction;
import com.wrapper.deezer.requests.data.user.methods.folder.UserFolderRequest;

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
