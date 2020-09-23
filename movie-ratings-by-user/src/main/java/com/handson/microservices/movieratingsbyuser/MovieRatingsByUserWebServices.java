package com.handson.microservices.movieratingsbyuser;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/** @author Hasham Rasheed 22-09-2020 */
@Controller
@RequestMapping("/ratings")
public class MovieRatingsByUserWebServices {
  @Autowired private UserClient userClient;
  @Autowired private MovieClient movieClient;
  @Autowired private RestTemplate restTemplate;

  @GetMapping
  public @ResponseBody Iterable<MovieRatingsByUsers> getAllUserRatings() {
    return null;
  }

  @GetMapping("/user")
  public @ResponseBody List<UserRating> getByUsers() {
    //    final ResponseEntity<List<UserRating>> users =
    //            this.restTemplate.exchange(
    //                    "http://user-ratings/users",
    //                    HttpMethod.GET,
    //                    null,
    //                    new ParameterizedTypeReference<List<UserRating>>() {});
    // NOTE: using feign client instead of rest template
    return this.userClient.getAllUsers();
  }

  @GetMapping("/movie")
  public @ResponseBody List<Movie> getByMovies() {
    //    final ResponseEntity<List<Movie>> movies =
    //        this.restTemplate.exchange(
    //                "http://movies-info/movie",
    //                HttpMethod.GET,
    //                null,
    //                new ParameterizedTypeReference<List<Movie>>() {});
    // NOTE: using feign client instead of rest template
    return this.movieClient.getAllMovies();
  }

  //TODO: add a method to combine user ratings with movie and expose an API.
}
