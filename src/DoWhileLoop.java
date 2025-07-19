public class DoWhileLoop {
    public static void main(String[] args) {
        int i = 0;
        do {
            System.out.println(i); //0, 1, 2, 3, 4
            i++; //1, 2, 3, 4, 5
        }
        while (i < 5); //true, true, true, true, false
    }
}
