public class StaticKeyword {
    //Static method
    static void myStaticMethod() {
        System.out.println("Static methods can be called without creating objects");
    }

    //public method
    public void myPublicMethod() {
        System.out.println("Public methods must be called by creating onjects");
    }

    //Main method
    public static void main(String[] args) {
        myStaticMethod(); //call the static method

        StaticKeyword myObj = new StaticKeyword(); //created an object
        myObj.myPublicMethod(); //called the public method
    }
}
