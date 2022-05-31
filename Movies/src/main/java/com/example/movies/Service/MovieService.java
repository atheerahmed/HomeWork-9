package com.example.movies.Service;

import com.example.movies.Models.Movie;
import com.example.movies.Reposetry.MovieRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MovieService {
    private final MovieRepository movieRepository;

    public List<Movie> getMovies(){
        return movieRepository.findAll();
    }

    public void addMovie(Movie movie){
        movieRepository.save(movie);
    }

    public void updateMovie(Movie movie,String  id){
        Movie moovie1= movieRepository.findById(id).get();
        moovie1.setGenre(movie.getGenre());
        moovie1.setDuration(movie.getDuration());
        moovie1.setName(moovie1.getName());
        movieRepository.save(movie);

    }

    public void deleteMovie( String  id){
        movieRepository.deleteById(id);

    }



}
