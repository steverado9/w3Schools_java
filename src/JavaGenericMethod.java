public class JavaGenericMethod {
    //Generic method: works with any type T
    public static <T> void printArray(T[] array) {
        for (T item : array) {
            System.out.println(item);
        }
    }

    public static void main(String[] args) {
        //Array of Strings
        String[] names = {"Jenny", "Liam"};

        //Array of Integers
        Integer[] numbers = {1, 2, 3};

        //call the generic method with both arrays
        printArray(names);
        printArray(numbers);
        //This is useful when you want to write one method that works with multiple types,
        // instead of repeating code for each one
    }
}
