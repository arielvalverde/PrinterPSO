/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package printerpso;

import Controller.MainController;
import Model.Printer;
import Model.Process;
import Model.Message;

/**
 *
 * @author ariel
 */
public class PrinterPSO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MainController mc = MainController.getInstance();
        Process nuevo1 = new Process("Proceso 1");
        Process nuevo2 = new Process("Proceso 2");
        Process nuevo3 = new Process("Proceso 3");
        Printer printer = new Printer();
        mc.AddProcess(nuevo1);
        mc.AddProcess(nuevo2);
        mc.AddProcess(nuevo3);
                
        mc.getUIController().showWindow();
    }
    
}
