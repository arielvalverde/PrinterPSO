/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.util.ArrayList;
import Model.MailBox;

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

    /*public void executeCommand(String text) {
        String[] commands = text.split("\n");
        for(String str : commands) {
            String[] subString = str.split("[()]");
            String[] parameters = subString[1].split(",");
            if (subString[0].equals("create")){
                //CREATE COMMAND
                Model.Process process = new Model.Process(parameters[0],mailbox);
                getMailbox().addListSend(process);
                getMailbox().addListReceive(process);
                AddProcess(process);
            } else if (subString[0].equals("send")){
                //SEND COMMAND send(Destination, Source, Mesage)
                Message mensaje = new Message(parameters[0], parameters[1], parameters[2]);
                Model.Process process = getProcess(parameters[0]);
                process.sendMessage(mensaje,parameters[0]);
            } else if (subString[0].equals("receive")){
                //RECIEVE COMMAND
                Model.Process process = getProcess(parameters[0]);
                process.receiveMessage(parameters[1]);
            } else {
                //INVALID COMMAND
            }
            
        }
    }*/
}
