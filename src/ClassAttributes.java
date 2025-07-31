import org.w3c.dom.ls.LSOutput;

public class ClassAttributes {
    String fname = "Isaac";
    String lname = "Doe";
    int age = 24;
    int x = 5;
    //declare the attribute as final if you dont want to modify it
    final int y = 3;
    //assessing attributes
    //create object of the class and use the dot syntax
    public static void main(String[] args) {
        ClassAttributes myObj = new ClassAttributes();
        //modify or overide attribute
        myObj.x = 40;
        System.out.println(myObj.x);
        //another object
        ClassAttributes myObj2 = new ClassAttributes();
        System.out.println(myObj2.x);
        System.out.println("Name: " + myObj2.fname + " " + myObj2.lname);
    }
}
