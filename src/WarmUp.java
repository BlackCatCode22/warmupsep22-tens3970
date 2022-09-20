import java.io.File;
import java.io.IOException;
import java.io.FileWriter;
import java.util.Scanner;


public class WarmUp {
    public static void main(String[] args){
        try {
            File myFile = new File("C:/Users/Toby/Desktop/Programming/CIT Projects/WarmUp9-20/textFiles/test.txt");
            if (myFile.createNewFile()){
                System.out.println("New file made.");
            } else {
                System.out.println("Failed to create a new file.");
            }
        } catch (IOException e) {
            System.out.println("Error:");
            e.printStackTrace();
        }
        try {
            FileWriter Writer = new FileWriter("C:/Users/Toby/Desktop/Programming/CIT Projects/warmupsep22-tens3970/textFiles/test.txt");
            String textToWrite = "";
            for (int i = 0; i < 100; i++){
                textToWrite = textToWrite + "Line Numero:" + i + "\n";
            }
            Writer.write(textToWrite);
            Writer.close();
            System.out.println("Successfully Wrote into a new file.");
        }catch (IOException e){
            System.out.println("Error:");
            e.printStackTrace();
        }
        try {
            File fileToRead = new File("C:/Users/Toby/Desktop/Programming/CIT Projects/warmupsep22-tens3970/textFiles/test.txt");
            Scanner obj = new Scanner(fileToRead);
            while (obj.hasNextLine()){
                String data = obj.nextLine();
                System.out.println(data);
            }
            obj.close();
        } catch (IOException e){
            System.out.println("Error:");
            e.printStackTrace();
        }
            File fileToExamine = new File("C:/Users/Toby/Desktop/Programming/CIT Projects/warmupsep22-tens3970/textFiles/test.txt");
            if (fileToExamine.exists()){
                System.out.println("File Name: " + fileToExamine.getName());
                System.out.println("Absolute Path: " + fileToExamine.getAbsolutePath());
                System.out.println("Writeable: " + fileToExamine.canWrite());
                System.out.println("Readable: " + fileToExamine.canRead());
                System.out.println("File Size in Bytes: " + fileToExamine.length());
            } else {
                System.out.println("File does not exist");
            }
    }
}