package com.geeknight.GeekNightApp.services;

import com.geeknight.GeekNightApp.repositories.GenreRepository;
import com.geeknight.GeekNightApp.repositories.entities.Genre;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GenreService {

    private GenreRepository genreRepository;

    @Autowired
    public GenreService(GenreRepository genreRepository) {
        this.genreRepository = genreRepository;
    }

    public Genre createGenre(Genre genre){
        genre = this.genreRepository.save(genre);
        return genre;
    }

    public List<Genre> getGenres(){
        return genreRepository.findAll();
    }

    public Genre getGenreByName(String name){
        return genreRepository.getGenreByName(name);
    }


}
