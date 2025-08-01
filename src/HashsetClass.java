import java.util.HashSet;

public class HashsetClass {
    public static void main(String[] args) {
        HashSet<String> cars = new HashSet<String>();
        //Add Elements
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("FOrd");
        cars.add("BMW"); //duplicate
        cars.add("Mazda");
        //check if element exists
        System.out.println(cars.contains("Mazda"));
        //remove element
        cars.remove("Volvo");
        //check Hashset size
        System.out.println(cars.size());
        System.out.println(cars);
        //Loop Through a HashSet
        for(String i : cars) {
            System.out.println(i);
        }
        // Create a HashSet object called numbers
        HashSet<Integer> numbers = new HashSet<Integer>();
        //Add values to the set
        numbers.add(4);
        numbers.add(7);
        numbers.add(8);
        //Show which numbers between 1 and 10 are in the set
        for (int i = 0; i < 10; i++) {
            if (numbers.contains(i)) {
                System.out.println(i + " was found in the set");
            } else {
                System.out.println(i + " was not found in the set");
            }
        }

    }
}
