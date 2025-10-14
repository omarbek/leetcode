package problems;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ValidatePIN {

    static int validatePIN(String atmpin) {
        if (atmpin.length() != 4 && atmpin.length() != 6) {
            return 2;
        }
        Set<Integer> set = new HashSet<>(4);
        for (int i = 0; i < atmpin.length(); i++) {
            try {
                int num = Integer.parseInt(atmpin.charAt(i) + "");
                if (set.contains(num)) {
                    return 4;
                }
                set.add(num);
            } catch (NumberFormatException e) {
                return 3;
            }
        }
        int temp = -1;
        int diff = 0;
        int count = 0;
        for (int i = 0; i < atmpin.length(); i++) {
            int num = Integer.parseInt(atmpin.charAt(i) + "");
            if (i == 0) {
                temp = num;
                System.out.println("i==0");
            } else {
                if (i == 1) {
                    diff = num - temp;
                    if (diff != 1 && diff != -1) {
                        break;
                    }
                    temp = num;
                    System.out.println("i==1");
                } else {
                    System.out.println("(num-temp)=" + (num - temp));
                    System.out.println("diff=" + diff);
                    if ((num - temp) == diff) {
                        count++;
                        temp = num;
                        continue;
                    } else {
                        break;
                    }
                }
            }
        }
        System.out.println("count=" + count);
        if (atmpin.length() - count == 2) {
            return 5;
        }
        if (atmpin.length() == 6) {
            return 1;
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String atmpin = scanner.nextLine();

        // Call the validation function and display the result as an integer
        int result = validatePIN(atmpin);
        System.out.println(result);
    }
}
