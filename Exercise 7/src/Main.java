import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        
        List<Object> mixedList = Arrays.asList(
                5, 10, "Fruits", "Vegetables", 20, "Berries", 15
        );

        List<String> sortedStrings = mixedList.stream()
                .filter(item -> item instanceof String)
                .map(item -> (String) item)
                .sorted(Comparator.comparingInt(String::length).reversed())
                .toList();


        System.out.println("Sorted strings from largest to shortest: " + sortedStrings);
    }
}
