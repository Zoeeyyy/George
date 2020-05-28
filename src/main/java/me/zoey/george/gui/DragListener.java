package me.zoey.george.gui;

import javax.swing.*;
import javax.swing.event.MouseInputAdapter;
import java.awt.*;
import java.awt.event.MouseEvent;

public class DragListener extends MouseInputAdapter {
    Point location;
    MouseEvent pressed;

    public void mousePressed(MouseEvent me) {
        // Sets the new mouse event that gets used in mouseDragged
        pressed = me;
    }

    public void mouseDragged(MouseEvent me) {
        // Gets the frame that gets dragged
        Component component = (Component) me.getSource();
        JFrame frame = (JFrame) SwingUtilities.getRoot(component);

        // Gets the current location of the frame
        location = frame.getLocation(location);

        // Calculates the new location
        int x = location.x - pressed.getX() + me.getX();
        int y = location.y - pressed.getY() + me.getY();

        // Sets the new location
        frame.setLocation(x, y);
    }
}