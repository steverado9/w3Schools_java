public class Recursion {
    public static void main(String[] args) {
        //Use recursion to add all of the numbers up to 10
        int result = sum(10);
        System.out.println("sum " + result);
        int answer = add(5, 10);
        System.out.println("add " + answer);
    }
    //Example 1
    public static int sum(int k) {
        if (k > 0) {
            return k + sum(k -1);
        } else {
            return 0;
        }
    }
    //Example 2
    public static int add(int start, int end) {
        if (end > start) {
            return end + add(start, end - 1);
        } else {
            return end;
        }
    }
}
