/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package expense_income_tracker;

import com.formdev.flatlaf.FlatDarkLaf;
import javax.swing.*;
import javax.swing.JTable;
import java.awt.*;

/**
 *
 * @author mia
 */
public class ExpensesIncomesTracker extends JFrame{
    
    private final ExpenseIncomeTableModel model;
    private final JTable table;
    private final JTextField datefield;
    private final JTextField descriptionField;
    private final JTextField amountField;
    private final JComboBox<String>typeComboBox;
    private final JButton addButton; 
    private final JLabel balanceLabel;
    private double balance;
    
    
   public ExpensesIncomesTracker(){
    
    try{
        UIManager.setLookAndFeel(new FlatDarkLaf());
    
   }
   catch(Exception ex){
       System.err.println("Failed to Set FlatDarkLaf LookAndFeel");
   }
       
      UIManager.put("TextField.forground", Color.WHITE);
      UIManager.put("TextField.background", Color.DARK_GRAY);
      UIManager.put("TextField.caretForground", Color.RED);
      UIManager.put("ComboBox.forground", Color.YELLOW);
      UIManager.put("ComboBox.selectionForground", Color.WHITE);
      UIManager.put("ComboBox.background", Color.BLACK);
      UIManager.put("Button.forground", Color.WHITE);
      UIManager.put("Button.background", Color.ORANGE);
      UIManager.put("Label.forground", Color.RED);
      
      
      
      
 
   }