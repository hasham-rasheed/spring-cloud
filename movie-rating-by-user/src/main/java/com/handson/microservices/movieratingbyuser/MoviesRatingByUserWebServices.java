package com.handson.microservices.movieratingbyuser;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author Hasham Rasheed
 * 22-09-2020
 */
@Controller
@RequestMapping("/ratings")
public class MoviesRatingByUserWebServices {

    @GetMapping
    public @ResponseBody Iterable<>

}
