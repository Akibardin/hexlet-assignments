package exercise;

import java.util.Map;
import java.util.HashMap;

// BEGIN
public class InMemoryKV implements KeyValueStorage {

    private Map<String, String> db;

    public InMemoryKV(Map<String, String> anotherDB) {
        this.db = new HashMap<>();
        this.db.putAll(anotherDB);
    }

    @Override
    public void set(String key, String value) {
        db.put(key, value);
    }

    @Override
    public void unset(String key) {
        db.remove(key);
    }

    @Override
    public String get(String key, String defaultValue) {
        if (db.containsKey(key)) {
            return db.get(key);
        }
        return defaultValue;
    }

    @Override
    public Map<String, String> toMap() {
        return new HashMap<>(db);
    }
}
// END
