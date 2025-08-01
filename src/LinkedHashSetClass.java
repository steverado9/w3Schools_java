import java.util.LinkedHashSet;

public class LinkedHashSetClass {
    public static void main(String[] args) {
        LinkedHashSet<String> cars = new LinkedHashSet<>();
        //Add elements
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("BMW"); //Duplicate
        cars.add("Mazda");

        //Check if an Element Exists
        System.out.println(cars.contains("Mazda"));
        //Remove an Element
        cars.remove("Volvo");
        System.out.println(cars);
        //LinkedHashSet Size
        System.out.println(cars.size());
        //Loop Through a LinkedHashSet with a for-each loop
        for (String car : cars) {
            System.out.println(car);
        }
    }

}
