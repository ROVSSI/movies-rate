package ma.movies.moviesrate.dao;

import ma.movies.moviesrate.bean.Movie;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface movieRepository extends MongoRepository<Movie, ObjectId> {
}
