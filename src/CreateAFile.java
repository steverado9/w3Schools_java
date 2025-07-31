import java.io.File; //import the File class
import java.io.IOException; //import the IOException class to handle errors
public class CreateAFile {
    public static void main(String[] args) {
        try {
            //create a file
            File myObj = new File("filename.txt");
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            } else {
                System.out.println("File already exist.");
            }
        } catch (IOException e) {
            System.out.println("An error occured.");
            e.printStackTrace();
        }
    }
}
