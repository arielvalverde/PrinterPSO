/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Controller.MainController;
import java.util.ArrayList;

/**
 *
 * @author ariel
 */
public class Process {
    private Message currentMessage;
    public  boolean bloqueo_enviar;
    private String ID;

    public Process(String pID) {
        ID = pID;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }
    
    public void send(Message mensaje){
        if(MainController.getInstance().getMailbox().existProcess(ID)==true){
            MainController.getInstance().getMailbox().addQueue(mensaje);
            System.out.println("Enviado a la cola");
        }
        else{
            System.out.println("No pertenece a la lista del Mailbox");
        }
    }
    
}
