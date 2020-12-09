package io.github.hugodesb.requests.data.playlist.actions;

import io.github.hugodesb.requests.actions.ActionRequestBoolean;
import io.github.hugodesb.requests.RequestMethod;
import io.github.hugodesb.requests.actions.AbstractAction;
import io.github.hugodesb.requests.data.playlist.methods.PlaylistTracksRequest;

import java.util.Arrays;
import java.util.stream.Collectors;

public class PlaylistTrackAction extends AbstractAction<PlaylistTracksRequest.Builder> {
    public PlaylistTrackAction(PlaylistTracksRequest.Builder builder, String accessToken) {
        super(builder, accessToken);
    }

    /**
     * Appends the specified tracks to the playlist
     * @param ids the tracks ids to add
     * @return The request builder up to that point
     */
    public ActionRequestBoolean.Builder add(Long... ids) {
        ActionRequestBoolean.Builder builder = new ActionRequestBoolean.Builder(this.builder, RequestMethod.POST);
        builder.setBodyParameter("songs", Arrays.stream(ids).map(Object::toString).collect(Collectors.joining("'")));
        return builder;
    }

    /**
     * Order the playlist tracks by the order given.
     * @param ids the ordered tracks ids
     * @return The request builder up to that point
     */
    public ActionRequestBoolean.Builder order(Long... ids) {
        ActionRequestBoolean.Builder builder = new ActionRequestBoolean.Builder(this.builder, RequestMethod.POST);
        builder.setBodyParameter("order", Arrays.stream(ids).map(Object::toString).collect(Collectors.joining("'")));
        return builder;
    }

    /**
     * Removes the specified tracks of the playlist
     * @param ids the tracks ids to remove
     * @return The request builder up to that point
     */
    public ActionRequestBoolean.Builder remove(Long... ids) {
        ActionRequestBoolean.Builder builder = new ActionRequestBoolean.Builder(this.builder, RequestMethod.DELETE);
        builder.setQueryParameter("songs", Arrays.stream(ids).map(Object::toString).collect(Collectors.joining("'")));
        return builder;
    }


}
