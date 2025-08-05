class Box<T> {
    T value; //T is a placeholder for any data type

    void set(T value) {
        this.value = value;
    }

    T get() {
        return value;
    }
}
public class JavaGenerics {
    //You can create a class that works with different data types using generics
    public static void main(String[] args) {
        //create a Box to hold the string
        Box<String> stringBox = new Box<>();
        stringBox.set("Hello");
        System.out.println("Value: " + stringBox.get());

        //create a Box to hold an Integer
        Box<Integer> intBox = new Box<>();
        intBox.set(50);
        System.out.println("Value: " + intBox.get());
    }
    //T is a generic type parameter. It's like a placeholder for a data type.
    //When you create a Box<String>, T becomes String.
    //When you create a Box<Integer>, T becomes Integer.

}
