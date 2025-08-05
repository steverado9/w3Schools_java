package JavaPackages;

import java.util.Scanner;

class ImportAClass {
//In the example above, java.util is a package
// while Scanner is a class of the java.util package.
// To use the Scanner class
// create an object of the class and use any of the available methods found in the Scanner class documentation
// Using the Scanner class to get user input:
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter username");

        int userName = Integer.parseInt(myObj.nextLine());
        System.out.println(userName * 2);
    }
}
