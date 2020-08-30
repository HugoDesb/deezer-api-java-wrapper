package com.wrapper.deezer.requests.data.episode.actions;

import com.wrapper.deezer.requests.data.AbstractAction;
import com.wrapper.deezer.requests.data.episode.EpisodeRequest;

public class EpisodeRequestAction extends AbstractAction<EpisodeRequest.Builder> {

    public EpisodeRequestAction(EpisodeRequest.Builder builder, String accessToken) {
        super(builder, accessToken);
    }

    public EpisodeBookmarkSetRequest.Builder setBookmark(int offset){
        return new EpisodeBookmarkSetRequest.Builder(builder, offset);
    }

    public EpidodeBookmarkDeleteRequest.Builder deleteBookmark(){
        return new EpidodeBookmarkDeleteRequest.Builder(builder);
    }

}
