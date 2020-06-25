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
      
        MainController.getInstance();
        Process nuevo1 = new Process("Proceso 1");
        Process nuevo2 = new Process("Proceso 2");
        Process nuevo3 = new Process("Proceso 3");

      
        MainController.getInstance().AddProcess(nuevo1);
        MainController.getInstance().AddProcess(nuevo2);
        MainController.getInstance().AddProcess(nuevo3);
        
        MainController.getInstance().getMailbox().addProcess(nuevo1);
        MainController.getInstance().getMailbox().addProcess(nuevo2);
        //MainController.getInstance().getMailbox().addProcess(nuevo3);
        
        Printer printer = new Printer();
        MainController.getInstance().getMailbox().setPrinter(printer);
        
        Message m1 = new Message();
        Message m2 = new Message();
        Message m3 = new Message();
        
        
        nuevo1.send(m1);
        nuevo2.send(m2);
        nuevo3.send(m3);
        
        printer.imprimir();
        printer.imprimir();
        printer.imprimir();
        printer.imprimir();
 
        MainController.getInstance().getUIController().showWindow();
    }
    
}
