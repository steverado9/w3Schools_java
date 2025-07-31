public class JavaSuper {
    //Accessing parent Attributes
    String type = "Animal";
    //Access Parent Methods
    public void animalSound() {
        System.out.println("The animal makes a sound");
    }

    JavaSuper() {
        System.out.println("Animal is created");
    }

    public static void main(String[] args) {
        Lion myLion = new Lion();
        myLion.animalSound();
        myLion.printType();
    }
}

class Lion extends JavaSuper {
    Lion() {
        super();
    }
    String type = "Dog";

    public void animalSound() {
        super.animalSound(); //call the parent method
        System.out.println("The lion says: i will bite you");
    }

    public void printType() {
        System.out.println(super.type); //Access parent attribute
    }
}


