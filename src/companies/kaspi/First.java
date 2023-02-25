package companies.kaspi;

import java.util.Scanner;

public class First {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        String binary = toBinary(num);
        System.out.println(binary);
        scanner.close();
    }

    public static String toBinary(int num) {
        String temp = "";
        while (num > 0) {
            int i = num % 2;
            temp += i;
            num = num / 2;
        }
        String ret = "";
        for (int i = temp.length() - 1; i >= 0; i--) {
            ret += temp.charAt(i);
        }
        return ret;
    }

//    Integer someValue = null;
//
//    println(someMethod(someValue));
//
//    public int someMethod(int someParam){
//        return someParam++;
//    }
}
