import java.util.ArrayList;
import java.util.Collections;

public class ArrayListClass {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        //Add Elements to the array list
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");

        cars.add(0, "Mazda");//Insert element at the begining of the list at index(0)
        System.out.println(cars);

        //accessing elements in an array
        System.out.println(cars.get(0));
        System.out.println(cars.get(1));

        //Change an Element
        cars.set(0, "Opel");
        System.out.println(cars);

        //Remove an Element
        cars.remove(0);
        System.out.println(cars);

        //To remove all the elements in the ArrayList, use the clear() method
//        cars.clear();
        System.out.println(cars);

        //Arraylist Size
        System.out.println(cars.size());

        //Loop Through an ArrayList using for loop
        Collections.sort(cars); //sort numbers

        for (int i = 0; i < cars.size(); i++) {
            System.out.println(cars.get(i));
        }

        //Loop Through an ArrayList using for Each loop
        for (String i : cars) {
            System.out.println(i);
        }

        //Create an ArrayList to store numbers
        ArrayList<Integer> myNumbers = new ArrayList<Integer>();
        myNumbers.add(33);
        myNumbers.add(10);
        myNumbers.add(34);
        myNumbers.add(15);
        myNumbers.add(20);
        myNumbers.add(25);
        Collections.sort(myNumbers);  // Sort myNumbers
        for (int i : myNumbers) {
            System.out.println(i);
        }

    }
}
