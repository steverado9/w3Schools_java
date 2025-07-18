public class Casting {
    public static void main(String[] args) {
        //widening casting(automatic)
        int myInt = 9;
        double myDouble = myInt; //atomatic casting: int to double

        System.out.println(myInt);
        System.out.println(myDouble);

        //Narrowing Casting
        //Narrowing casting must be done manually by placing the type in parentheses () in front of the value
        double myNewDouble = 9.78d;
        int myNewInt = (int) myNewDouble;
        System.out.println(myNewDouble);
        System.out.println(myNewInt);

    }
}
