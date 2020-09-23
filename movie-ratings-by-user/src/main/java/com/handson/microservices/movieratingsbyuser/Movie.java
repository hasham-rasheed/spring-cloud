package com.handson.microservices.movieratingsbyuser;

import lombok.Data;

/** @author Hasham Rasheed 21-09-2020 */
@Data
public class Movie {
  private long id;
  private String name;
  private String desc;
}
