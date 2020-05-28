package me.zoey.george.gui;

import me.zoey.george.game.Game;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class SwingEvents {
    public void closeButtonMouseClicked(MouseEvent evt) {
        Component component = (Component) evt.getSource();
        JFrame frame = (JFrame) SwingUtilities.getRoot(component);

        ExitGUI exitGUI = new ExitGUI();
        exitGUI.setVisible(true);
    }

    public void minusButtonMouseClicked(java.awt.event.MouseEvent evt) {
        Component component = (Component) evt.getSource();
        JFrame frame = (JFrame) SwingUtilities.getRoot(component);

        frame.setExtendedState(JFrame.ICONIFIED);
    }

    public void enterButtonMouseClicked(MouseEvent evt, JTextField field, JTextField errorField) {
        String text = field.getText();

        if (text.isEmpty()) {
            errorField.setText("Type something, you dummy!");
        } else {
            Game.input = text;

            // Otherwise the answer wont be checked
            Game.inputIsEmpty = false;

            // Empties the text field so user doesn't have to delete old text
            field.setText("");

            // Removes error message if there is one
            errorField.setText("");
        }
    }

    public void logoFieldMouseClicked(MouseEvent evt, JLabel field) {
        ArrayList<Color> colors = new ArrayList<>();
        Collections.addAll(colors, Color.BLACK, Color.RED, Color.CYAN, Color.PINK, Color.GREEN, Color.GRAY);


            Random rand = new Random();
            Color finalColor = colors.get(rand.nextInt(colors.size()));
            field.setForeground(finalColor);
    }

    public void yesButtonMouseClicked(MouseEvent evt) {
        System.exit(0);
    }

    public void noButtonMouseClicked(MouseEvent evt) {
        Component component = (Component) evt.getSource();
        JFrame frame = (JFrame) SwingUtilities.getRoot(component);

        frame.dispose();
    }

    public void textInputFieldKeyPressed(KeyEvent evt, JTextField field, JTextField errorField) {
        String text = field.getText();

        if (evt.getKeyCode() == 10) {

            if (text.isEmpty()) {
                errorField.setText("Type something, you dummy!");
            } else {
                Game.input = text;

                // Otherwise the answer wont be checked
                Game.inputIsEmpty = false;

                // Empties the text field so user doesn't have to delete old text
                field.setText("");

                // Removes error message if there is one
                errorField.setText("");
            }
        }
    }

}
