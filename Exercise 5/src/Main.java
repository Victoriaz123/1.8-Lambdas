public class Main {
    public static void main(String[] args) {

 FuncionalInterface funcionalInterface = () -> 3.1415;

     double piValue = funcionalInterface.getPiValue();

        System.out.println("The value of Pi is: " + piValue);

    }
}
