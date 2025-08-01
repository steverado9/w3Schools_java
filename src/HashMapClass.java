import java.util.HashMap;
public class HashMapClass {
    public static void main(String[] args) {
        //create a HasMap object called capitalCities
        HashMap<String, String> capitalCities = new HashMap<String, String>();

        //Add keys and values (Country, city)
        capitalCities.put("England", "London");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("Norway", "Oslo"); //Duplicate
        capitalCities.put("USA", "Washington Dc");

        //To access an Item, use the get() method and refer to its key
        System.out.println(capitalCities.get("England"));

        //To Remove an Item, use the remove() method and refer to the key
        capitalCities.remove("England");

        //To remove all items, use the clear() method
//        capitalCities.clear();

        //HashMap Size
        System.out.println(capitalCities.size());

        //Loop Through a HashMap with a for-each loop
        //Use the keySet() method if you only want the keys
        //use the values() method if you only want the values:
        //Print keys
        for (String key : capitalCities.keySet()) {
            System.out.println(key);
        }

        // Print values
        for (String value : capitalCities.values()) {
            System.out.println(value);
        }

        //Print keys and values
        for (String i: capitalCities.keySet()) {
            System.out.println("Key: " + i + " value: " + capitalCities.get(i));
        }
    }
}
