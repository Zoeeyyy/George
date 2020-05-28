package me.zoey.george.game;


import me.zoey.george.gui.MainGUI;
import java.awt.*;

// This class contains all the game logic
public class GameLogic {
    public static Boolean inputIsEmpty;
    public static Boolean isGamePaused;

    public static String input;

    // When you need to await an answer from the user
    public String awaitAnswer (Boolean openAnswer, String answer1, String answer2, MainGUI gui) throws InterruptedException {
        // Resets the input
        inputIsEmpty = true;

        // When you don't have an open question the gui will display the options you have
        if (openAnswer.equals(false)) {
            gui.optionsField.setText("Options: [" + answer1 + "][" + answer2 + "]");
        }

        // This will loop till you get the result you need (an answer)
        while (true) {
            // Pauses the thread for 200 milliseconds so it doesn't overload the cpu
            Thread.sleep(200);

            // If input is empty it will wait till we get an answer from the user
            if (!inputIsEmpty.equals(true)) {

                // If it isn't an open question
                if (openAnswer.equals(false)) {

                    // If the input equals the first correct answer
                    if (input.toLowerCase().equals(answer1.toLowerCase().toLowerCase())) {
                        // Returns the answer
                        return answer1;

                    // Else if the input equals the second correct answer
                    } else if (input.toLowerCase().equals(answer2.toLowerCase())) {
                        // Returns the answer
                        return answer2;

                    // If the answer doesn't match either answer1 or answer2
                    } else {

                        // Displays error message
                        gui.errorField.setText("This doesn't match '" + answer1 + "' or '" + answer2 + "'!");
                        // Resets the input
                        inputIsEmpty = true;
                    }
                // If it is an open question
                } else {

                    // returns the answer
                    return input;
                }
            }
        }
    }

    // When you need to send text to the screen
    public void sendText (String text, Color textColor, MainGUI gui) throws InterruptedException {
        // Create's an empty string
        String textOut = "";

        // If the textColor isn't null
        if (textColor != null) {
            // Tries to set the colour to the specified colour but if it isn't a colour it catches the error
            try {
                gui.storyField.setForeground(textColor);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        // For each char in the text
        for(int i=0; i<text.length();i++){
            // Adds the text char to the string
            textOut += "" + text.charAt(i);
            // Prints the string, this creates a typing effect
            gui.storyField.setText(textOut);


            // while loop if the game is paused
            while (isGamePaused.equals(true)) {
                // Pauses the Thread so it doesn't overload the CPU
                Thread.sleep(100);

                // if the game is unpaused
                if (isGamePaused.equals(false)) {
                    // breaks the loop so it can continue
                    break;
                }
            }

            // Determines how fast the Text will be updated
            Thread.sleep(100);
        }
    }
}
