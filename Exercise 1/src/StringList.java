import java.util.List;
import java.util.stream.Collectors;

public class StringList {

    public static List<String> filterStrings(List<String> strings) {
        return strings.stream()
                .filter(s -> s.contains("o"))
                .collect(Collectors.toList());
    }
}
