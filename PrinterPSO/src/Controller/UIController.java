/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import UI.MainWindow;
import javax.swing.JComboBox;

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
    
}
