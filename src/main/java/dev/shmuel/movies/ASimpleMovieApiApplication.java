package dev.shmuel.movies;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ASimpleMovieApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ASimpleMovieApiApplication.class, args);
	}



}
