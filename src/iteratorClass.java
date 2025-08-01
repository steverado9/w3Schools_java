import java.util.ArrayList;
import java.util.Iterator;

public class iteratorClass {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(12);
        numbers.add(8);
        numbers.add(2);
        numbers.add(23);
        System.out.println(numbers);

        //Use an iterator to remove numbers less than 10 from a collection
        Iterator<Integer> it = numbers.iterator();
        while(it.hasNext()) {
            Integer i = it.next();
            if (i < 10) {
                it.remove();
            }
        }
        System.out.println(numbers);

    }
}
