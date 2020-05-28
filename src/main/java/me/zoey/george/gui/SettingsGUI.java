package me.zoey.george.gui;

import me.zoey.george.Main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class SettingsGUI extends javax.swing.JFrame {

    public SettingsGUI() {
        initComponents();
    }

    private void initComponents() {
        DragListener drag = new DragListener();
        SwingEvents event = new SwingEvents();

        String imagePath = "Images/Icons/";

        Color backgroundColor = new Color(212, 215, 220);

        Cursor cursor = new Cursor(Cursor.HAND_CURSOR);

        mainPanel = new JPanel();
        closeButton = new JButton();

        closeIcon = new ImageIcon(Main.class.getResource(imagePath + "Close.png"));

        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        setAlwaysOnTop(true);
        toFront();
        addMouseListener(drag);
        addMouseMotionListener(drag);

        mainPanel.setBackground(backgroundColor);

        closeButton.setIcon(closeIcon);
        closeButton.setBorderPainted(false);
        closeButton.setBorder(null);
        closeButton.setMargin(new Insets(0,0,0,0));
        closeButton.setContentAreaFilled(false);
        closeButton.setCursor(cursor);
        closeButton.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                event.settingsCloseButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
                mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                                .addContainerGap(442, Short.MAX_VALUE)
                                .addComponent(closeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
        );
        mainPanelLayout.setVerticalGroup(
                mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(mainPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(closeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(342, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();

        setLocationRelativeTo(null);
    }

    private JButton closeButton;
    private JPanel mainPanel;

    private ImageIcon closeIcon;
}

