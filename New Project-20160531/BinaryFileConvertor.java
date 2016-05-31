import java.io.*;
import javax.xml.parsers.*;

public class BinaryFileConvertor{

     private String filePath;
     private String fileName;
     private String fullFilePath;
     private File binaryFile;
     private File xmlFile;
     private String xmlFilePath;
     private String xmlFileName;
     private String fullXmlFilePath;
     
     public BinaryFileConvertor(String filePath, String fileName, String xmlFilePath, String xmlFileName)
     {
         this.filePath = filePath;
         this.fileName = fileName;
         this.xmlFilePath = xmlFilePath;
         this.xmlFileName = xmlFileName;
         fullFilePath = filePath + fileName;
         fullXmlFilePath = xmlFilePath + xmlFileName;
         binaryFile = new File(fullFilePath);
         xmlFile = new File(fullXmlFilePath);
     }
     
     public static void main(String []args){
        System.out.println("Hello World");
        for(int k=0; k<args.length;k++)
            System.out.println(args[k] + "\t");
        BinaryFileConvertor bfc = new BinaryFileConvertor(args[0], args[1], args[2], args[3]);
        //FileReader fr = new FileReader();
     }
}
