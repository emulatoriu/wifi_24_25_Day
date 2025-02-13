package com.emulatoriu.ChuckNorrisJokeAPI.logic;

import com.emulatoriu.ChuckNorrisJokeAPI.data.Joke;
import com.emulatoriu.ChuckNorrisJokeAPI.logic.exception.JokeNotFoundException;
import com.emulatoriu.ChuckNorrisJokeAPI.repository.JokeRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class JokeService {
    private final JokeRepository jokeRepository;

    public JokeService(JokeRepository jokeRepository) {
        this.jokeRepository = jokeRepository;
    }

    public Joke save(Joke joke) {
        UUID uuid = UUID.randomUUID();
        Joke jokeToSave = new Joke(uuid.toString(), joke.user(), joke.joke());
        return jokeRepository.save(jokeToSave);
    }

    public List<Joke> findAll() {
        return jokeRepository.findAll();
    }

    public Joke find(String id) {
        return findAll()
            .stream()
            .filter(joke -> joke.id().equals(id))
            .findFirst().orElseThrow(JokeNotFoundException::new);
    }

    public boolean delete(String id) {
        return findAll().removeIf(joke -> joke.id().equals(id));
    }
}
