import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Map<Integer, String> myMap = new HashMap();
        myMap.put(2, "Vadim");
        myMap.put(4, "Vania");
        myMap.put(-1, "Oleg");
        myMap.put(3, "Denis");
        myMap.put(23, "Andrey");
        myMap.put(0, "Andrey");
        printSortedMap(myMap);
    }

    public static void printSortedMap(Map<Integer, String> map) {
        TreeSet<Integer> sortedKeys = new TreeSet(map.keySet());
        for (Integer key : sortedKeys) {
            System.out.println(key + "=" + map.get(key));
        }
    }
}