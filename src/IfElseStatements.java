public class IfElseStatements {
    public static void main(String[] args) {
        int time = 20;
        //we use if for true statements and else for false statements
        if (time < 18) {
            System.out.println("Good day");
        } else {
            System.out.println("Good evening");
        }
        //using else if if the first condition is false.
        if (time < 10) {
            System.out.println("Good morning");
        } else if (time == 20) {
            System.out.println("Good day");
        } else {
            System.out.println("Good evening");
        }
    }
}
