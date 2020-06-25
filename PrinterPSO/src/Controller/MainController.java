/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.util.ArrayList;
import Model.MailBox;
import Model.Message;

/**
 *
 * @author ariel
 */
public class MainController {
    private static MainController instance;
    private ArrayList<Model.Process> processes;
    private MailBox mailbox;
    private UIController uiController;

    private MainController() {
        processes = new ArrayList();
        mailbox = new MailBox();
        uiController = new UIController(this);
    }
    
    public static MainController getInstance(){
        if(instance == null){
            instance = new MainController();
        }
        
        return instance;
    }
    
    public MailBox getMailbox(){
        return mailbox;
    }

    public ArrayList getProcesses() {
        return processes;
    }
    
    public void AddProcess(Model.Process pProcess){
        processes.add(pProcess);
    }
    
    public ArrayList<String> getProcessesStringArrayList() {
        ArrayList<String> processList = new ArrayList();// [processes.size()];
        for(Model.Process process: processes){
            processList.add(process.getID());
        }
        return processList;
    }
    
    public String[] getProcessesString() {
        String[] processList = getProcessesStringArrayList().toArray(new String[0]);
        return processList;
    }
    
    
    public Model.Process getProcess(String ID){
        for(Model.Process process: processes){
            if(process.getID().equals(ID)){
                return process;
            }
        }
        return null;
    }
    
    public void setProcess(Model.Process proceso){
        for(int i = 0; i<processes.size();i++){
            if(processes.get(i).equals(proceso.getID())){
                processes.remove(i);
            }
        }
        processes.add(proceso);
    }

    public UIController getUIController(){
        return uiController;
    }
    
    public void printFile(String processID, String content){
        getProcess(processID).send(new Message(processID, content));
    }

    public String[][] getQueueTable() {
        return mailbox.queueToTable();
    } 

    public void printNext() {
        mailbox.printNext();
    }
}
