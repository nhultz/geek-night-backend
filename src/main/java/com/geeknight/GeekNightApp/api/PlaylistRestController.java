package com.geeknight.GeekNightApp.api;

import com.geeknight.GeekNightApp.repositories.PlaylistRepo;
import com.geeknight.GeekNightApp.repositories.entities.Playlist;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/")
public class PlaylistRestController {

    @Autowired
    private PlaylistRepo playlistRepo;

    @RequestMapping(value = "playlist/{title}", method = RequestMethod.GET)
    public Playlist getPlaylistByTitle(@PathVariable String title){
        return playlistRepo.getPlaylistByTitle(title);
    }

    @RequestMapping(value = "playlist", method = RequestMethod.GET)
    public List<Playlist> getAllPlaylists(){
        return playlistRepo.findAll();
    }

    @RequestMapping(value = "playlist", method = RequestMethod.POST)
    public Playlist createPlaylist(@RequestBody Playlist playlist){
        return playlistRepo.saveAndFlush(playlist);
    }

}
