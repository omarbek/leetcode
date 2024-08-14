package companies.yandex2;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class Stack {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("input.txt"));
        int num = Integer.parseInt(sc.nextLine());
        String[] input = new String[num];
        for (int i = 0; i < input.length; i++) {
            input[i] = sc.nextLine();
        }
        PrintWriter pw = new PrintWriter("output.txt");
        buildStack(input, pw);
        pw.close();
    }

    private static void buildStack(String[] input, PrintWriter pw) {
        int[] stack = new int[0];
        for (String str : input) {
            if (str.contains("push")) {
                int num = Integer.parseInt(str.substring(5));
                stack = addNumToStack(num, stack);
            } else if ("max".equals(str)) {
                getMaxFromArr(stack, pw);
            } else {//pop
                stack = removeLastEl(stack);
            }
        }
    }

    private static int[] removeLastEl(int[] arr) {
        return Arrays.copyOf(arr, arr.length - 1);
    }

    private static void getMaxFromArr(int[] arr, PrintWriter pw) {
        int max = Integer.MIN_VALUE;
        for (int i : arr) {
            if (i > max) {
                max = i;
            }
        }
        pw.println(max);
    }

    private static int[] addNumToStack(int num, int[] arr) {
        int size = arr.length + 1;
        int[] newArr = Arrays.copyOf(arr, size);
        newArr[size - 1] = num;
        return newArr;
    }
}
