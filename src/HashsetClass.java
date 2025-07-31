import java.util.HashSet;

public class HashsetClass {
    public static void main(String[] args) {
        HashSet<String> cars = new HashSet<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("FOrd");
        cars.add("BMW"); //duplicate
        cars.add("Mazda");
        System.out.println(cars);
    }
}
