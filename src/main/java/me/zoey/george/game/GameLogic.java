package me.zoey.george.game;

import me.zoey.george.Main;
import me.zoey.george.gui.MainGUI;

import javax.print.attribute.standard.NumberUp;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.awt.*;

import static me.zoey.george.game.Game.inputIsEmpty;
import static me.zoey.george.game.Game.input;

public class GameLogic {

    public String awaitAnswer (Boolean openAnswer, String answer1, String answer2, MainGUI gui) throws InterruptedException {
        Boolean canContinue = false;
        inputIsEmpty = true;

        if (openAnswer.equals(false)) {
            gui.optionsField.setText("Options: [" + answer1 + "][" + answer2 + "]");
        }

        while (canContinue.equals(false)) {
            Thread.sleep(200);

            if (!inputIsEmpty.equals(true)) {

                if (openAnswer.equals(false)) {

                    if (input.toLowerCase().equals(answer1.toLowerCase().toLowerCase())) {
                        canContinue = true;
                        input = null;
                        inputIsEmpty = true;
                        return answer1;
                    } else if (input.toLowerCase().equals(answer2.toLowerCase())) {
                        canContinue = true;
                        input = null;
                        inputIsEmpty = true;
                        return answer2;
                    } else {
                        input = null;
                        gui.errorField.setText("This doesn't match '" + answer1 + "' or '" + answer2 + "'!");
                        inputIsEmpty = true;
                    }
                } else {

                    canContinue = true;
                    String answer = input;
                    input = null;
                    inputIsEmpty = true;
                    return answer;
                }
            }
        }
        return null;
    }

    public void sendText (String text, Color textColor, MainGUI gui) {
        String textOut = "";

        if (textColor != null) {
            try {
                gui.storyField.setForeground(textColor);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        for(int i=0; i<text.length();i++){
            textOut += "" + text.charAt(i);
            gui.storyField.setText(textOut);
            try {
                Thread.sleep(100);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        gui.validate();
    }
}
