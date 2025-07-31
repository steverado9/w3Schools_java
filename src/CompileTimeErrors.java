public class CompileTimeErrors {
    //using try and catch
    public static void main(String[] args) {
        try {
            int[] myNumbers = {1, 2, 3};
            System.out.println(myNumbers[10]);
        } catch (Exception e) {
            System.out.println("Something went wrong");
        } finally {
            System.out.println("The 'try catch' is finished.");
        }

        //Throw an exception if age is below 18 (print "Access denied").
        // If age is 18 or older, print "Access granted":
        checkAge(15); // Set age to 15 (which is below 18...)
    }
    static void checkAge(int age) {
        if (age < 18) {
            throw new ArithmeticException("Access denied - You must be at least 18 years old.");
        } else {
            System.out.println("Access granted - You are old enough!");
        }
    }
}
