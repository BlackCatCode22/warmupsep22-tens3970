import java.io.File;
import java.io.IOException;
import java.io.FileWriter;
import java.util.Scanner;


public class WarmUp {
    public static void main(String[] args){
        try {
            File myFile = new File("C:/Users/Toby/Desktop/Programming/CIT Projects/WarmUp9-20/textFiles/test.txt");
            if (myFile.createNewFile()){
                System.out.println("Pog, new file made.");
            } else {
                System.out.println("Failed to create a new file.");
            }
        } catch (IOException e) {
            System.out.println("Error:");
            e.printStackTrace();
        }
        try {
            FileWriter Writer = new FileWriter("C:/Users/Toby/Desktop/Programming/CIT Projects/warmupsep22-tens3970/textFiles/test.txt");
            Writer.write("This is the text written into the new file");
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
        } catch (IOException e){
            System.out.println("Error:");
            e.printStackTrace();
        }
    }
}