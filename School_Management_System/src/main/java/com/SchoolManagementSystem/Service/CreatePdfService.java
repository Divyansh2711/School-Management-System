package com.SchoolManagementSystem.Service;
 
import java.awt.Color;
import java.io.IOException;
import java.util.List;
 
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Service;

import com.SchoolManagementSystem.Model.StudentRegistration;
import com.lowagie.text.*;
import com.lowagie.text.pdf.*;
 /***
  * 
  * Service class for creating pdf using a List  and download it.
  *
  *
  */
@Service
public class CreatePdfService {
	/***
	 *  instance variable of CreatePdfService Class 
	 */
    private List<StudentRegistration> listUsers;
    
    
    /***
     * Constructor 
  	 *
     * @param listUsers
     */
    public CreatePdfService(List<StudentRegistration> listUsers) {
        this.listUsers = listUsers;
    }
    
    /***
     * This method creates the Header of the table in Pdf
     * @param table
     */
    private void writeTableHeader(PdfPTable table) {
        PdfPCell cell = new PdfPCell();
        cell.setBackgroundColor(Color.BLUE);
        cell.setPadding(5);
         
        Font font = FontFactory.getFont(FontFactory.HELVETICA);
        font.setColor(Color.WHITE);
         
        cell.setPhrase(new Phrase("User ID", font));
         
        table.addCell(cell);
         
        cell.setPhrase(new Phrase("E-mail", font));
        table.addCell(cell);
         
        cell.setPhrase(new Phrase("Full Name", font));
        table.addCell(cell);
        
        cell.setPhrase(new Phrase("Grade", font));
        table.addCell(cell);
       
        cell.setPhrase(new Phrase("Address", font));
        table.addCell(cell);
        
        cell.setPhrase(new Phrase("Phone Number", font));
        table.addCell(cell);
         
       
    }
     
    
    /****
     * This method writes the rows of table using List 
     * @param table
     */
    private void writeTableData(PdfPTable table) {
        for (StudentRegistration user : listUsers) {
            table.addCell(String.valueOf(user.getID()));
            table.addCell(user.getEmail());
            table.addCell(user.getFirst_Name()+ user.getLast_Name());
            table.addCell(user.getGrade());
            table.addCell(user.getAddress());
            table.addCell(user.getPhone_no());
            
           
        }
    }
    /****
     * This method downloads the pdf using OutputStream
     * @param response
     * @throws DocumentException
     * @throws IOException
     */
    public void export(HttpServletResponse response) throws DocumentException, IOException {
        Document document = new Document(PageSize.A4);
        PdfWriter.getInstance(document, response.getOutputStream());
         
        document.open();
        Font font = FontFactory.getFont(FontFactory.HELVETICA_BOLD);
        font.setSize(18);
        font.setColor(Color.BLUE);
         
        Paragraph p = new Paragraph("Student Details", font);
        p.setAlignment(Paragraph.ALIGN_CENTER);
         
        document.add(p);
         
        PdfPTable table = new PdfPTable(6);
        table.setWidthPercentage(100f);
        table.setWidths(new float[] {1.5f, 3.5f, 3.0f, 3.0f, 3.5f, 3.5f});
        table.setSpacingBefore(10);
         
        writeTableHeader(table);
        writeTableData(table);
         
        document.add(table);
         
        document.close();
         
    }
}