package com.wrapper.deezer.enums;

public enum Permissions {
    /**
     * Access users basic information
     * Incl. name, firstname, profile picture only.
     */
    BASIC_ACCESS("basic_access"),
    /**
     * Get the user's email
     */
    EMAIL("email"),
    /**
     * Access user data any time
     * Application may access user data at any time
     */
    OFFLINE_ACCESS("offline_access"),
    /**
     * Manage users' library
     * Add/rename a playlist. Add/order songs in the playlist.
     */
    MANAGE_LIBRARY("manage_library"),
    /**
     * Manage users' friends
     * Add/remove a following/follower.
     */
    MANAGE_COMMUNITY("manage_community"),
    /**
     * Delete library items
     * Allow the application to delete items in the user's library
     */
    DELETE_LIBRARY("delete_library"),
    /**
     * Allow the application to access the user's listening history
     */
    LISTENING_HISTORY("listening_history");

    private final String value;

    Permissions(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
