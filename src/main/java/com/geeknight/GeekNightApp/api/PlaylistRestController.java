package com.geeknight.GeekNightApp.api;

import com.geeknight.GeekNightApp.repositories.PlaylistRepo;
import com.geeknight.GeekNightApp.repositories.entities.Playlist;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.geeknight.GeekNightApp.config.PlaylistApis.GET_PLAYLIST_BY_TITLE;
import static com.geeknight.GeekNightApp.config.PlaylistApis.PLAYLIST_BASE_URL;

@RestController
@RequestMapping("api/v1/")
public class PlaylistRestController {

    @Autowired
    private PlaylistRepo playlistRepo;

    @GetMapping(path = GET_PLAYLIST_BY_TITLE)
    public Playlist getPlaylistByTitle(@PathVariable String title){
        return playlistRepo.getPlaylistByTitle(title);
    }

    @GetMapping(path = PLAYLIST_BASE_URL)
    public List<Playlist> getAllPlaylists(){
        return playlistRepo.findAll();
    }

    @PostMapping(path = PLAYLIST_BASE_URL)
    public Playlist createPlaylist(@RequestBody Playlist playlist){
        return playlistRepo.saveAndFlush(playlist);
    }

}
