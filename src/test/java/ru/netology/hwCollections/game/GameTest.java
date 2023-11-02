package ru.netology.hwCollections.game;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GameTest {
    Player player1 = new Player(1, "Hunter", 100);
    Player player2 = new Player(2, "Wolf", 25);
    Player player3 = new Player(3, "Mike", 150);
    Player player4 = new Player(4, "Max", 50);
    Player player5 = new Player(5, "Tim", 150);

    Game game = new Game();

    @Test
    public void theFirstPlayerIsUnregisteredTest() {
        game.register(player2);

        Assertions.assertThrows(NotRegisteredException.class, () -> {
            game.round("Jack", "Wolf");
        });
    }

    @Test
    public void theSecondPlayerIsUnregisteredTest() {
        game.register(player1);

        Assertions.assertThrows(NotRegisteredException.class, () -> {
            game.round("Hunter", "Jack");
        });
    }

    @Test
    public void theFirstPlayerToWin() {
        game.register(player1);
        game.register(player2);

        Assertions.assertEquals(1, game.round("Hunter", "Wolf"));
    }

    @Test
    public void theSecondPlayerToWin() {
        game.register(player4);
        game.register(player3);

        Assertions.assertEquals(2, game.round("Max", "Mike"));
    }

    @Test
    public void drawTest() {
        game.register(player3);
        game.register(player5);

        Assertions.assertEquals(0, game.round("Mike", "Tim"));
    }
}
