package me.zoey.george.gui;

import me.zoey.george.Main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowEvent;
import java.awt.event.WindowFocusListener;

public class MainGUI extends javax.swing.JFrame {

    public MainGUI() {
        initComponents();
    }

    private void initComponents() {
        DragListener drag = new DragListener();
        SwingEvents event = new SwingEvents();

        String imagePath = "Images/Icons/";

        Color backgroundColor = new Color(242, 243, 245);

        Cursor cursor = new Cursor(Cursor.HAND_CURSOR);

        mainPanel = new javax.swing.JPanel();
        closeButton = new JButton();
        minusButton = new JButton();
        enterButton = new JButton();
        settingsButton = new JButton();
        textInputField = new JTextField();
        errorField = new JTextField();
        logoField = new JLabel();
        storyField = new JTextField();
        optionsField = new JTextField();
        jSeparator1 = new JSeparator();
        closeIcon = new ImageIcon(Main.class.getResource(imagePath + "Close.png"));
        minusIcon = new ImageIcon(Main.class.getResource(imagePath + "Minus.png"));
        arrowIcon = new ImageIcon(Main.class.getResource(imagePath + "Arrow.png"));
        settingsIcon = new ImageIcon(Main.class.getResource(imagePath + "Settings.png"));


        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setTitle("George");
        setUndecorated(true);
        setResizable(false);
        addMouseListener(drag);
        addMouseMotionListener(drag);
        addWindowFocusListener(new WindowFocusListener() {
            public void windowGainedFocus(WindowEvent evt) {
                event.formWindowGainedFocus(evt);
            }
            public void windowLostFocus(WindowEvent evt) {
                event.formWindowLostFocus(evt);
            }
        });

        mainPanel.setBackground(backgroundColor);

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
        textInputField.setBackground(backgroundColor);
        textInputField.setBorder(null);
        textInputField.setMargin(new Insets(0,0,0,0));
        textInputField.setText("");
        textInputField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                event.textInputFieldKeyPressed(evt);
            }
        });

        errorField.setFont(new java.awt.Font("Arial", 0, 18));
        errorField.setBackground(backgroundColor);
        errorField.setBorder(null);
        errorField.setMargin(new Insets(0,0,0,0));
        errorField.setText("");
        errorField.setEditable(false);

        logoField.setFont(new java.awt.Font("Tahoma", 1, 36));
        logoField.setBackground(backgroundColor);
        logoField.setForeground(new java.awt.Color(212, 72, 0));
        logoField.setBorder(null);
        logoField.setText("G E O R G E");
        logoField.addMouseListener(drag);
        logoField.addMouseMotionListener(drag);
        logoField.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                event.logoFieldMouseClicked(evt, logoField);
            }
        });

        storyField.setMargin(new Insets(0, 0, 0, 0));
        storyField.setBackground(backgroundColor);
        storyField.setFont(new java.awt.Font("Arial", 0, 20));
        storyField.setEditable(false);
        storyField.setBorder(null);
        storyField.addMouseListener(drag);
        storyField.addMouseMotionListener(drag);

        optionsField.setMargin(new Insets(0, 0, 0, 0));
        optionsField.setBackground(backgroundColor);
        optionsField.setFont(new java.awt.Font("Arial", 0, 18));
        optionsField.setEditable(false);
        optionsField.setBorder(null);


        enterButton.setText("Say");
        enterButton.setBorderPainted(false);
        enterButton.setBorder(null);
        enterButton.setMargin(new Insets(0, 0, 0, 0));
        enterButton.setContentAreaFilled(false);
        enterButton.setCursor(cursor);
        enterButton.setIcon(arrowIcon);
        enterButton.setHorizontalTextPosition(SwingConstants.LEFT);
        enterButton.setFont(new java.awt.Font("Arial", 0, 18));
        enterButton.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                event.enterButtonMouseClicked(evt);
            }
        });

        settingsButton.setIcon(settingsIcon);
        settingsButton.setBorderPainted(false);
        settingsButton.setBorder(null);
        settingsButton.setMargin(new Insets(0,0,0,0));
        settingsButton.setContentAreaFilled(false);
        settingsButton.setCursor(cursor);
        settingsButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                event.settingsButtonMouseClicked(evt);
            }
        });

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
                mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                                                .addComponent(textInputField, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(47, 47, 47))
                                        .addComponent(errorField, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(mainPanelLayout.createSequentialGroup()
                                .addGap(454, 454, 454)
                                .addComponent(enterButton, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
                                .addGap(34, 34, 34))
                        .addGroup(mainPanelLayout.createSequentialGroup()
                                .addGap(73, 73, 73)
                                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                                                .addComponent(logoField)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(settingsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(10, 10, 10)
                                                .addComponent(minusButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(closeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(mainPanelLayout.createSequentialGroup()
                                                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(optionsField, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(storyField, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(0, 0, Short.MAX_VALUE)))
                                .addContainerGap())
        );
        mainPanelLayout.setVerticalGroup(
                mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(mainPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(closeButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(logoField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(minusButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(settingsButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addComponent(storyField, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(optionsField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
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
    private JButton settingsButton;
    private JSeparator jSeparator1;
    private JTextField textInputField;
    private JTextField errorField;

    private JTextField storyField;
    private JLabel logoField;
    private JTextField optionsField;

    private ImageIcon closeIcon;
    private ImageIcon minusIcon;
    private ImageIcon arrowIcon;
    private ImageIcon settingsIcon;

    public void setStoryFieldText(String text) {
        this.storyField.setText(text);
    }

    public void setStoryFieldColor(Color color) {
        this.storyField.setForeground(color);
    }

    public void setOptionsFielText(String text) {
        this.optionsField.setText(text);
    }

    public void setErrorFieldText(String text) {
        this.errorField.setText(text);
    }

    public String getTextInputFieldText() {
        return this.textInputField.getText();
    }

    public void setTextInputFieldText(String text) {
        this.textInputField.setText(text);
    }
}

