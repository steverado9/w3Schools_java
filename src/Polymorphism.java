class Polymorphism {
    public void animalSound() {
        System.out.println("The animal makes a sound");
    }
}

class Pig extends Polymorphism {
    public void animalSound() {
        System.out.println("The pig says: wee wee");
    }
}

class Dog extends Polymorphism {
    public void animalSound() {
        System.out.println("The dog says: bow bow");
    }
}
//we use the extends keyword to inherit from a class.
//Now we can create Pig and Dog objects and call the animalSound() method on both of them.

class NewMethod {
    public static void main(String[] args) {
        Polymorphism myAnimal = new Polymorphism(); //create a Polymorphism object
        Polymorphism myPig = new Pig(); //create a pig object
        Polymorphism myDog = new Dog(); //create a Dog object
        myAnimal.animalSound();
        myPig.animalSound();
        myDog.animalSound();
    }
}

