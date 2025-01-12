package com.netflix.movieapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api/v1/reviews") // reviews are present in the movie page itself no need a seperate page for it
public class ReviewController {
    @Autowired
    private ReviewService reviewService;
    @PostMapping()
    public ResponseEntity<Review> createReview(@RequestBody Map<String,String> payload){
          return new ResponseEntity<Review>(reviewService.CreateReview(payload.get("reviewBody"),payload.get("imdbId")), HttpStatus.CREATED);
    }
}
