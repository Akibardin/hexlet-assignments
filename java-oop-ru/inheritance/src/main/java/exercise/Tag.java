package exercise;

import java.util.HashMap;
import java.util.Map;

// BEGIN
public abstract class Tag {
    protected String tagName;
    protected Map<String, String> attributes;

    public Tag(String tagName, Map<String, String> attributes) {
        this.tagName = tagName;
        this.attributes = new HashMap<>(attributes);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder(" ");
        if (!this.attributes.isEmpty()) {
            this.attributes.forEach((key, value) -> stringBuilder.append(String.format("%s=\"%s\" ", key, value)));
            return String.format("<%s %s>", this.tagName, stringBuilder.toString().trim());
        }
        return String.format("<%s>", this.tagName);
    }
}
// END
