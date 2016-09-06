import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Created by Jakob on 03-09-2016.
 */
public class subMap {

    public static void main(String[] args) {


        Map<String, String> map1 = new HashMap<>();

        map1.put("Marty", "206-9024");
        map1.put("Hawking", "123-4567");
        map1.put("Smith", "949-0504");
        map1.put("Newton", "123-4567");

        Map<String, String> map2 = new HashMap<>();

        map2.put("Marty", "206-9024");
        map2.put("Hawking", "555-4567");
        map2.put("Smith", "949-0504");
        map2.put("Newton", "123-4567");

        System.out.println(subMaps(map1, map2));
    }

    public static boolean subMaps(Map<String, String> map1, Map<String, String> map2) {
        Set<String> uniqueValues = new HashSet<String>();

        if (map1.isEmpty()) {
            return true;
        }

        int count = 0;

        for (String name : map1.keySet()) {

            String value1 = map1.get(name);
            String value2 = map2.get(name);
            if (value1 == value2) {
                count++;
            }
        }
if(count == map1.size() ){
    return true;
}
else {
    return false;
}
    }
}