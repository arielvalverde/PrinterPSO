/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import UI.MainWindow;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Paragraph;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ariel
 */
public class Printer {
    public int counter = 0;

    public Printer() {
    }
    
    public void print(Message content) throws FileNotFoundException{
        if(content == null){
            return;
        }
        String dest = "C:\\Printer\\" + Integer.toString(counter++) + ".txt";
        File file = new File(dest);
        try {
            BufferedWriter writer;
            writer = new BufferedWriter(new FileWriter(file));
            writer.write(content.getContent());
            writer.close();
        } catch (IOException ex) {
            Logger.getLogger(MainWindow.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}