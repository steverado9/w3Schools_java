public class VariableTypes {
    public static void main(String[] args) {
        //storing text in string
        String name = "john";
        System.out.println(name);
        //storing numbers
        int myNum = 15;
        System.out.println(myNum);
        //declearing a variable and assign a value later
        int newNum;
        newNum = 15;
        System.out.println(newNum);
        //if you assign a value to an existing variable, it will overwrite it previous value
        int wholeNumber = 30;
        wholeNumber = 65;
        System.out.println("wholeNumber " + wholeNumber);
        //using the final keyword
        final int num = 78;
        //declearing variables of other types
        float myFloatNum = 5.99f;
        System.out.println(myFloatNum);
        char myLetter = 'D';
        System.out.println(myLetter);
        boolean myBool = true;
        System.out.println(myBool);
        String myText = "Hello";
        System.out.println(myText + " stephen");
        //For numeric values, the + character works as a mathematical operator
        int x = 5;
        int y = 6;
        System.out.println(x + y);
        //To declare more than one variable of the same type,
        int a = 5, b = 4, c = 7;
        System.out.println(a + b + c);

        //You can also assign the same value to multiple variables in one line
        int s, t, u;
        s = t = u = 50;
        System.out.println(s + t + u);

        //using descriptive names
        int minutesPerHour = 60;
        System.out.println("minutesPerHour = " + minutesPerHour);

    }
}
