package me.zoey.george;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Gui gui = new Gui();
        gui.setVisible(true);
        // new Gui().setVisible(true);
        new Game().Game(gui);
    }
}
