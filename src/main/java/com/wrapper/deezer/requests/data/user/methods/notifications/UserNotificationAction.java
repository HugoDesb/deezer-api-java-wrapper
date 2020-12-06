package com.wrapper.deezer.requests.data.user.methods.notifications;

import com.wrapper.deezer.requests.actions.ActionRequestSuccess;
import com.wrapper.deezer.requests.RequestMethod;
import com.wrapper.deezer.requests.actions.AbstractAction;

public class UserNotificationAction extends AbstractAction<UserNotificationsRequest.Builder> {
    public UserNotificationAction(UserNotificationsRequest.Builder builder, String accessToken) {
        super(builder, accessToken);
    }

    /**
     * Sends a notifications to the user
     * @param message the notification message
     * @return The request builder up to that point
     */
    public ActionRequestSuccess.Builder send(String message) {
        ActionRequestSuccess.Builder builder = new ActionRequestSuccess.Builder(this.builder, RequestMethod.POST);
        builder.setBodyParameter("message", message);
        return builder;
    }
}
