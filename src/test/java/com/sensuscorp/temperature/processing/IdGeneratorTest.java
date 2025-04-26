package com.sensuscorp.temperature.processing;

import com.sensuscorp.temperature.processing.common.IdGenerator;
import org.junit.jupiter.api.Test;

import java.util.UUID;

class IdGeneratorTest {

    @Test
    void idGeratorUUID(){
        UUID uuid = IdGenerator.generateTimeBasedUUID();

        System.out.println(uuid);
    }
}
