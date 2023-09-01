package dev.shmuel.movies;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
public class MongoDBConnectionTest {

    @Autowired
    private MovieRepository userRepository;

    @Test
    public void testMongoDBConnection() {
        assertTrue(userRepository.count() >= 0); // Just check if you can interact with the database
    }
}

