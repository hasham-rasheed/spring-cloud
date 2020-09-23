package com.handson.microservices.movieratingsbyuser;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

/** @author Hasham Rasheed 23-09-2020 */
@FeignClient("movies-info")
public interface MovieClient {
  @GetMapping("/movie")
  List<Movie> getAllMovies();

  @GetMapping("/movie/{id}")
  Movie getMoviebyId(@PathVariable("id") long id);
}
