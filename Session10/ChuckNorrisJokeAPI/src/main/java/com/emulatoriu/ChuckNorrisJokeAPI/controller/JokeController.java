package com.emulatoriu.ChuckNorrisJokeAPI.controller;

import com.emulatoriu.ChuckNorrisJokeAPI.data.Joke;
import com.emulatoriu.ChuckNorrisJokeAPI.logic.JokeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class JokeController {
    private final JokeService jokeService;

    public JokeController(JokeService jokeService) {
        this.jokeService = jokeService;
    }

    @PostMapping
    Joke save(@RequestBody Joke joke) {
        return jokeService.save(joke);
    }

    @GetMapping
    @RequestMapping("all")
    List<Joke> findAll() {
        return jokeService.findAll();
    }

    @GetMapping
    @RequestMapping("{id}")
    Joke find(@PathVariable String id) {
        return jokeService.find(id);
    }
}
