/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.eng.moretto.arduinoturbo.ui;

/**
 *
 * @author oper
 */
 
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.border.Border;
import javax.swing.table.TableCellRenderer;
import java.awt.Color;
import java.awt.Component;
 
public class CellRenderer extends JLabel
                           implements TableCellRenderer {
    Border unselectedBorder = null;
    Border selectedBorder = null;
    boolean isBordered = true;
 
    public CellRenderer(boolean isBordered) {
        this.isBordered = isBordered;
        setOpaque(true); //MUST do this for background to show up.
    }
 
    public Component getTableCellRendererComponent(
                            JTable table, Object color,
                            boolean isSelected, boolean hasFocus,
                            int row, int column) {
        
        Color newColor = (Color)color;
        setBackground(newColor);
        
        
        System.out.println("aoaoao");
        if( (Integer) table.getValueAt(row, column) > 10)
                setBackground(Color.YELLOW);
        
        return this;
    }
    
    
}

