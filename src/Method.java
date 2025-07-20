public class Method {
    //created a method
    //passing a parameter inside the method
    static void myMethod(String fname, int age) {
        System.out.println(fname + " is " + age);
    }

//    public static void main(String[] args) {
//        //called the method with arguments
//        myMethod("Liam", 5);
//        myMethod("Jenny", 8);
//        myMethod("Anja", 31);
//    }

    //A Method with If...Else
    // A checkAge method with an integer varaible called age
    static void checkAge(int age) {

        //if age is less than 18, print "access denied"
        if (age < 18) {
            System.out.println("Access denied - You are not old enough!");

            //if age is greater than, or equal to 18, print "access granted"
        } else {
            System.out.println("Access granted - You are old enough!");
        }
    }

    public static void main(String[] args) {
        checkAge(20);
    }
}
