package LandisPOCs;

import java.awt.*;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.font.PDCIDFontType2;
import org.apache.pdfbox.pdmodel.font.PDFont;
import org.apache.pdfbox.pdmodel.font.PDType0Font;
import org.apache.pdfbox.pdmodel.font.PDType1Font;

public class SelfTest {
	
	    private static final String USER_DIR = "user.dir";
	    private static final String FONT_PATH = "\\src\\LandisPOCs\\Resources\\DejaVuSans.ttf";
		static PDPageContentStream contentStream;

	public static void main(String[] args) {
		{
	        try {
	            PDDocument document = new PDDocument();
	            PDPage page = new PDPage();
	            document.addPage(page);

				contentStream = new PDPageContentStream(document, page);

	           // PDType1Font font = PDType1Font.HELVETICA;
	            String projectDirectory = System.getProperty(USER_DIR);
	            String relativePath = projectDirectory + FONT_PATH;
	            InputStream inputStream1 = new FileInputStream(relativePath);
	            PDType0Font font = PDType0Font.load(document,inputStream1);


	            int fontSize = 10;

	            float posX = 30f;
	            float posY = 200;
				float y2 = 180;


				//String infinitySymbol = "\u221E";
	            String errorTextTransformerLoading_1 = "NOTE: Loading calculated on Transformer is less than 11% or greater than 199% -- Verify meter loads";
				String errorTextTransformerLoading_2 = " and transformer mapping in AGA and/or contact AGA administrator to address any abnormalities.";
/*
				contentStream.beginText();
				contentStream.setFont(PDType1Font.HELVETICA, fontSize);
				contentStream.newLineAtOffset(x, y);
				contentStream.showText(text);
				contentStream.endText();


				contentStream.beginText();
				contentStream.setFont(PDType1Font.HELVETICA, fontSize);
				contentStream.newLineAtOffset(x, y-20);
				contentStream.showText(text2);
				contentStream.endText();*/

				showTextOnPDF(font, fontSize, posY, posX,errorTextTransformerLoading_1);
				showTextOnPDF(font, fontSize, posY-20, posX,errorTextTransformerLoading_2);

	            contentStream.close();

	            document.save("output_DeJavuSans6.pdf");
	            System.out.println(document.getDocument());
	            document.close();

	            System.out.println("PDF created successfully.");
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }
	}

	private static void showTextOnPDF(PDFont font, float fontSize, float posY, float posX, String text) throws IOException {
		contentStream.beginText();
		contentStream.setFont(font, fontSize);
		contentStream.newLineAtOffset(posX, posY);
		contentStream.showText(text);
		contentStream.endText();
	}

}
