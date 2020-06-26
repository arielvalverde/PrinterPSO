/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Controller.MainController;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Paragraph;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author ariel
 */
public class Printer {
    public int estado;

    public Printer() {
    }
    
    public Message imprimir(String dest, Message content) throws FileNotFoundException{
        if(MainController.getInstance().getMailbox().messages.isEmpty()){
            System.out.print("No hay nada para imprimir");
        }
        else{
            File file = new File(dest);
            try{
                FileWriter fileW = new FileWriter(dest);
                fileW.write(  "Destination ID: " + content.getSourceID() 
                            + "\n" 
                            + "Content: " + content.getContent());
                fileW.close();
                System.out.println("Documento impreso");
            }
            catch(Exception e){
                System.out.println("Fallo al imprimir");
            }
            }
        return null;
    }
}
