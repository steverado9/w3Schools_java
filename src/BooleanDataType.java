public class BooleanDataType {
    public static void main(String[] args) {
        boolean isJavaFun = true;
        boolean isFishTasty = false;
        System.out.println(isJavaFun);
        System.out.println(isFishTasty);
        //boolean expression
        System.out.println(10 > 9);
        int x = 10;
        System.out.println(!(x == 10));
        int myAge = 25;
        int votingAge = 18;
        if (myAge >= votingAge) {
            System.out.println("Old enough to vote");
        } else {
            System.out.println("Not old enough to vote");
        }

    }
}
