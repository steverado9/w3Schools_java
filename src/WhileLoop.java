public class WhileLoop {
    public static void main(String[] args) {
//        int i = 0;
//        while (i < 5) {
//            System.out.println(i);
//            i++;
//        }
        int countdown = 3;

        while (countdown > 0) { //true, true, true, false
            System.out.println(countdown); //3, 2, 1
            countdown--; //2, 1, 0
        }
        System.out.println("Happy new year!!"); //print
    }
}
