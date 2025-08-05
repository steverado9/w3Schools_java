//you can require that the type must be a subclass of Number
//Example Explained
//<T extends Number>: Restricts T to only work with numeric types like Integer, Double, or Float.
//.doubleValue(): Converts any number to a double for calculation.
//Works for any array of numbers as long as the elements are subclasses of Number.
class Stats<T extends Number> {
    T[] nums;

    //Constructor
    Stats(T[] nums) {
        this.nums = nums;
    }

    //Calculate average
    double average() {
        double sum = 0;
        for (T num : nums) {
            sum += num.doubleValue();
        }
        return sum / nums.length;
    }
}
public class JavaGenericBondedTypes {
    public static void main(String[] args) {
        //Use with Integer
        Integer[] intNums = {10, 20, 30, 40};
        Stats<Integer> intStats = new Stats<>(intNums);
        System.out.println("Integer avearge: " + intStats.average());

        //use with Double
        Double[] doubleNums = {1.5, 2.5, 3.5};
        Stats<Double> doubleStats = new Stats<>(doubleNums);
        System.out.println("Double average: " + doubleStats.average());
    }
    //Even though int values are used in the first case,
    // the .doubleValue() method converts them to double,
    // so the result is shown with a decimal point.
}
