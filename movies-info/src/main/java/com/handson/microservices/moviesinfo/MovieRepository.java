package com.handson.microservices.moviesinfo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/** @author Hasham Rasheed 21-09-2020 */
@Repository
public interface MovieRepository extends CrudRepository<Movie, Long> {}
