package com.netflix.movieapi;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {

    @Autowired
    private MovieRepository movieRepository;

    public List<Movie> findAllMovies() {
        List<Movie> movies = movieRepository.findAll();
        return movies;
    }
    public Optional<Movie> singleMovie(String ImdbId){
        return movieRepository.findMovieByImdbId(ImdbId);
    }
}
