public class CallingConstructor {
    int modelYear;
    String modelName;

    //constructor with one parameter
    public CallingConstructor(String modelName) {
        //call the two-parameter constructor to resuse code and set a default year
        this(2020, modelName);
    }

    //constructor with two parameters
    public CallingConstructor(int modelYear, String modelName) {
        //use 'this' to assign values to the class variables
        this.modelYear = modelYear;
        this.modelName = modelName;
    }

    //Method to print car information
    public void printInfo() {
        System.out.println(modelYear + " " + modelName);
    }

    public static void main(String[] args) {
        //create a car with only model name (use default year)
        CallingConstructor car1 = new CallingConstructor("Corvette");

        //create a car with both model year and name
        CallingConstructor car2 = new CallingConstructor(1969, "Mustang");

        car1.printInfo();
        car2.printInfo();
    }
}
