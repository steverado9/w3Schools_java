import java.util.HashMap;
public class HashMapClass {
    public static void main(String[] args) {
        //create a HasMap object called capitalCities
        HashMap<String, String> capitalCities = new HashMap<String, String>();

        //Add keys and values (Country, city)
        capitalCities.put("England", "London");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("USA", "Washington Dc");
        System.out.println(capitalCities);
    }
}
