package ru.netology.hwCollections.game;

import java.util.HashMap;

public class Game {
    HashMap<String, Player> players = new HashMap<>();

    public void register(Player player) {
        players.put(player.getName(), player);
    }

    public Player findByName(String name) {
        for (String key : players.keySet()) {
            Player player = players.get(key);
            if (player.getName().equals(name)) {
                return player;
            }
        }
        return null;
    }

    public int round(String playerName1, String playerName2) {
        Player player1 = findByName(playerName1);
        Player player2 = findByName(playerName2);
        if (player1 == null) {
            throw new NotRegisteredException("Игрок: " + playerName1 + " не зарегестрирован!");
        }
        if (player2 == null) {
            throw new NotRegisteredException("Игрок: " + playerName2 + "не зарегестрирован!");
        }
        if (player1.getStrength() > player2.getStrength()) {
            return 1;
        } else if (player1.getStrength() < player2.getStrength()) {
            return 2;
        } else {
            return 0;
        }
    }
}
