package util;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.common.PDRectangle;
import org.apache.pdfbox.pdmodel.edit.PDPageContentStream;
import org.apache.pdfbox.pdmodel.font.PDFont;
import org.apache.pdfbox.pdmodel.font.PDType1Font;

public class PDFUtil {
    public static void createDocument(String path, String input) {
        PDDocument doc = null;
        try {
            doc = new PDDocument();
            PDFont font = PDType1Font.HELVETICA;
            PDPage page = new PDPage();
            doc.addPage(page);
            float fontSize = 12.0f;

            PDRectangle pageSize = page.getMediaBox();
            float centeredXPosition = (pageSize.getWidth() - fontSize
                    / 1000f) / 2f;
            float stringWidth = font.getStringWidth(input);
 
            PDPageContentStream contentStream = new PDPageContentStream(doc, page);
            contentStream.setFont(font, fontSize);
            contentStream.beginText();
            contentStream.moveTextPositionByAmount(centeredXPosition, 600);
            contentStream.drawString(input);
            contentStream.endText();
            contentStream.close();
            doc.save(path);
            doc.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}