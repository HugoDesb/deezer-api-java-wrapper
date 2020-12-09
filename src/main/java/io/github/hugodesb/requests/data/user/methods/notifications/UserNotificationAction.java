package io.github.hugodesb.requests.data.user.methods.notifications;

import io.github.hugodesb.requests.actions.ActionRequestSuccess;
import io.github.hugodesb.requests.RequestMethod;
import io.github.hugodesb.requests.actions.AbstractAction;

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
