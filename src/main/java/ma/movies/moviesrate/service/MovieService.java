package ma.movies.moviesrate.service;

import ma.movies.moviesrate.bean.Movie;
import ma.movies.moviesrate.dao.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {
    @Autowired
    private MovieRepository movieRepository;

    public Movie findByImdbId(String imdbId) {
        return movieRepository.findByImdbId(imdbId);
    }

    public List<Movie> findAll() {
        return movieRepository.findAll();
    }
}
