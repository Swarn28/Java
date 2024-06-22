package LandisPOCs.SCLReport;

import javax.swing.*;
import javax.xml.xpath.XPath;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ChangeName {
    private static final String COLLEN = ":";

    private static final String DASH = "-";
    public static void main(String[] args) {


        String fileName = "TrLoadReport-2023-08-02T20:46:52.336196.pdf";
        String newName =  fileName.replace(COLLEN, DASH);
        //System.out.println(newName);

        String pathDir = "C:/software/";
        Path path = Paths.get(pathDir);
        Path finalP = getOutPath(path,".pdf");

        System.out.println("path is : "+finalP.toFile().getName());

        System.out.println("absolute path: "+finalP.getParent().toAbsolutePath().toString());

    }

    public static Path getOutPath(Path dir, String ext) {
        String fileName = "TrLoadReport-" + LocalDateTime.now().format(DateTimeFormatter.ISO_DATE_TIME) + ext;
        String newFileName = fileName.replace(COLLEN, DASH);
        return dir.resolve(newFileName);
    }

}
