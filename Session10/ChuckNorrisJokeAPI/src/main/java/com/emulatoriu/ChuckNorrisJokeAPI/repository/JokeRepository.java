package com.emulatoriu.ChuckNorrisJokeAPI.repository;

import com.emulatoriu.ChuckNorrisJokeAPI.data.Joke;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class JokeRepository {
    private final List<Joke> jokes;

    public JokeRepository(List<Joke> jokes) {
        this.jokes = jokes;
    }

    public Joke save(Joke joke) {
        jokes.add(joke);
        return joke;
    }

    public List<Joke> findAll() {
        return jokes;
    }
}
