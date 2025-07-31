//created a class of classname CreateClass
public class CreateClass {
    int x = 5;
    //create an object and print the value of x
    //multiple objects
    public static void main(String[] args) {
        CreateClass myObj1 = new CreateClass();
        CreateClass myObj2 = new CreateClass();
        System.out.println(myObj1.x);
        System.out.println(myObj2.x);
    }

}
