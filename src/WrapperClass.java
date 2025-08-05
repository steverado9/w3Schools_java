import java.util.ArrayList;

public class WrapperClass {
    public static void main(String[] args) {
        //usng wrapper class with collection objects
        ArrayList<Integer> myNumbers = new ArrayList<Integer>();
        //Creating Wrapper Objects
        Integer myInt = 5;
        Double myDouble = 5.99;
        Character myChar = 'A';
        System.out.println(myInt);
        System.out.println(myDouble);
        System.out.println(myChar);
        // the following methods are used to get the value associated with the corresponding wrapper object
        System.out.println(myInt.intValue());
        System.out.println(myDouble.doubleValue());
        System.out.println(myChar.charValue());
        //toString() method
        // we convert an Integer to a String
        Integer myInt2 = 100;
        String myString = myInt2.toString();
        System.out.println(myString.length());
    }
}
