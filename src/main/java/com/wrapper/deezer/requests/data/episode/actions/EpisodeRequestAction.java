package com.wrapper.deezer.requests.data.episode.actions;

import com.wrapper.deezer.requests.actions.ActionRequestBoolean;
import com.wrapper.deezer.requests.RequestMethod;
import com.wrapper.deezer.requests.actions.AbstractAction;
import com.wrapper.deezer.requests.data.episode.EpisodeRequest;

public class EpisodeRequestAction extends AbstractAction<EpisodeRequest.Builder> {

    public EpisodeRequestAction(EpisodeRequest.Builder builder, String accessToken) {
        super(builder, accessToken);
    }

    /**
     * Sets a bookmark at the specified offset
     * @param offset an integer in [1, 100]
     * @return The request builder up to that point
     */
    public ActionRequestBoolean.Builder setBookmark(int offset) {
        ActionRequestBoolean.Builder builder = new ActionRequestBoolean.Builder(this.builder, RequestMethod.POST);
        builder.addSegmentToPath("bookmark");
        builder.setBodyParameter("offset", offset);
        return builder;
    }

    /**
     * Deletes the bookmark
     * @return The request builder up to that point
     */
    public ActionRequestBoolean.Builder deleteBookmark() {
        ActionRequestBoolean.Builder builder = new ActionRequestBoolean.Builder(this.builder, RequestMethod.DELETE);
        builder.addSegmentToPath("bookmark");
        return builder;
    }

}
