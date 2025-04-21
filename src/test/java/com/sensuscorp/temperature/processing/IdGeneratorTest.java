package com.sensuscorp.temperature.processing;

import org.junit.jupiter.api.Test;

import java.util.UUID;

class IdGeneratorTest {

    @Test
    void idGeratorUUID(){
        UUID uuid = IdGenerator.generateTimeBasedUUID();

        System.out.println(uuid);
    }
}
