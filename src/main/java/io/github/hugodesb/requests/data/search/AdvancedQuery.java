package io.github.hugodesb.requests.data.search;

import java.util.HashSet;
import java.util.Set;

public class AdvancedQuery {
    private final Set<String> advancedQuery;

    public AdvancedQuery() {
        this.advancedQuery = new HashSet<>();
    }

    private AdvancedQuery by(FIELD field, String query) {
        advancedQuery.add(String.format("%s:\"%s\"", field.getValue(), query));
        return this;
    }

    /**
     * Specify the artist name
     * @param query artist name
     * @return this
     */
    public AdvancedQuery byArtist(String query) {
        return by(FIELD.ARTIST, query);
    }

    /**
     * Specify the album name
     * @param query album name
     * @return this
     */
    public AdvancedQuery byAlbum(String query) {
        return by(FIELD.ALBUM, query);
    }

    /**
     * Specify the track name
     * @param query track name
     * @return this
     */
    public AdvancedQuery byTrack(String query) {
        return by(FIELD.TRACK, query);
    }

    /**
     * Specify the label name
     * @param query label name
     * @return this
     */
    public AdvancedQuery byLabel(String query) {
        return by(FIELD.LABEL, query);
    }

    /**
     * Specify the min duration
     * @param duration the duration in seconds
     * @return this
     */
    public AdvancedQuery byDurMin(int duration) {
        return by(FIELD.DUR_MIN, String.valueOf(duration));
    }

    /**
     * Specify the max duration
     * @param duration the duration in seconds
     * @return this
     */
    public AdvancedQuery byDurMax(int duration) {
        return by(FIELD.DUR_MAX, String.valueOf(duration));
    }

    /**
     * Specify the min BPM
     * @param bpm the BPM
     * @return this
     */
    public AdvancedQuery byBpmMin(int bpm) {
        return by(FIELD.BPM_MIN, String.valueOf(bpm));
    }

    /**
     * Specify the max BPM
     * @param bpm the BPM
     * @return this
     */
    public AdvancedQuery byBpmMax(int bpm) {
        return by(FIELD.BPM_MAX, String.valueOf(bpm));
    }

    public String build() {
        return String.join(" ", advancedQuery);
    }

    enum FIELD {
        ARTIST("artist"), ALBUM("album"), TRACK("track"), LABEL("label"),
        DUR_MIN("dur_min"), DUR_MAX("dur_max"), BPM_MIN("bpm_min"), BPM_MAX("bpm_max");
        private final String value;

        FIELD(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }
}
