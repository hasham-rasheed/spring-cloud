package com.handson.microservices.movieratingsbyuser;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

/**
 * @author Hasham Rasheed
 * 23-09-2020
 */
@FeignClient("user-ratings")
public interface UserClient {
    @GetMapping("/users")
    List<UserRating> getAllUsers();
    @GetMapping("/users/{id}")
    UserRating getUserbyId(@PathVariable("id") long id);
}
