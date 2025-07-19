import java.util.Arrays;

public class ArrayExamples {
    public static void main(String[] args) {
        //To declare an array, define the variable type with square brackets
//        String[] cars;
        //We have now declared a variable that holds an array of strings
        //you can place the values in a comma-separated list, inside curly braces
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        //create an array of integers
        int[] myNum = {10, 20, 30, 40};
        //accessing the array by its index
        System.out.println(myNum[0]);
        System.out.println( Arrays.toString(myNum));
        //change an array element
        cars[0] = "Opel";
        System.out.println( Arrays.toString(cars));
        System.out.println(cars.length);
    }
}
