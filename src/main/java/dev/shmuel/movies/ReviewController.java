package dev.shmuel.movies;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/movies")
public class ReviewController {

    @Autowired
    private ReviewService reviewService;

//    @PostMapping
//    public ResponseEntity createReview()
}
