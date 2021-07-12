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
public class Guis {
    //main frame
    JFrame frame;
    JSplitPane masterPanel;
    JPanel leftPanel;
    JButton openFolder;

    //list
    JList<LabelItem> list;
    DefaultListModel<LabelItem> listModel;
    

    Guis(){
        //starting
        frame = new JFrame();
        leftPanel = new JPanel();
        masterPanel = new JSplitPane();

        JPanel example = new JPanel();

        //model for list
        listModel = new DefaultListModel<>();
        // listModel.addElement(new LabelItem("test"));
        // listModel.addElement(new LabelItem("test"));

        // list
        list = new JList<>();
        list.setModel(listModel);
        list.setCellRenderer(new LabelListRenderer());
        list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        list.setSelectionBackground(SystemColor.textHighlight);
        list.setFixedCellHeight(30);
        list.addListSelectionListener(new ListSelectionListener(){
            @Override
            public void valueChanged(ListSelectionEvent e) {
                // TODO Auto-generated method stub
                
                if (listModel.getElementAt(list.getSelectedIndex()).toString().equals("test")) {
                    list.getSelectedValue().getLabel().setText("test");
                    // listModel.addElement(new ButtonItem("+"));
                    // b1.setText("success");
                }
            }
            
        });

        //openFolder
        openFolder = new JButton("+");
        openFolder.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                listModel.addElement(new LabelItem("test"));
            }
            
        });
        

        leftPanel.setLayout(new BorderLayout());
        leftPanel.add(list, BorderLayout.CENTER);
        leftPanel.add(openFolder, BorderLayout.SOUTH);
        leftPanel.setMinimumSize(new Dimension(150, 0));
        
        masterPanel.setLeftComponent(leftPanel);
        masterPanel.setRightComponent(example);
        masterPanel.setOrientation(JSplitPane.HORIZONTAL_SPLIT);


        //finishing
        frame.setContentPane(masterPanel);
        frame.setSize(600, 600);
        frame.setMinimumSize(new Dimension(550,350));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}