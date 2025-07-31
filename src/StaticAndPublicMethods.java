public class StaticAndPublicMethods {
    static void myStaticMethod() {
        //static method
        System.out.println("Static methods can be called without creating objects");
    }

    public void myPublicMethod() {
        //public method
        System.out.println("Public methods must be called by creating objects");
    }

    //create a fullThrottle() method
    public void fullThrottle() {
        System.out.println("The car is going as fast as it can");
    }

    //create a speed() method and add a parameter
    public void speed(int maxSpeed) {
        System.out.println("Max speed is : " + maxSpeed);
    }

    //Main method
    //Inside main, call the methods on the myCar object
    public static void main(String[] args) {
        myStaticMethod(); //called the static method

        StaticAndPublicMethods myObj = new StaticAndPublicMethods(); //create an object of StaticAndPublicMethods
        myObj.myPublicMethod(); //call the public method on the object

        myObj.fullThrottle(); //call the fullThrottle() method
        myObj.speed(200); //call the speed() method
    }
}
