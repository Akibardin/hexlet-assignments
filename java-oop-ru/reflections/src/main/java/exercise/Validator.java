package exercise;

import java.lang.reflect.Field;
import java.util.*;

// BEGIN
public class Validator {
    public static List<String> validate(Object object) {
        List<String> nonValid = new ArrayList<>();
        for (Field field : object.getClass().getDeclaredFields()) {
            try {
                field.setAccessible(true);
                if (field.isAnnotationPresent(NotNull.class) && field.get(object) == null) {
                    nonValid.add(field.getName());
                }
                field.setAccessible(false);
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }
        return nonValid;
    }

    public static Map<String, List<String>> advancedValidate(Object object) {
        Map<String, List<String>> nonValid = new HashMap<>();
        for (String nullStr : validate(object)) {
            nonValid.put(nullStr, new ArrayList<>());
            nonValid.get(nullStr).add("can not be null");
        }

        for (Field field : object.getClass().getDeclaredFields()) {
            try {
                field.setAccessible(true);
                if (field.isAnnotationPresent(MinLength.class)) {
                    if (field.getAnnotation(MinLength.class).minLength() > ((String) field.get(object)).length()) {
                        if (!nonValid.containsKey(field.getName())) {
                            nonValid.put(field.getName(), new ArrayList<>());
                        }
                        nonValid.get(field.getName()).add(String.format("length less than %d",
                                field.getAnnotation(MinLength.class).minLength()));
                    }

                }
                field.setAccessible(false);
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        return nonValid;
    }

}
// END
