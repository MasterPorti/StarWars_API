package com.starwars;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Film {
    private String title;
    private String director;
    private String producer;
    private int id;


    public Film(FilmSwapi film) {
        this.title = film.title();
        this.director = film.director();
        this.producer = film.producer();
        this.id = film.id();
    }

    @Override
    public String toString() {
        return "(" +
                "title='" + title + '\'' +
                ", director='" + director + '\'' +
                ", producer='" + producer + '\'' +
                ", id=" + id +
                ')';
    }
}
