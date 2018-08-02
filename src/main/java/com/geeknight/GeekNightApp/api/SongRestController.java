package com.geeknight.GeekNightApp.api;

import com.geeknight.GeekNightApp.repositories.entities.Song;
import com.geeknight.GeekNightApp.services.SongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.Optional;


@RestController
public class SongRestController {
    @Autowired
    private SongService songService;

    public SongRestController(SongService songService){this.songService = songService;}

    @GetMapping(value = "/api/v1/song")
    public Collection<Song> getAllSongs(){return songService.getAllSongs();}

    @GetMapping(value = "api/v1/song/{songId}" )
    public Optional<Song> getSongById(@PathVariable long songId){return songService.getSongById(songId);}

    @PostMapping(value = "api/v1/song/{songId}/favorite")
    public Song createNewSong(@PathVariable long songId, Song song){return songService.createNewSong(song);}

}

