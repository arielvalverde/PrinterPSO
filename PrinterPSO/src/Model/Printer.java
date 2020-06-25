/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Paragraph;
import java.io.File;
import java.io.FileNotFoundException;

/**
 *
 * @author ariel
 */
public class Printer {
    public int counter = 0;

    public Printer() {
    }
    
    public void print(Message content) throws FileNotFoundException{
        String dest = "C:\\Printer\\" + Integer.toString(counter++) + ".pdf";
        File file = new File(dest);

        PdfWriter writer = new PdfWriter(file.getAbsolutePath());
        PdfDocument pdf = new PdfDocument(writer);

        Document document = new Document(pdf);
        document.add(new Paragraph("Destination ID: " + content.getSourceID()));
        document.add(new Paragraph("Content: " + content.getContent()));

        document.close();
    }
}