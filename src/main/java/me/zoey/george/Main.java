package me.zoey.george;

import me.zoey.george.game.Game;
import me.zoey.george.game.GameLogic;
import me.zoey.george.gui.MainGUI;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        // new MainGUI instance and is then made visible
        MainGUI mainGUI = new MainGUI();
        mainGUI.setVisible(true);

        // New game instance
        new Game().Game(mainGUI);

        // Otherwise the game won't start
        GameLogic.setIsGamePaused(false);

    }
}
