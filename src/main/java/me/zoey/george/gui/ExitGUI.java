package me.zoey.george.gui;

import me.zoey.george.Main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class ExitGUI extends javax.swing.JFrame {

public ExitGUI() {
        initComponents();
        }

private void initComponents() {
        DragListener drag = new DragListener();
        SwingEvents event = new SwingEvents();
        Color backgroundColor = new Color(212, 215, 220);
        String imagePath = "Images/Icons/";
        Cursor cursor = new Cursor(Cursor.HAND_CURSOR);

        backgroundPanel = new JPanel();

        yesButton = new JButton();
        noButton = new JButton();

        areYouSureLabel = new JLabel();

        yesIcon = new ImageIcon(Main.class.getResource(imagePath + "Yes.png"));
        noIcon = new ImageIcon(Main.class.getResource(imagePath + "No.png"));

        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        setAlwaysOnTop(true);
        addMouseListener(drag);
        addMouseMotionListener(drag);
        toFront();

        backgroundPanel.setBackground(backgroundColor);

        yesButton.setBorderPainted(false);
        yesButton.setBackground(backgroundColor);
        yesButton.setIcon(yesIcon);
        yesButton.setHorizontalTextPosition(SwingConstants.LEFT);
        yesButton.setBorder(null);
        yesButton.setMargin(new Insets(0,0,0,0));
        yesButton.setContentAreaFilled(false);
        yesButton.setCursor(cursor);
        yesButton.addMouseListener(drag);
        yesButton.addMouseMotionListener(drag);
        yesButton.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                        event.yesButtonMouseClicked(evt);
                }
        });

        noButton.setBorderPainted(false);
        noButton.setBackground(backgroundColor);
        noButton.setIcon(noIcon);
        noButton.setHorizontalTextPosition(SwingConstants.LEFT);
        noButton.setBorder(null);
        noButton.setMargin(new Insets(0,0,0,0));
        noButton.setContentAreaFilled(false);
        noButton.setCursor(cursor);
        noButton.addMouseListener(drag);
        noButton.addMouseMotionListener(drag);
        noButton.addMouseListener(new MouseAdapter() {
                public void mouseClicked(MouseEvent evt) {
                        event.noButtonMouseClicked(evt);
                }
        });


        areYouSureLabel.setText("Are you sure?");
        areYouSureLabel.setHorizontalAlignment(SwingConstants.CENTER);
        areYouSureLabel.setFont(new java.awt.Font("Arial", 0, 18));
        areYouSureLabel.addMouseListener(drag);
        areYouSureLabel.addMouseMotionListener(drag);

        GroupLayout backgroundPanelLayout = new GroupLayout(backgroundPanel);
        backgroundPanel.setLayout(backgroundPanelLayout);
        backgroundPanelLayout.setHorizontalGroup(
                backgroundPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(GroupLayout.Alignment.TRAILING, backgroundPanelLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(backgroundPanelLayout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(areYouSureLabel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(backgroundPanelLayout.createSequentialGroup()
                                                .addComponent(yesButton, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, 0)
                                                .addComponent(noButton, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, 0))
        );
        backgroundPanelLayout.setVerticalGroup(
                backgroundPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(GroupLayout.Alignment.TRAILING, backgroundPanelLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(areYouSureLabel, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addGroup(backgroundPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                        .addComponent(noButton, GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                                        .addComponent(yesButton, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(backgroundPanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(backgroundPanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        );

        pack();

        setLocationRelativeTo(null);
        }

private JPanel backgroundPanel;

private JButton yesButton;
private JButton noButton;

private JLabel areYouSureLabel;

private ImageIcon yesIcon;
private ImageIcon noIcon;
}

