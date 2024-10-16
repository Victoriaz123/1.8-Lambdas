import java.util.stream.Stream;
public class Main {
    public static void main(String[] args) {

        ReverseString reverser = input -> Stream.of(input.split(""))
                .reduce((first, second) -> second + first)
                .orElse("");

        String str = "Head First Java";
        String reversed = reverser.reverse(str);
        
        System.out.println("str: " + str);
        System.out.println("Reversed: " + reversed);
    }
}