package com.handson.microservices.moviesinfo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/** @author Hasham Rasheed 21-09-2020 */
@Controller
@RequestMapping("/movie")
public class MoviesWebServices {

  @Autowired private MovieRepository movieRepository;

  @GetMapping
  public @ResponseBody Iterable<Movie> getAllMovies() {
    return this.movieRepository.findAll();
  }

  @GetMapping("/{id}")
  public @ResponseBody Movie getMovie(@PathVariable("id") long id) {
    return this.movieRepository.findById(id).get();
  }
}
