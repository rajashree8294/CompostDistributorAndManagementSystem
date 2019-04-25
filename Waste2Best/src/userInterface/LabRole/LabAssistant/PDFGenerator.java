
package userInterface.LabRole.LabAssistant;

import business.models.User.User;
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
import javax.swing.JPanel;
 
public class PDFGenerator
{
    
   private LabTestWorkRequest request;
   
   
   public PDFGenerator( LabTestWorkRequest  request) {
       
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
         ZapfDingbatsList zapfDingbatsList = new ZapfDingbatsList(43, 30);
         zapfDingbatsList.add(new ListItem("Nitrogen Value is"+request.getNitrogen()));
         zapfDingbatsList.add(new ListItem("Phosphorous value is"+ request.getPhosphorous()));
         zapfDingbatsList.add(new ListItem("Potassium Value is"+ request.getPotassium()));
         document.add(zapfDingbatsList);
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