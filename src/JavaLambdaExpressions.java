import java.util.ArrayList;
import java.util.function.Consumer;

//Use a lambda expression in the ArrayList's forEach() method to print every item in the list
public class JavaLambdaExpressions {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(9);
        numbers.add(8);
        numbers.add(1);
        //storing lambda expression in a variable
        Consumer<Integer> method = (n) -> { System.out.println(n); };
        numbers.forEach(method);
    }
}
