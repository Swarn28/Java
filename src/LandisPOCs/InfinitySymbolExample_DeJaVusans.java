package LandisPOCs;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.font.PDType0Font;
import org.apache.pdfbox.pdmodel.font.PDType1Font;

import java.io.IOException;

public class InfinitySymbolExample_DeJaVusans {
    public static void main(String[] args) {
        try {
            PDDocument document = new PDDocument();
            PDPage page = new PDPage();
            document.addPage(page);

            PDPageContentStream contentStream = new PDPageContentStream(document, page);

            //PDType1Font font = PDType1Font.ZAPF_DINGBATS;
            PDType0Font font = PDType0Font.load(document, InfinitySymbolExample.class.getResourceAsStream("SelfTry/../Resources/DejaVuSans.ttf"));

            int fontSize = 12;
            contentStream.setFont(font, fontSize);

            float x = 100;
            float y = 700;
            contentStream.beginText();
            contentStream.newLineAtOffset(x, y);

           // String infinitySymbol = "\u221E";
            String infinitySymbol = "This is a test for DeJavu Font !!!";
            contentStream.showText(infinitySymbol);

            contentStream.endText();
            contentStream.close();

            document.save("output_DeJavuSans.pdf");
            document.close();

            System.out.println("PDF created successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}