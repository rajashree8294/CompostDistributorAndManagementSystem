
package userInterface.LabRole.LabAssistant;

import business.models.User.User;
import business.models.workRequest.CompostGeneratedWorkRequest;
import business.models.workRequest.LabTestWorkRequest;
import com.itextpdf.text.BadElementException;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
 
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Image;
import com.itextpdf.text.ListItem;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.ZapfDingbatsList;
import com.itextpdf.text.pdf.CMYKColor;
import com.itextpdf.text.pdf.PdfWriter;
import enterprise.Enterprise;
import java.awt.Font;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JPanel;
 
public class PDFGenerator
{
    
   private CompostGeneratedWorkRequest request;
    private final int n;
    private final int p;
    private final int k;
    private ArrayList<String> arr;
    private String rating;
   
   public PDFGenerator( CompostGeneratedWorkRequest  request,int n, int p, int k, String rating) throws BadElementException, IOException {
       this.n=n;
       this.p=p;
       this.k=k;
       arr = new ArrayList<String>();
       this.rating=rating;
     
        this.request = request;
        generate();
      
    }
   public void  generate() throws BadElementException, IOException  
   {
       com.itextpdf.text.Font redFont = FontFactory.getFont(FontFactory.COURIER, 12, Font.BOLD, new CMYKColor(0, 255, 0, 0));
      Document document = new Document();
      try
      {
         PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream("CompostReport.pdf"));
         document.open();
         document.add(new Paragraph("                             Compost Quality Report       ",redFont));
         document.add(new Paragraph("This is the compost Report provided by Waste2Best Diagnostics Center"));
         document.add(new Paragraph("The username of compost generator is " +request.getCompostUserName().toString()+ " and it has following NPK values"));
         ZapfDingbatsList zapfDingbatsList = new ZapfDingbatsList(43, 30);
         zapfDingbatsList.add(new ListItem("Nitrogen Value is "+ n));
         zapfDingbatsList.add(new ListItem("Phosphorous value is "+ p));
         zapfDingbatsList.add(new ListItem("Potassium Value is "+ k));
         document.add(new Paragraph("Compost Rating is "+rating));
         document.add(zapfDingbatsList);
         document.add(new Paragraph("Following metal traces are found in the Sample"));
         
          arr = request.getMetalContents();
          ZapfDingbatsList l = new ZapfDingbatsList(43, 30);
         for (int i = 0; i < arr.size(); i++){
             l.add(new ListItem(arr.get(i).toString()));
             
         }
         document.add(l);
         Image image1 = Image.getInstance("image.png");
         //Fixed Positioning
         image1.setAbsolutePosition(320f, 550f);
         //Scale to new height and new width of image
         image1.scaleAbsolute(200, 200);
         //Add to document
         document.add(image1);
         
         document.close();
         writer.close();
      } catch (DocumentException e)
      {
         e.printStackTrace();
      } catch (FileNotFoundException e)
      {
         e.printStackTrace();
      }
   }
}