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
import java.io.IOException;

/**
 *
 * @author ariel
 */
public class Printer {
    public int estado;

    public Printer() {
    }
    
    public Message imprimir(String dest, String content) throws FileNotFoundException{
        if(MainController.getInstance().getMailbox().messages.isEmpty()){
            System.out.print("No hay nada para imprimir");
        }
        else{
            System.out.print("Imprimiendo");
            PdfWriter writer = new PdfWriter(dest);
            PdfDocument pdf = new PdfDocument(writer);

            Document document = new Document(pdf);
            document.add(new Paragraph(content));
            document.close();
            return MainController.getInstance().getMailbox().messages.poll();
        }
        return null;
    }
}
