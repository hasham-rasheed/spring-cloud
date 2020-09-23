package com.handson.microservices.movieratingsbyuser;

import lombok.Data;

/**
 * @author Hasham Rasheed
 * 22-09-2020
 */
@Data
public class MovieRatingsByUsers {
    private String userName;
    private String movieName;
    private int rating;
}
