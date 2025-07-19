public class NextedLoopExample {
    public static void main(String[] args) {
        //a loop inside another loop is called nexted loop
        //outer loop
        for (int i = 1; i <= 2; i++) {
            System.out.println("Outer: " + i); //execute 2 times

            //inner loop
            for (int j = 1; j <= 3; j++) {
                System.out.println("Inner: " + j); //executes 6 times
            }
        }
        //Multiplication table
        for (int i = 1; i <= 3; i++) { //1 true, 2 true, 3 true
            for (int j = 1; j <= 3; j++) { //1 true, 2 true, 3 true, 4 false
                // 1 2 3
                //2 4 6
                System.out.println(i * j + " "); //3 6 9
            }
            System.out.println();
        }
    }
}
