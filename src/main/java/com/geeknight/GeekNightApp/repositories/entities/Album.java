package com.geeknight.GeekNightApp.repositories.entities;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
<<<<<<< HEAD
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
=======
>>>>>>> master
import javax.persistence.Id;
import java.time.Duration;

@Entity
@Getter @Setter
public class Album {

    @Id
<<<<<<< HEAD
    @GeneratedValue(strategy = GenerationType.AUTO)
=======
>>>>>>> master
    private int id;
    private String title;
    private int artistId;
    private int genreID;
    private Duration duration;
    private boolean isExplicit;
    private boolean isFavorite;

    public Album(){}


}
