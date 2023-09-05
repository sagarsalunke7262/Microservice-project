package com.rating.service.RatingService.services.impl;

import com.rating.service.RatingService.entities.Rating;
import com.rating.service.RatingService.repository.RatingRepeository;
import com.rating.service.RatingService.services.RatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RatingServiceImpl implements RatingService {

    @Autowired
    private RatingRepeository ratingRepeository;

    @Override
    public Rating createRating(Rating rating) {
        return ratingRepeository.save(rating);
    }

    @Override
    public List<Rating> getAllRatings() {
        return ratingRepeository.findAll();
    }

    @Override
    public List<Rating> getRatingByUserId(String uId) {
        List<Rating> byUserId = ratingRepeository.findByUserId(uId);
        System.out.println(byUserId);
        return byUserId;
    }

    @Override
    public List<Rating> getRatingByHotelId(String hId) {
        return ratingRepeository.findByHotelId(hId);
    }
}
