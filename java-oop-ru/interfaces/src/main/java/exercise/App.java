package exercise;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

// BEGIN
public class App {
    public static List<String> buildAppartmentsList(List<Home> homeList, int n) {
        List<String> result;
        List<Home> sortedList = homeList.subList(0, n);
        sortedList.sort(new Comparator<Home>() {
            @Override
            public int compare(Home home, Home t1) {
                return home.compareTo(t1);
            }
        });
        result = sortedList.stream().map(Object::toString).toList();
        return result;
    }
}
// END
