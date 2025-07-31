import java.io.File; //Import the file clas
import java.io.FileNotFoundException; //import this class to handle errors
import java.util.Scanner; //Import the Scanner class to read text files
public class ReadFile {
    public static void main(String[] args) {
        try{
            File myObj = new File("filename.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
            if (myObj.exists()) {
                System.out.println("File name: " + myObj.getName());
                System.out.println("Absolute path: " + myObj.getAbsolutePath());
                System.out.println("Writeable: " + myObj.canWrite());
                System.out.println("Readable " + myObj.canRead());
                System.out.println("File size in bytes " + myObj.length());
            } else {
                System.out.println("The file does not exist.");
            }
        } catch(FileNotFoundException e) {
            System.out.println("An error occured.");
            e.printStackTrace();
        }
    }
}
