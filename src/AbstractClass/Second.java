package AbstractClass;

class Second {
    public static void main(String[] args) {
        //create an object of the student class (which inherits attributes and methods from AbstaractKeyword)
        Student myObj = new Student();

        System.out.println("Name: " + myObj.fname);
        System.out.println("Age: " + myObj.age);
        System.out.println("Graduaton Year: " + myObj.graduationYear);
        myObj.study(); //call abstract method
    }
}
