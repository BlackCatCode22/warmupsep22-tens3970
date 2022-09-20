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
                System.out.println("File already existed man.");
            }
        } catch (IOException e) {
            System.out.println("Failed");
            e.printStackTrace();
        }
        try {
            FileWriter bobby = new FileWriter("C:/Users/Toby/Desktop/Programming/CIT Projects/WarmUp9-20/textFiles/test.txt");
            bobby.write("Yooo?");
            bobby.write("Yooo?");
            bobby.close();
            System.out.println("This did in fact work.");
        }catch (IOException e){
            System.out.println("Couldn't write for some reason");
            e.printStackTrace();
        }
        try {
            File blob = new File("C:/Users/Toby/Desktop/Programming/CIT Projects/WarmUp9-20/textFiles/test.txt");
            Scanner blobJR = new Scanner(blob);
            while (blobJR.hasNextLine()){
                String data = blobJR.nextLine();
                System.out.println(data);
            }
        } catch (IOException e){
            System.out.println("Couldn't Write");
            e.printStackTrace();
        }
    }
}