import java.io.File;
import java.io.IOException;

public class Create_File {
    public static void main(String[] args) {

        File myFile = new File("file1.txt");
        try {
            myFile.createNewFile();
            System.out.println("File created successfully.");
        } catch (IOException e) {
            System.out.println("Unable to create this file");
            e.printStackTrace();
        }
    }
}
