package ru.netology.hwCollections.game;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PlayerTest {
    Player player = new Player(1, "Hunter", 25);

    @Test
    public void getIdPlayerTest() {

        Assertions.assertEquals(1, player.getId());
    }

    @Test
    public void getNamePlayerTest() {

        Assertions.assertEquals("Hunter", player.getName());
    }

    @Test
    public void getStrengthPlayerTest() {

        Assertions.assertEquals(25, player.getStrength());
    }
}
