package multipleClasses;

class Second {
    public static void main(String[] args) {
        //create an object of a class Main and access it in another class
        Main myObj = new Main();
        System.out.println(myObj.x);

        myObj.fullThrottle(); //calling the full throttle method from main class
        myObj.speed(200); //calling the speed() method
    }
}
