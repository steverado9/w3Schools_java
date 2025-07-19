import java.sql.SQLOutput;

public class BreakAndContinue {
    public static void main(String[] args) {
        //using break statement
        for (int i = 0; i < 10; i++) {
            if (i == 4) { // flase, false , false, false, true
                break;
            }
            System.out.println("break " + i); //0 , 1, 2 , 3
        }
        //using continue statement
        for (int i = 0; i < 10; i++) {
            if (i == 4) {
                continue;
            }
            System.out.println("continue " + i);
        }
    }
}
