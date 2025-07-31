public class WorkingWithConstructor {
    int x; //Create a class attribute
    int y;

    //Create a class constructor
    public WorkingWithConstructor(int z) {
        x = 5; //set the initial values for the class attribute x
        y = z; //giving int y a parameter of z
    }

    public static void main(String[] args) {
        //created an object of the class workingwithconstructor
        //(This will call the constructor)
//        WorkingWithConstructor myObj = new WorkingWithConstructor();
//        System.out.println(myObj.x); //print the value of x

        WorkingWithConstructor myObj2 = new WorkingWithConstructor(5);
        System.out.println(myObj2.y);
    }
}
