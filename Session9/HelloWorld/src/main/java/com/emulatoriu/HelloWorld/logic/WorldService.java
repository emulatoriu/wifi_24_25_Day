package com.emulatoriu.HelloWorld.logic;

import org.springframework.stereotype.Component;

@Component
public class WorldService {
    private final String world = "World";

    public String getWorld() {
        return world;
    }
}
