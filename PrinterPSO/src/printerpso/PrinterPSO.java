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
import java.io.FileNotFoundException;

/**
 *
 * @author ariel
 */
public class PrinterPSO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        MainController.getInstance();
        Process nuevo1 = new Process("Proceso 1");
        Process nuevo2 = new Process("Proceso 2");
        Process nuevo3 = new Process("Proceso 3");
        Process nuevo4 = new Process("Proceso 4");
        Process nuevo5 = new Process("Proceso 5");

      
        MainController.getInstance().AddProcess(nuevo1);
        MainController.getInstance().AddProcess(nuevo2);
        MainController.getInstance().AddProcess(nuevo3);
        MainController.getInstance().AddProcess(nuevo4);
        MainController.getInstance().AddProcess(nuevo5);
        
        MainController.getInstance().getMailbox().addProcess(nuevo1);
        MainController.getInstance().getMailbox().addProcess(nuevo2);
        MainController.getInstance().getMailbox().addProcess(nuevo3);
        MainController.getInstance().getMailbox().addProcess(nuevo4);
        
        /*
        Proceso 5 no pertenece al mailbox
        MainController.getInstance().getMailbox().addProcess(nuevo5);
        */
        
        Printer printer = new Printer();
        MainController.getInstance().getMailbox().setPrinter(printer);

        MainController.getInstance().getUIController().showWindow();
    }
    
}
