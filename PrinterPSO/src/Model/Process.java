/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author ariel
 */
public class Process {
    private Message currentMessage;
    //private Mailbox mailboxAssociated;
    public  ArrayList<Message> messagessend = new ArrayList<Message>();
    public  ArrayList<Message> messagesprereceive = new ArrayList<Message>();
    public  ArrayList<Message> messagesreceive = new ArrayList<Message>();
    public  boolean bloqueo_enviar;
    public  boolean bloqueo_recibir;
    private String ID;

    public Process() {
    }
    
    public Process(String ID) {
        this.ID = ID;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }
    
    
}
