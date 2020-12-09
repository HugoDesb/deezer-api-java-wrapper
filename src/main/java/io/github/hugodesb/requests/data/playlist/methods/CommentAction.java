package io.github.hugodesb.requests.data.playlist.methods;

import io.github.hugodesb.requests.actions.AbstractAction;

public class CommentAction extends AbstractAction<PlaylistCommentsRequest.Builder> {
    public CommentAction(PlaylistCommentsRequest.Builder builder, String accessToken) {
        super(builder, accessToken);
    }

    /**
     * Adds a comment to the playlist
     * @param comment the content of the comment
     * @return The request builder up to that point
     */
    public PlaylistCommentAddRequest.Builder add(String comment) {
        return new PlaylistCommentAddRequest.Builder(this.builder, comment);
    }
}
