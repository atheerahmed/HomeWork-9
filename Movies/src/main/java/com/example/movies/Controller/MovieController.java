package com.example.movies.Controller;


import com.example.movies.Models.Movie;
import com.example.movies.Service.MovieService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("api/v1/movie")
@AllArgsConstructor
public class MovieController {
    private final MovieService movieService;
@GetMapping
    public ResponseEntity<List<Movie>> getMovies(){
    return ResponseEntity.status(200).body(movieService.getMovies());
}
@PostMapping
    public ResponseEntity addMovie(@RequestBody @Valid Movie movie,Errors error){
    if (error.hasErrors()){
        return ResponseEntity.status(200).body(error.getFieldError().getDefaultMessage());}

    movieService.addMovie(movie);
    return  ResponseEntity.status(200).body("added new movie");
}
@PutMapping
public ResponseEntity updateMovie(@RequestBody @Valid Movie movie , Errors errors){
    if(errors.hasErrors())
        return ResponseEntity.status(400).body(errors.getFieldError().getDefaultMessage());

    movieService.updateMovie(movie, movie.getId());
    return  ResponseEntity.status(200).body("update the movie");
}
    @DeleteMapping
    public ResponseEntity deleteMovie(String  id){
        movieService.deleteMovie(id);
        return  ResponseEntity.status(200).body("deleted the movie");
    }
}
