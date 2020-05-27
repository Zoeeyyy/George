package me.zoey.george;

import javax.swing.*;
import java.awt.*;

public class Game {
    public static String input = null;
    public static Boolean inputIsEmpty = true;

    private static String username;


    public void Game(Gui gui) throws InterruptedException {
        GameLogic g = new GameLogic();

        g.sendText("Welcome traveler! What's your name?", Color.CYAN, gui);

        username = g.awaitAnswer(true,null, null, gui);

        g.sendText("Hello, " + username + "! How are you?", null, gui);

        g.awaitAnswer(true, null, null,  gui);
        g.sendText("That's great " + username + "!", Color.PINK, gui);

    }
}
