//it is like data access layer
package dev.devashish.movies;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MovieRepository extends MongoRepository<Movie, ObjectId> {
//    getting data by imdbId


    Optional<Movie> findMovieByImdbId(String imdbId);
}

