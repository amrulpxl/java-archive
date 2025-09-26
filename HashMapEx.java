import java.util.HashMap;
import java.util.Map;

public class HashMapEx {
    public static void main(String[] args) {
        HashMap<String, Integer> ages = new HashMap<>();
        
        ages.put("Amrul", 22);
        ages.put("Dimas", 30);
        ages.put("Topan", 35);
        
        System.out.println("age of Amrul: " + ages.get("Amrul"));
        System.out.println("contains Dimas? " + ages.containsKey("Dimas"));
        System.out.println("contains age 40? " + ages.containsValue(40));
        
        ages.remove("Topan");
        ages.replace("Amrul", 26);
        
        System.out.println("\nall entries:");
        for (Map.Entry<String, Integer> entry : ages.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        
        HashMap<String, String> capitals = new HashMap<>();
        capitals.put("Kalimantan Tengah", "Palangka Raya");
        capitals.put("Sumatra", "Medan");
        capitals.put("Kalimantan Tengah", "Sampit");
        
        System.out.println("\ncapital cities:");
        capitals.forEach((province, capital) ->
            System.out.println(province + ": " + capital));
    }
}
