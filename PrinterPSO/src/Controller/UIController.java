/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import UI.MainWindow;
import javax.swing.JComboBox;
import javax.swing.JList;
import javax.swing.JTable;

/**
 *
 * @author Kenneth
 */
public class UIController {
    private MainWindow window;
    private MainController mainController;

    public UIController(MainController mainController){
        window = new MainWindow(this);
        this.mainController = mainController;
    }
    
    public void showWindow(){
        window.showWindow();
    }
    
    public void setCBProcesses(JComboBox comboBox){
        comboBox.setModel(new javax.swing.DefaultComboBoxModel<>(mainController.getProcessesString()));
    }
    
    public void printFile(javax.swing.JComboBox<String> CB_ComboBox, javax.swing.JTextArea TX_Content){
        mainController.printFile((String) CB_ComboBox.getSelectedItem(), TX_Content.getText());
    }

    public String[][] getPrinterQueue() {
        return this.mainController.getQueueTable();
    }

    public void doPrint() {
        mainController.printNext();
    }

    public void updateQueueTable(JTable QueueTable) {
        javax.swing.table.DefaultTableModel model =
                new javax.swing.table.DefaultTableModel(
                    getPrinterQueue(),
                new String [] {
                    "Process ID", "Content"
                }
        );
        QueueTable.setModel(model);
    }

}
