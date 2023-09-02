package dev.shmuel.movies;


import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class MovieService {

    @Autowired
    private MovieRepository repository;

    public List<Movie> allMovies() {
        System.out.println(repository.findAll().toString());
        return repository.findAll();
    }

    public Optional<Movie> singleMovie(ObjectId id){
        return repository.findById(id);
    }
}
