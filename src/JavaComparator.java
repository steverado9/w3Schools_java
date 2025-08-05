import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

//sort car object by year

//Define a Car class
class Card {
    public String brand;
    public String model;
    public int year;

    public Card(String b, String m, int y) {
        brand = b;
        model = m;
        year = y;
    }
}

//Create a comparator
class JavaComparator implements Comparator {
    public int compare(Object obj1, Object obj2) {
        //Make sure that the objects are Card objects
        Card a = (Card) obj1;
        Card b = (Card) obj2;

        //compare the objects
        if (a.year < b.year) return -1; //The first car has a smaller year
        if (a.year > b.year) return 1; //The first car has a larger year
        return 0;// Both cars have the same year

    }
}

class MainCard {
    public static void main(String[] args) {
        //Create a list of cars
        ArrayList<Card> myCards = new ArrayList<Card>();
        myCards.add(new Card("BMW", "X5", 1999));
        myCards.add(new Card("Honda", "Accord", 2006));
        myCards.add(new Card("Ford", "Mustang", 1970));

        //To use the comparator, pass it as an argument into a sorting method
        // Use a comparator to sort the cars
        Comparator myComparator = new JavaComparator();
        Collections.sort(myCards, myComparator);

        //Display the cars
        for (Card c : myCards) {
            System.out.println(c.brand + " " + c.model + " " + c.year);
        }
    }
}
