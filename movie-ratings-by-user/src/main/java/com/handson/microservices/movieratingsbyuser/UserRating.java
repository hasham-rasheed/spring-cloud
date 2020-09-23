package com.handson.microservices.movieratingsbyuser;

import lombok.Data;

/** @author Hasham Rasheed 22-09-2020 */
@Data
public class UserRating {

  private long id;
  private String name;
  private long movieRating;
  private long movieId;
}
