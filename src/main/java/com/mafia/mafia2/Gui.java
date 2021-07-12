package com.mafia.mafia2;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

/**
 * interface
 */
public class Gui {

    Gui(){
        
        //starting
        JFrame frame = new JFrame();
        JPanel masterPanel = new JPanel();
        JButton btn = new JButton("+");
        

        //finishing
        frame.add(btn, BorderLayout.SOUTH);
        frame.add(masterPanel, BorderLayout.CENTER);
        frame.setSize(600, 600);
        frame.setMinimumSize(new Dimension(550,350));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}