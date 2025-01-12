package com.netflix.movieapi;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/movies")
public class MovieController {
    @Autowired
    private MovieService movieService;
    @GetMapping
    public ResponseEntity<List<Movie>> getMovies(){
        return new ResponseEntity<List<Movie>>(movieService.findAllMovies(),HttpStatus.OK);
    }
    @GetMapping("/{imdbid}")
    public ResponseEntity<Optional<Movie>> getSingleMovie(@PathVariable String imdbid){
        return new ResponseEntity<Optional<Movie>>(movieService.singleMovie(imdbid),HttpStatus.OK);
    }
}
