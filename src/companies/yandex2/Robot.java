package companies.yandex2;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Robot {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("input.txt"));
        int num = sc.nextInt();
        PrintWriter pw = new PrintWriter(new File("output.txt"));
        pw.print(getResult(num));
        pw.close();
    }

    private static int[] getResult(int num) {
        if (num == 0) {
            return new int[]{0, 0};
        }
        if (num == 1) {
            return new int[]{-1, 0};
        }

        int[] arr = new int[2];
        return arr;
    }
}
