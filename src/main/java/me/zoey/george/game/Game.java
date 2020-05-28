package me.zoey.george.game;

import me.zoey.george.gui.MainGUI;

import java.awt.*;

public class Game {
    private static String username;
    private static MainGUI mainGUI;


    public void Game(MainGUI gui) throws InterruptedException {
        // Sets the mainGUI
        mainGUI = gui;

        // New GameLogic
        GameLogic g = new GameLogic();

        // The actual game

        GameLogic.sendText("Welcome traveler! What's your name?", Color.RED);

        username = g.awaitAnswer(true,null, null);

        g.sendText("Hello, " + username + "! How are you?", null);

        g.awaitAnswer(true, null, null);
        g.sendText("That's great " + username + "!", Color.PINK);

    }

    public static MainGUI getMainGUI() {
        return Game.mainGUI;
    }
}
