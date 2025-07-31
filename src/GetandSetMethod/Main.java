package GetandSetMethod;

public class Main {
    private String name; //private = restricted access
    //Getter
    //The get method returns the value of the variable name.
    public String getName() {
        return name;
    }

    //Setter
    //The set method takes a parameter (newName) and assigns it to the name variable
    public void setName(String newName) {
        this.name = newName;
    }
}




