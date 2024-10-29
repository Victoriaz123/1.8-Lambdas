import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
<<<<<<< HEAD

=======
        
>>>>>>> 10da323ecc1e1f873d750165dea14107992df59d
        List<Object> mixedList = Arrays.asList(
                5, 10, "Fruits", "Vegetables", 20, "Berries", 15
        );

        mixedList.sort(Comparator.comparingInt((Object item) ->
                item instanceof String ? ((String) item).length() : -1
        ).reversed());

        mixedList.forEach(System.out::println);

    }
}
