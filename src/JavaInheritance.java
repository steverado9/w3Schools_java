public class JavaInheritance {
    protected String brand = "Ford"; //vehicle attribute
    public void honk() { //vehicle method
        System.out.println("Tuut, tuut!");
    }
}

class Car extends JavaInheritance {
    private String modelName = "Mustang"; //Car attribute
    public static void main(String[] args) {

        //Create a myCar object
        Car myCar = new Car();

        //Call the honk() method (from the JavaInheritance class) on the myCar object
        myCar.honk();

        //Display the value of the brand attribute (from the JavaInheritance class)
        // and the value of the modelName from the Car class
        System.out.println(myCar.brand + " " + myCar.modelName);
    }
}
