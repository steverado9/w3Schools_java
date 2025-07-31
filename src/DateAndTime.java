import java.time.LocalDate; //import the localDate class
import java.time.LocalTime; //import the LocalTime class
import java.time.LocalDateTime; //import the LocalDateTime class
import java.time.format.DateTimeFormatter; //Import the DateTimeFormatter class

public class DateAndTime {
    public static void main(String[] args) {
        //Display Current Date
        LocalDate myObj = LocalDate.now(); //create a date object
        System.out.println("Today's date is " + myObj);

        //Display Current Time
        LocalTime myObj1 = LocalTime.now();
        System.out.println("The time is " + myObj1);

        //Display Current Date and Time
        LocalDateTime myObj2 = LocalDateTime.now();
        System.out.println("Today's date and time is = " + myObj2 + " Before formatting");

        //Formatting Date and Time
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formattedDate = myObj2.format(myFormatObj);
        System.out.println("After formatting: " + formattedDate);
    }
}
