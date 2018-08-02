package com.geeknight.GeekNightApp.services;

import com.geeknight.GeekNightApp.repositories.AlbumRepository;
import com.geeknight.GeekNightApp.repositories.entities.Album;
import com.geeknight.GeekNightApp.repositories.entities.Song;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class AlbumService {

    private AlbumRepository albumRepository;

    @Autowired
    public AlbumService( AlbumRepository albumRepository){
        this.albumRepository = albumRepository;
    }

    public Collection<Album> getAllAlbums(){
        return this.albumRepository.findAll();
    }

    public Album getAlbum(Long albumId){
        return this.albumRepository.getOne(albumId);
    }

    public Album createNewAlbum(Album newAlbum){
        return this.albumRepository.save(newAlbum);
    }

    public Album updateAlbum(Album updatedAlbum){
        return this.albumRepository.save(updatedAlbum);
    }

    public Collection<Album> deleteAlbum(Long albumId){
        Album album = this.albumRepository.getOne(albumId);
        this.albumRepository.delete(album);
        return getAllAlbums();
    }

    public Collection<Song> getAllSongsFromAlbum(Long albumId){
        return this.albumRepository.getAllSongsFromAlbum(albumId);
    }




    public Collection<Album> findAllArtistAlbums(Long artistId){
        return this.albumRepository.findByArtistId(artistId);
    }
}
