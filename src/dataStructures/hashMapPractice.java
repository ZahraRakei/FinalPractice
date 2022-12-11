package dataStructures;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class hashMapPractice {

    public static void main(String[] args) {
        Map<String, String> myMap = new HashMap();

        myMap.put("a", "Sami");
        myMap.put("b", "Eddy");
        myMap.put("c", "Osman");
        myMap.put("d", "Mary");

        Set<String> mySet = myMap.keySet();

        Set<Map.Entry<String, String>> entrySet = myMap.entrySet();
        for (Map.Entry <String, String> entry: entrySet){
            System.out.println(entry);
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }
    }
}
