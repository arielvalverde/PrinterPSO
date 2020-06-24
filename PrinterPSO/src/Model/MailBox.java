/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author ariel
 */
public class MailBox {
    public ArrayList<Process> sendprocesses;
    public Printer printer;
    public Queue<Message> messages;

    public MailBox() {
        this.sendprocesses = new ArrayList<Process>();
        this.messages = new LinkedList<Message>();
    }

    public ArrayList<Process> getSendprocesses() {
        return sendprocesses;
    }

    public void setSendprocesses(ArrayList<Process> sendprocesses) {
        this.sendprocesses = sendprocesses;
    }
    
    public void addProcess(Process process){
        sendprocesses.add(process);
    }

    public Printer getPrinter() {
        return printer;
    }

    public void setPrinter(Printer printer) {
        this.printer = printer;
    }

    public Queue getMessages() {
        return messages;
    }

    public void setMessages(Queue messages) {
        this.messages = messages;
    }
    
    public boolean existProcess(String ID){
        for(Process process: sendprocesses){
            if(process.getID().equals(ID)){
                return true;
            }
        }
        return false;
    }
    
    public void addQueue(Message message){
        messages.add(message);  
    }
}