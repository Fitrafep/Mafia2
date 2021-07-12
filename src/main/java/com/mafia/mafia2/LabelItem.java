package com.mafia.mafia2;

import javax.swing.JLabel;

public class LabelItem {
    private JLabel label;

    public LabelItem(String name) {
        this.label = new JLabel(" " + name);
    }

    public JLabel getLabel() {
        return this.label;
    }

    public String toString(){
        return label.getText();
    }
}
