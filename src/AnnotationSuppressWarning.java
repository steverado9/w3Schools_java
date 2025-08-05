import java.util.ArrayList;

public class AnnotationSuppressWarning {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        ArrayList cars = new ArrayList();
        cars.add("Volvo");
        System.out.println(cars);

        //However, instead of hiding the warning, you can fix it like this
        ArrayList<String> newCars = new ArrayList<>();
        //This approach is type-safe and avoids the need for suppression.
    }
}
