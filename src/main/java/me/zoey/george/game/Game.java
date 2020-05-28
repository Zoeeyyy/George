package me.zoey.george.game;

import me.zoey.george.gui.MainGUI;

import java.awt.*;

public class Game {
    private static String username;


    public void Game(MainGUI gui) throws InterruptedException {
        GameLogic g = new GameLogic();

        g.sendText("Welcome traveler! What's your name?", Color.RED, gui);

        username = g.awaitAnswer(true,null, null, gui);

        g.sendText("Hello, " + username + "! How are you?", null, gui);

        g.awaitAnswer(true, null, null, gui);
        g.sendText("That's great " + username + "!", Color.PINK, gui);

    }
}
