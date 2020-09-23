package com.handson.microservices.userratings;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Hasham Rasheed
 * 22-09-2020
 */
@Repository
public interface UserRatingRepository extends CrudRepository<UserRating, Long> {
}
