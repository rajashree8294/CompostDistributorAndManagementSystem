
package userInterface.LabRole.LabAssistant;

import business.models.User.User;
import business.models.workRequest.CompostGeneratedWorkRequest;
import business.models.workRequest.LabTestWorkRequest;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
 
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.ListItem;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.ZapfDingbatsList;
import com.itextpdf.text.pdf.PdfWriter;
import enterprise.Enterprise;
import java.util.ArrayList;
import javax.swing.JPanel;
 
public class PDFGenerator
{
    
   private CompostGeneratedWorkRequest request;
    private final int n;
    private final int p;
    private final int k;
   
   public PDFGenerator( CompostGeneratedWorkRequest  request,int n, int p, int k) {
       this.n=n;
       this.p=p;
       this.k=k;
        this.request = request;
        generate();
      
    }
   public void  generate()
   {
      Document document = new Document();
      try
      {
         PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream("CompostReport.pdf"));
         document.open();
         document.add(new Paragraph("Compost Report."));
         document.add(new Paragraph(request.getCompostUserName().toString()));
         ZapfDingbatsList zapfDingbatsList = new ZapfDingbatsList(43, 30);
         zapfDingbatsList.add(new ListItem("Nitrogen Value is"+n));
         zapfDingbatsList.add(new ListItem("Phosphorous value is"+ p));
         zapfDingbatsList.add(new ListItem("Potassium Value is"+ k));
         document.add(zapfDingbatsList);
         document.add(new Paragraph("Following metal traces are found"));
         ArrayList arr = request.getMetalContents();
          ZapfDingbatsList l = new ZapfDingbatsList(43, 30);
         for (int i = 0; i < arr.size(); i++){
             l.add(new ListItem(arr.get(i).toString()));
             document.add(l);
         }
         
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