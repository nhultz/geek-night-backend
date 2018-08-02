package com.geeknight.GeekNightApp.api;

import com.geeknight.GeekNightApp.repositories.entities.Genre;
import com.geeknight.GeekNightApp.services.GenreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping(path = "/")
public class GenreController {

    private GenreService genreService;

    @Autowired
    public GenreController(GenreService genreService){
        this.genreService = genreService;
    }

    @PostMapping( value = "/genre")
    public Genre createGenre(@RequestBody Genre genre){
        return this.genreService.createGenre(genre);
    }

    @GetMapping(path = "/genre")
    public @ResponseBody Iterable<Genre> getAllGenres(){
        return this.genreService.getGenres();
    }

    @GetMapping(path= "/{name}")
    public @ResponseBody Genre getGenreByName(@PathVariable("name") String name){
        return  this.genreService.getGenreByName(name);
    }
}

