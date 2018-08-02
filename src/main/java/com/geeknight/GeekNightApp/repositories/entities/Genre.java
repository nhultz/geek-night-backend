package com.geeknight.GeekNightApp.repositories.entities;


import lombok.Getter;
import lombok.Setter;

<<<<<<< HEAD
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
=======
import javax.persistence.*;
>>>>>>> master

@Entity
@Getter @Setter
public class Genre {
<<<<<<< HEAD

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
=======
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
>>>>>>> master
    private String name;
    
    public Genre(){}

}
