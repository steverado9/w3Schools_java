public class MethodThatReturns {
    static int myMethod(int x, int y) {
        return x + y;
    }

    public static void main(String[] args) {
        int z = myMethod(3, 5);
        System.out.println(z);
    }
}
