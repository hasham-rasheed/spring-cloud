package com.handson.microservices.userratings;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author Hasham Rasheed
 * 22-09-2020
 */
@Controller
@RequestMapping("/users")
public class UserRatingWebServices {
    @Autowired
    private UserRatingRepository userRatingRepository;

    @GetMapping
    public @ResponseBody Iterable<UserRating> getAllUserRatings(){
       return this.userRatingRepository.findAll();
    }

    @GetMapping("/{id}")
    public @ResponseBody UserRating getUserRating(@PathVariable("id") long id) {
        return this.userRatingRepository.findById(id).get();
    }

}
