package GetandSetMethod;

public class Second {
    //we use the getName() and setName() methods to access and update the variable
    public static void main(String[] args) {
        Main myObj = new Main();
        myObj.setName("John"); //set the value of the name variable to john
        System.out.println(myObj.getName());
    }
}
