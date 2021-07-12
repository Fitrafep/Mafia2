package com.mafia.mafia2;

import javax.swing.*;
import java.awt.*;

public class LabelListRenderer extends DefaultListCellRenderer {
        public Component getListCellRendererComponent(JList comp, Object value, int index,
                                                  boolean isSelected, boolean hasFocus)
    {
      setEnabled(comp.isEnabled());
      setFont(comp.getFont());

      if(value == null){
        setText("");
      }else{
        setText(value.toString());
      }

      if (isSelected)
      {
        setBackground(comp.getSelectionBackground());
        setForeground(comp.getSelectionForeground());
      }
      else
      {
        setBackground(comp.getBackground());
        setForeground(comp.getForeground());
      }

      return this;
    }
  
}
