/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Controller.MainController;

/**
 *
 * @author ariel
 */
public class Printer {
    public int estado;

    public Printer() {
    }
    
    public Message imprimir(){
        if(MainController.getInstance().getMailbox().messages.isEmpty()){
            System.out.print("No hay nada para imprimir");
        }
        else{
            System.out.print("Imprimiendo");
            return MainController.getInstance().getMailbox().messages.poll();
        }
        return null;
    }
}
