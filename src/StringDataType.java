public class  StringDataType{
    public static void main(String[] args) {
        String greeting = "Hello";
        System.out.println("The length of greeting is: " + greeting.length());
        System.out.println(greeting.toUpperCase());
        System.out.println(greeting.toLowerCase());
        System.out.println(greeting.indexOf("e"));
        //string concatination
        String firstName = "Isaac ";
        String lastName = "Stephen";
        System.out.println(firstName + lastName);
        System.out.println(firstName.concat(lastName));
        //if you use the + operator on a string and number, you'll get string concatination
        String x = "10";
        int y = 20;
        System.out.println(x + y);
        //escape characters(\)
        String txt = "We are the so-called \"Vikings\" from the north.";
        System.out.println(txt);
        String newTxt = "It\'s alright.";
        System.out.println(newTxt);
        String backlashTxt = "The character \\ is called backlash.";
        System.out.println(backlashTxt);
        String newLineTxt = "This is a text \n This is a new line.";
        System.out.println(newLineTxt);
    }
}
