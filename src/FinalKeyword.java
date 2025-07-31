public class FinalKeyword {
    final int x = 10;
    final double PI = 3.14;

    public static void main(String[] args) {
        FinalKeyword myObj = new FinalKeyword();
//        myObj.x = 50; cannot assign a value to final variable x
//        myObj.PI = 25; cannot assign a value to final variable x
        System.out.println(myObj.x);
    }
}
