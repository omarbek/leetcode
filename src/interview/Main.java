package interview;

import java.util.Random;

public class Main {
    private static String myMethod() {
        System.out.println("My Method");
        return "My Method";
    }

    public static void main(String[] args) {
//        String str = Optional.of("Test").orElse(myMethod());
//        System.out.println(str);
        Random random=new Random();
        random.ints().limit(5).forEach(System.out::println);
    }
}
