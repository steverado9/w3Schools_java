import java.util.HashMap;
public class HashMapInteger {
    public static void main(String[] args) {

        //create a Hashmap object called people
        HashMap<String, Integer> people = new HashMap<String, Integer>();

        //Add keys and values (Name, Age)
        people.put("John", 32);
        people.put("steve", 30);
        people.put("Angie", 33);

        for (String i : people.keySet()) {
            System.out.println("Key: " + i + " value: " + people.get(i));
        }
    }
}
