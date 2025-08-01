import java.util.TreeSet;
public class TreeSetClass {
    public static void main(String[] args) {
        TreeSet<String> cars = new TreeSet<>();
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
        //TreeSet Size
        System.out.println(cars.size());
        //Loop Through a TreeSet with a for-each loop
        for (String i : cars) {
            System.out.println(i);
        }

        //created an array of ordered numbers
        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(40);
        numbers.add(10);
        numbers.add(30);
        numbers.add(20);

        for (int n : numbers) {
            System.out.println(n);
        }
    }
}
