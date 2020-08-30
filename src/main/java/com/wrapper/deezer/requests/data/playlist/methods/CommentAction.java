package com.wrapper.deezer.requests.data.playlist.methods;

import com.wrapper.deezer.requests.data.AbstractAction;

////TODO : mmove that elsewhere ?
public class CommentAction extends AbstractAction<PlaylistCommentsRequest.Builder> {
    public CommentAction(PlaylistCommentsRequest.Builder builder, String accessToken) {
        super(builder, accessToken);
    }

    public PlaylistCommentAddRequest.Builder add(String commment){
        return new PlaylistCommentAddRequest.Builder(this.builder, commment);
    }
}
