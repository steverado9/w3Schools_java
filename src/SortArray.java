import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortArray {
    public static void main(String[] args) {
        List<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");

        //Sort the array of cars alphabetically
        Collections.sort(cars);
        //reverse the sort
        Collections.sort(cars, Collections.reverseOrder());

        for (String i : cars) {
            System.out.println(i);
        }
    }
}
