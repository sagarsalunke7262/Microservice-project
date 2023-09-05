package com.rating.service.RatingService.services;

import com.rating.service.RatingService.entities.Rating;

import java.util.List;

public interface RatingService {

    Rating createRating(Rating rating);
    List<Rating> getAllRatings();
    List<Rating> getRatingByUserId(String uId);
    List<Rating> getRatingByHotelId(String hId);

}
