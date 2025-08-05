class AnnotationOverride {
    void makeSound() {
        System.out.println("Animal sound");
    }
}

class Fish extends AnnotationOverride {
    @Override
    void makeSound() {
        System.out.println("Woof!");
    }
}

class Example {
    public static void main(String[] args) {
        AnnotationOverride myFish = new Fish();
        myFish.makeSound();

    }
}

//If you accidentally write the wrong method name (e.g. makesound()),
// the compiler will show an error

