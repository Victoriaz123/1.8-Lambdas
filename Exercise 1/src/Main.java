import java.util.Arrays;
import java.util.List;

public class Main {
public static void main(String[] args) {

    List<String> strings = Arrays.asList("one", "two", "three", "four", "five");
    List<String> result = StringList.filterStrings(strings);

    System.out.println("Strings that contain a letter 'o': " + result);

    }
}