import java.util.LinkedList;
public class LinkedListClass {
    public static void main(String[] args) {
        LinkedList<String> cars = new LinkedList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        //use addFirst() to add the item to the beginning of the list
        cars.addFirst("Mazda");
        //use addLast() to add the item to the end of the list
        cars.addLast("Benz");
        //use removeFirst() remove the first item from the list
        cars.removeFirst();
        //use removeLast() to remove the last item from the list
        cars.removeLast();
        //Use getFirst() to disply the first item in the list
        System.out.println(cars.getFirst());
        System.out.println(cars);
    }
}
