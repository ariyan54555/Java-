import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMaptute {
    public static void main(String[] args){

        HashMap<String, Integer> map = new HashMap<>();// key, value pair
        // we add product
        map.put("Tea",10);
        map.put("Coffee", 20);
        map.put("Milk",30);

        System.out.println(map);

        map.put("Coffee", 120);// upadate the value of coffee

        System.out.println(map);

        // It is a unordered collection of key value pairs.

        // Now we search for a key in the map
        //containsKey() method is a boolean method. it returns true or false
        System.out.println(map.containsKey("Water"));// This line returns false
        System.out.println(map.containsKey("Milk"));// This line returns true
        if(map.containsKey("Coffee")){
            System.out.println("Coffee is present in the map");

        }
        else {
            System.out.println("Coffee is not present in the map");
        }

        // find the value of a key using get() method
        System.out.println(map.get("Milk"));
        // If the is not exist in the map it returns null
        System.out.println(map.get("Chocolate"));

        // Iteration in HasMap


        for(Map.Entry<String,Integer> e: map.entrySet()){
            System.out.println(e.getKey()+"="+e.getValue());

        }
        System.out.println("---------------------");

        // print key using set

        Set<String> keys = map.keySet();
        for(String key: keys){
            System.out.println(key+"="+map.get(key));
        }

        //Remove key
        map.remove("Tea");// dele the key Tea from the map
        System.out.println(map);


    }
}
