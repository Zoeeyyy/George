package me.zoey.george.gui;

import me.zoey.george.game.GameLogic;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

// This class contains all the events for the GUIs
public class SwingEvents {

    // When the close button is clicked
    public void closeButtonMouseClicked(MouseEvent evt) {
        // Pauses the game when you go to exit
        GameLogic.isGamePaused = true;

        // Opens the exit gui so you can confirm or cancel and makes it visible
        ExitGUI exitGUI = new ExitGUI();
        exitGUI.setVisible(true);
    }

    // When the minus button is clicked
    public void minusButtonMouseClicked(java.awt.event.MouseEvent evt) {
        // Gets the frame so you can minimize it
        Component component = (Component) evt.getSource();
        JFrame frame = (JFrame) SwingUtilities.getRoot(component);

        // Minimizes the frame
        frame.setExtendedState(JFrame.ICONIFIED);
    }

    // When the say button is clicked
    public void enterButtonMouseClicked(MouseEvent evt, JTextField field, JTextField errorField) {
        // Gets the input from the text field
        String text = field.getText();

        // If the input is empty it will display an error message
        if (text.isEmpty()) {
            // ErrorMessage
            errorField.setText("Type something, you dummy!");
        } else {
            // If the input isn't empty it will be sent to GameLogic
            GameLogic.input = text;

            // Otherwise the answer wont be checked
            GameLogic.inputIsEmpty = false;

            // Empties the text field so user doesn't have to delete old text
            field.setText("");

            // Removes error message if there is one
            errorField.setText("");
        }
    }

    // When the user clicks on the logo
    public void logoFieldMouseClicked(MouseEvent evt, JLabel field) {
        // Creates an arraylist for the colours and adds all colours to it
        ArrayList<Color> colors = new ArrayList<>();
        Collections.addAll(colors, Color.BLACK, Color.RED, Color.CYAN, Color.PINK, Color.GREEN, Color.GRAY);

        // Creates a new random number generator
        Random rand = new Random();

        // Using the random number generator gets a random colour from the arraylist and then sets it as the colour
        Color finalColor = colors.get(rand.nextInt(colors.size()));
        field.setForeground(finalColor);
    }

    // When the user confirms they want to close the program
    public void yesButtonMouseClicked(MouseEvent evt) {
        // Exits the program after the user confirmed they wanted to close the game
        System.exit(0);
    }

    // When the user cancels closing the program
    public void noButtonMouseClicked(MouseEvent evt) {
        // Gets the frame so you can close it
        Component component = (Component) evt.getSource();
        JFrame frame = (JFrame) SwingUtilities.getRoot(component);

        // Resumes the game since the user cancelled closing the game
        GameLogic.isGamePaused = false;

        // Closes the frame
        frame.dispose();
    }

    // When the user presses enter in the input field
    public void textInputFieldKeyPressed(KeyEvent evt, JTextField field, JTextField errorField) {
        // Retrieves the text from the textfield
        String text = field.getText();

        // If enter was pressed
        if (evt.getKeyCode() == 10) {

            // If the input is empty it sends an error message
            if (text.isEmpty()) {
                // Error message
                errorField.setText("Type something, you dummy!");
            } else {

                // If the input isn't empty it will be send to GameLogic
                GameLogic.input = text;

                // Otherwise the answer wont be checked
                GameLogic.inputIsEmpty = false;

                // Empties the text field so user doesn't have to delete old text
                field.setText("");

                // Removes error message if there is one
                errorField.setText("");
            }
        }
    }

    // When the settings get closed
    public void settingsCloseButtonMouseClicked(MouseEvent evt) {
        // Gets the frame so you can close it
        Component component = (Component) evt.getSource();
        JFrame frame = (JFrame) SwingUtilities.getRoot(component);

        // Resumes the game since the settings tab got closed
        GameLogic.isGamePaused = false;

        // Closes the frame
        frame.dispose();
    }

    // When the settings get opened
    public void settingsButtonMouseClicked(MouseEvent evt) {
        // When you open the settings GUI the game gets paused
        GameLogic.isGamePaused = true;

        // Creates a new GUI and makes it visible
        SettingsGUI settingsGUI = new SettingsGUI();
        settingsGUI.setVisible(true);
    }

    // When the main GUI loses focus
    public void formWindowLostFocus(java.awt.event.WindowEvent evt) {
        // When the window is minimized it pauses the game
        GameLogic.isGamePaused = true;
    }

    // When the main GUI gains focus
    public void formWindowGainedFocus(java.awt.event.WindowEvent evt) {
        // Resumes the game when the window has gained focus
        GameLogic.isGamePaused = false;
    }
}
