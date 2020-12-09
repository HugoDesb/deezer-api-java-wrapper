package io.github.hugodesb.requests.data.artist.actions;

import io.github.hugodesb.requests.actions.ActionRequestIdObject;
import io.github.hugodesb.requests.RequestMethod;
import io.github.hugodesb.requests.actions.AbstractAction;
import io.github.hugodesb.requests.data.artist.methods.ArtistCommentsRequest;

public class ArtistCommentAction extends AbstractAction<ArtistCommentsRequest.Builder> {
    public ArtistCommentAction(ArtistCommentsRequest.Builder builder, String accessToken) {
        super(builder, accessToken);
    }

    /**
     * Adds a comment to the artist
     * @param comment the content of the comment
     * @return The request up to that point
     */
    public ActionRequestIdObject.Builder add(String comment) {
        ActionRequestIdObject.Builder builder = new ActionRequestIdObject.Builder(this.builder, RequestMethod.POST);
        builder.setBodyParameter("comment", comment);
        return builder;
    }
}
