package ma.movies.moviesrate.ws;

import ma.movies.moviesrate.bean.Movie;
import ma.movies.moviesrate.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/movies")
public class MoviesController {
    @Autowired
    private MovieService movieService;

    @GetMapping("/imdbId/{imdbId}")
    public Movie findByImdbId(@PathVariable String imdbId) {
        return movieService.findByImdbId(imdbId);
    }

    @GetMapping
    public List<Movie> findAll() {
        return movieService.findAll();
    }
}
