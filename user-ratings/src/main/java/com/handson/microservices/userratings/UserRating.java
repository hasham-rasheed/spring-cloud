package com.handson.microservices.userratings;

import javax.persistence.*;

/**
 * @author Hasham Rasheed
 * 22-09-2020
 */
@Entity
@Table(name = "user_rating")
public class UserRating {

    @Id
    @Column(name ="ID")
    @GeneratedValue
    private long id;

    @Column(name ="NAME")
    private String name;

    @Column(name ="MOVIE_RATING")
    private long movieRating;

    @Column(name ="MOVIE_ID")
    private long movieId;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getMovieRating() {
        return movieRating;
    }

    public void setMovieRating(long movieRating) {
        this.movieRating = movieRating;
    }

    public long getMovieId() {
        return movieId;
    }

    public void setMovieId(long movieId) {
        this.movieId = movieId;
    }
}
