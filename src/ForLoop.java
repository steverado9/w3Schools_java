public class ForLoop {
    public static void main(String[] args) {
        //print even numbers
        for (int i = 0; i < 5; i++) {
            System.out.println("numbers " + i);
        }
        //print Even numbers
        for (int i = 0; i <= 10; i = i + 2) {
            System.out.println("even numbers " + i);
        }
        //sum numbers
        int sum = 0;
        for (int i = 1; i <= 5; i++) {
            sum = sum + i;
        }
        System.out.println("Sum is " + sum);
        //count down
        for (int i = 5; i > 0; i--) {
            System.out.println(i);
        }
    }
}
