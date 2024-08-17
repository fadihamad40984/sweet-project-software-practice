package sw_proj.helper;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.font.PDType1Font;
import sw_proj.usermanagement.User;

import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.List;

public class PDFGenerator {

    public void generateAndDisplayPDF(List<User> objects) {
        try (PDDocument document = new PDDocument()) {
            PDPage page = new PDPage();
            document.addPage(page);

            try (PDPageContentStream contentStream = new PDPageContentStream(document, page)) {
                contentStream.setFont(PDType1Font.HELVETICA, 12);
                contentStream.beginText();
                contentStream.setLeading(14.5f);
                contentStream.newLineAtOffset(25, 700);

                for (User obj : objects) {
                    Class<?> objClass = obj.getClass();
                    Field[] fields = objClass.getDeclaredFields();
                    contentStream.showText("Object: " + objClass.getSimpleName());
                    contentStream.newLine();

                    for (Field field : fields) {
                        field.setAccessible(true);
                        String name = field.getName();
                        Object value = field.get(obj);
                        contentStream.showText(name + ": " + value);
                        contentStream.newLine();
                    }

                    contentStream.newLine(); // Add extra space between objects
                }

                contentStream.endText();
            }

            // Save the document to a file
            String fileName = "output.pdf";
            document.save(fileName);

            // Display the PDF (this will depend on your OS and setup)
            if (Desktop.isDesktopSupported()) {
                File pdfFile = new File(fileName);
                Desktop.getDesktop().open(pdfFile);
            }
        } catch (IOException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
