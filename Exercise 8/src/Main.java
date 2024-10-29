import java.util.stream.Stream;
public class Main {
    public static void main(String[] args) {

        ReverseString reverser = input -> new StringBuilder(input).reverse().toString();

        String str = "Head First Java";
        String reversed = reverser.reverse(str);
        
        System.out.println("str: " + str);
        System.out.println("Reversed: " + reversed);
    }
}