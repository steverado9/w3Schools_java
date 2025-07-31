public class ThisKeyword {
    int x; //class variable

    //Constructor with one parameter
    public ThisKeyword(int x) {
        this.x = x; //x in the constructor is assigned to the class variable.
    }

    public static void main(String[] args) {
        //create an object and pass the value 5 to the constructor
        ThisKeyword myObj = new ThisKeyword(5);
        System.out.println("Value of x = " + myObj.x);
    }
}
