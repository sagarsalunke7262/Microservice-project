package com.rating.service.RatingService.controllers;

import com.rating.service.RatingService.RatingServiceApplication;
import com.rating.service.RatingService.entities.Rating;
import com.rating.service.RatingService.repository.RatingRepeository;
import com.rating.service.RatingService.services.RatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ratings")
public class RatingController {

    @Autowired
    private RatingService ratingService;

    @PostMapping
   public  ResponseEntity<Rating> createRating(@RequestBody Rating rating){

       Rating rating1 = ratingService.createRating(rating);

       return ResponseEntity.status(HttpStatus.CREATED).body(rating1);

   }

   @GetMapping
    public ResponseEntity <List<Rating> >getRating()
   {
       return ResponseEntity.ok(ratingService.getAllRatings());
   }

   @GetMapping("/{uId}")
   public ResponseEntity<List<Rating>> getRatingByUserId(@PathVariable  String uId)
   {
       List<Rating> ratingByUserId = ratingService.getRatingByUserId(uId);

       return ResponseEntity.ok(ratingByUserId);
   }

    @GetMapping("/hotels/{hId}")
    public ResponseEntity<List<Rating>> getRatingByHotelId(@PathVariable  String hId)
    {
        List<Rating> ratingByHotelId = ratingService.getRatingByHotelId(hId);
        return ResponseEntity.ok(ratingByHotelId);
    }

}
