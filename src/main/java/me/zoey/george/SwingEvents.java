package me.zoey.george;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;

public class SwingEvents {
    public void closeButtonMouseClicked(MouseEvent evt) {
        System.exit(0);
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
            // TODO: handler

            // Empties the text field so user doesn't have to delete old text
            field.setText("");

            // Removes error message if there is one
            errorField.setText("");
        }
    }
}
