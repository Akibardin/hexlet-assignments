package exercise;

import java.util.ArrayList;
import java.util.Map;
import java.util.List;
import java.util.stream.Collectors;

// BEGIN
public class PairedTag extends Tag{
    private String tagBody;
    private ArrayList<Tag> childList;
    public PairedTag(String tagName, Map<String, String> attributes, String tagBody, List<Tag> childList) {
        super(tagName, attributes);
        this.childList = new ArrayList<>(childList);
        this.tagBody = tagBody;
    }

    @Override
    public String toString() {
        String openTag = super.toString();
        return String.format("%s%s%s</%s>",
                openTag,
                tagBody,
                childList.stream()
                .map(Tag::toString)
                .reduce("", (partialString, element) -> partialString + element),
                tagName);
    }
}
// END
