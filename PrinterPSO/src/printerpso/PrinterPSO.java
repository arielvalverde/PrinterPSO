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
        Process nuevo1 = new Process();
        Process nuevo2 = new Process();
        Printer printer = new Printer();
        Message m1 = new Message();
        Message m2 = new Message();
        Message m3 = new Message();
        mc.getMailbox().imprimir();
        mc.getMailbox().getMessages().add(m1);
        mc.getMailbox().getMessages().add(m2);
        mc.getMailbox().getMessages().add(m3);
        System.out.print(mc.getMailbox().getMessages().size());
        mc.getMailbox().imprimir();
        System.out.print(mc.getMailbox().getMessages().size());
    }
    
}
