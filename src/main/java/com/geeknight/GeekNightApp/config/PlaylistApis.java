package com.geeknight.GeekNightApp.config;

public class PlaylistApis {
    public static final String PLAYLIST_BASE_URL = "api/v1/playlist";
    public static final String GET_PLAYLIST_BY_TITLE = PLAYLIST_BASE_URL + "/{title}";


    //    Get all playlists	GET /playlist
//    Get one playlist	GET /playlist/:playlistId
//    Create a new playlist	POST /playlist
//    Update a playlist	PUT /playlist/:playlistId
//    Delete a playlist	DELETE /playlist/:playlistId
//    Get all songs in a playlist	GET /playlist/:playlistId/songs
//    Add a song to a playlist	POST /playlist/:playlistId/:songId
//    Remove a song from a playlist	DELETE /playlist/:playlistId/:songId
}
