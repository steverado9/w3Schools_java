import java.util.LinkedHashMap;

public class LinkedHashMapClass {
    public static void main(String[] args) {
        LinkedHashMap<String, String> capitalCities = new LinkedHashMap<>();

        //Add Items
        capitalCities.put("England", "London");
        capitalCities.put("India", "New Dehli");
        capitalCities.put("Austria", "Wien");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("Norway", "Oslo"); //Duplicate
        capitalCities.put("USA", "Washington DC");

        //Access an Item
        System.out.println(capitalCities.get("England"));

        //Remove an Item
        capitalCities.remove("England");

        //Use clear() to remove all items:
        //capitalCities.clear();

        //LinkedHashMap Size
        //Use size() to check how many key/value pairs are in the map
        System.out.println(capitalCities.size());

        // loop through a LinkedHashMap using a for-each loop.
        //Print keys
        for (String key : capitalCities.keySet()) {
            System.out.println(key);
        }

        //print values
        for (String value : capitalCities.values()) {
            System.out.println(value);
        }

        //print key and values
        for (String key : capitalCities.keySet()) {
            System.out.println("Key: " + key + " value: " + capitalCities.get(key) );
        }

        System.out.println(capitalCities);
    }
}
