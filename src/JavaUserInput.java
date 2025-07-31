import java.util.Scanner;

class JavaUserInput {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in); //Create a Scanner object
        System.out.println("Enter username");

        String userName = myObj.nextLine(); //Read user input
        System.out.println("Username is: " + userName); //Output user input

        String name = myObj.nextLine(); //string input

        int age = myObj.nextInt(); //Numerical input
        double salary = myObj.nextDouble();// numeriacal output

        //Output input by user
        System.out.println("Name: " + name);
        System.out.println("Age " + age);
        System.out.println("Salary: " + salary);


    }
}
