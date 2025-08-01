import java.util.TreeMap;

public class TreeMapClass {
    public static void main(String[] args) {
        TreeMap<String, String> capitalCities = new TreeMap<>();
        capitalCities.put("England", "London");
        capitalCities.put("India", "New Dehli");
        capitalCities.put("Austria", "Wien");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("Norway", "Oslo"); //Duplicate
        capitalCities.put("USA", "Washington DC");

        //Use get() with the key to access its value
        System.out.println(capitalCities.get("England"));

        //Remove Items
        capitalCities.remove("England");
        System.out.println(capitalCities);

        //Use clear() to remove all items:

        //Use size() to count the number of key/value pairs
        System.out.println(capitalCities.size());

        //Loop Through a TreeMap with a for-each loop.
        //Print keys
        for (String i : capitalCities.keySet()) {
            System.out.println(i);
        }
        //Print values
        for (String i : capitalCities.values()) {
            System.out.println(i);
        }
        //Print keys and values
        for (String key : capitalCities.keySet()) {
            System.out.println("Key " + key + " values " + capitalCities.get(key));
        }


    }
}
