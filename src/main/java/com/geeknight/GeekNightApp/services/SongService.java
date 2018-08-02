package com.geeknight.GeekNightApp.services;

import com.geeknight.GeekNightApp.repositories.SongRepo;
import com.geeknight.GeekNightApp.repositories.entities.Song;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Collection;
import java.util.Optional;

@Service
public class SongService {
    private SongRepo songRepo;

    @Autowired
    public SongService(SongRepo songRepo){this.songRepo = songRepo;}

    public Collection<Song> getAllSongs(){return this.songRepo.findAll();}

    public Optional<Song> getSongById(@PathVariable long songId){return this.songRepo.findById(songId);}

    public Song createNewSong(Song song){ return this.songRepo.save(song);}
}

