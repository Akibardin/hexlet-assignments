package exercise;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

// BEGIN
public class App {
    public static void swapKeyValue(KeyValueStorage storage) {
        Set<String> stringSet = new HashSet<>(storage.toMap().keySet());
        for(String key: stringSet) {
            String value = storage.get(key, "");
            storage.set(value, key);
            storage.unset(key);
        }
    }
}
// END
