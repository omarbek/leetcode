import java.util.Optional;

public class Main {
    private static String myMethod() {
        System.out.println("My Method");
        return "My Method";
    }

    public static void main(String[] args) {
        String str = Optional.of("Test").orElse(myMethod());
        System.out.println(str);
    }
}
