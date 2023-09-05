package com.rating.service.RatingService.repository;
import com.rating.service.RatingService.entities.Rating;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
@Repository
public interface RatingRepeository  extends MongoRepository<Rating,String> {


    List<Rating> findByUserId(String userId);

    List<Rating> findByHotelId(String hotelId);
}
