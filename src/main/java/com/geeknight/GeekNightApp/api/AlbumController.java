package com.geeknight.GeekNightApp.api;

import com.geeknight.GeekNightApp.repositories.entities.Album;
import com.geeknight.GeekNightApp.repositories.entities.Song;
import com.geeknight.GeekNightApp.services.AlbumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
public class AlbumController {

    private AlbumService albumService;

    @Autowired
    public AlbumController(AlbumService albumService){
        this.albumService = albumService;
    }

    @GetMapping (value = "/album")
    public Collection<Album> getAllAlbums(){
        return this.albumService.getAllAlbums();
    }

    @GetMapping (value = "/album/{albumId}")
    public Album getAlbum(@PathVariable Long albumId){
        return this.albumService.getAlbum(albumId);
    }

    @GetMapping (value = "/album/{albumId}/songs")
    public Collection<Song> getAllSongsFromAlbum(@PathVariable Long albumId){
        return this.albumService.getAllSongsFromAlbum(albumId);
    }

    @PostMapping (value = "/album")
    public Album createNewAlbum(Album newAlbum){
        return this.albumService.createNewAlbum(newAlbum);
    }

    @PutMapping (value = "/album/{albumId}")
    public Album updateAlbum(@PathVariable Long albumId, Album updatedAlbum){
        return this.albumService.updateAlbum(updatedAlbum);
    }

    @DeleteMapping (value = "/album/{albumId}")
    public Collection<Album> deleteAlbum(@PathVariable Long albumId){
        return this.albumService.deleteAlbum(albumId);
    }




}
