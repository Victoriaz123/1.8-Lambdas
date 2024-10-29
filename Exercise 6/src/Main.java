import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Object> mixedList = Arrays.asList(
                5, 10, "Fruits", "Vegetables", 20, "Berries", 15
        );

        mixedList.sort(Comparator.comparing(item -> {
            if (item instanceof String) {
                return ((String) item).length();
            }
            return 0;
        })) ;

        mixedList.forEach(System.out::println);
    }
}