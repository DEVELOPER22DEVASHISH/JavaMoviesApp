package dev.devashish.movies;
//getting data from database need service class and repository clas

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {

    @Autowired
    private MovieRepository movieRepository;
    public List<Movie> allMovies() {
//        System.out.println(movieRepository.findAll().toString());
        return movieRepository.findAll();

    }
//    in null cases if id does not exist optional used
//    public Optional<Movie> singleMovie(ObjectId id){
//     return movieRepository.findById(id);
public Optional<Movie> singleMovie(String imdbId){
        return movieRepository.findMovieByImdbId(imdbId);
    }
}
