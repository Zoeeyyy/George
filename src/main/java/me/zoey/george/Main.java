package me.zoey.george;

import me.zoey.george.game.Game;
import me.zoey.george.gui.MainGUI;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        MainGUI mainGUI = new MainGUI();
        mainGUI.setVisible(true);

        new Game().Game(mainGUI);

    }
}
