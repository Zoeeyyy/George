package me.zoey.george;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Gui extends javax.swing.JFrame {

    public Gui() {
        initComponents();
    }

    private void initComponents() {
        DragListener drag = new DragListener();
        SwingEvents event = new SwingEvents();

        String imagePath = "Images/Icons/";

        Cursor cursor = new Cursor(Cursor.HAND_CURSOR);

        mainPanel = new javax.swing.JPanel();
        closeButton = new JButton();
        minusButton = new JButton();
        enterButton = new JButton();
        textInputField = new JTextField();
        errorField = new JTextField();
        logoField = new JTextField();
        storyField = new JTextField();
        jSeparator1 = new JSeparator();

        System.out.println(Main.class.getResource(""));
        try {
            closeIcon = new ImageIcon(Main.class.getResource(imagePath + "Close.png"));
            minusIcon = new ImageIcon(Main.class.getResource(imagePath + "Minus.png"));
            arrowIcon = new ImageIcon(Main.class.getResource(imagePath + "Arrow.png"));
        } catch (Exception e) {
            e.printStackTrace();
        }

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setTitle("George");
        setUndecorated(true);
        setResizable(false);
        addMouseListener(drag);
        addMouseMotionListener(drag);

        mainPanel.setBackground(new Color(172, 199, 178));

        closeButton.setIcon(closeIcon);
        closeButton.setBorderPainted(false);
        closeButton.setBorder(null);
        closeButton.setMargin(new Insets(0,0,0,0));
        closeButton.setContentAreaFilled(false);
        closeButton.setCursor(cursor);
        closeButton.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                event.closeButtonMouseClicked(evt);
            }
        });

        minusButton.setIcon(minusIcon);
        minusButton.setBorderPainted(false);
        minusButton.setBorder(null);
        minusButton.setMargin(new Insets(0, 0, 0, 0));
        minusButton.setContentAreaFilled(false);
        minusButton.setCursor(cursor);
        minusButton.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                event.minusButtonMouseClicked(evt);
            }
        });


        textInputField.setFont(new java.awt.Font("Arial", 0, 18));
        textInputField.setBackground(new Color(172, 199, 178));
        textInputField.setBorder(null);
        textInputField.setMargin(new Insets(0,0,0,0));
        textInputField.setText("");

        errorField.setFont(new java.awt.Font("Arial", 0, 18));
        errorField.setBackground(new Color(172, 199, 178));
        errorField.setBorder(null);
        errorField.setMargin(new Insets(0,0,0,0));
        errorField.setText("");
        errorField.setEditable(false);

        logoField.setFont(new java.awt.Font("Tahoma", 1, 36));
        logoField.setBackground(new Color(172, 199, 178));
        logoField.setForeground(new java.awt.Color(212, 72, 0));
        logoField.setBorder(null);
        logoField.setMargin(new Insets(0, 0, 0, 0));
        logoField.setEditable(false);
        logoField.setText("G E O R G E");

        storyField.setMargin(new Insets(0, 0, 0, 0));
        storyField.setBackground(new Color(172, 199, 178));
        storyField.setFont(new java.awt.Font("Arial", 0, 18));
        storyField.setEditable(false);
        storyField.setBorder(null);
        /* storyField.addMouseListener(drag);
        storyField.addMouseMotionListener(drag); */


        enterButton.setText("Say");
        enterButton.setBorderPainted(false);
        enterButton.setBorder(null);
        enterButton.setMargin(new Insets(0, 0, 0, 0));
        enterButton.setContentAreaFilled(false);
        enterButton.setCursor(cursor);
        enterButton.setIcon(arrowIcon);
        enterButton.setHorizontalTextPosition(SwingConstants.LEFT);
        enterButton.setFont(new java.awt.Font("Arial", 0, 18));
        enterButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                event.enterButtonMouseClicked(evt, textInputField, errorField);
            }
        });

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
                mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                                .addGap(459, 459, 459)
                                .addComponent(enterButton, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
                                .addGap(34, 34, 34))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                                                .addComponent(textInputField, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(47, 47, 47))
                                        .addComponent(errorField, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(storyField)
                                .addGap(47, 47, 47))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                                .addGap(73, 73, 73)
                                .addComponent(logoField)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(minusButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(closeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
        );
        mainPanelLayout.setVerticalGroup(
                mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(mainPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(closeButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(logoField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(minusButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addComponent(storyField, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(errorField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(textInputField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(15, 15, 15)
                                .addComponent(enterButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(35, 35, 35))
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

    private JPanel mainPanel;
    private JButton closeButton;
    private JButton minusButton;
    private JButton enterButton;
    private JSeparator jSeparator1;
    private JTextField textInputField;
    private JTextField errorField;
    private JTextField storyField;
    private JTextField logoField;

    private ImageIcon closeIcon;
    private ImageIcon minusIcon;
    private ImageIcon arrowIcon;




}

