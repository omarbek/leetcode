package companies.yandex2;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Request {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("input.txt"));
        int userLimit = sc.nextInt();
        int serviceLimit = sc.nextInt();
        int duration = sc.nextInt();
        int[][] input = new int[50000][2];
        int count = 0;
        int num = 0;
        while (true) {
            int nextInt = sc.nextInt();
            if (nextInt == -1) {
                input = Arrays.copyOf(input, count);
                break;
            }
            input[count][num] = nextInt;
            if (num == 0) {
                num = 1;
            } else {
                num = 0;
                count++;
            }
        }
        PrintWriter pw = new PrintWriter("output.txt");
        printRes(input, userLimit, serviceLimit, duration, pw);
        pw.close();
    }

    private static void printRes(int[][] input, int userLimit, int serviceLimit, int duration, PrintWriter pw) {
        for (int i = 0; i < input.length; i++) {
            int time = input[i][0];
            int userId = input[i][1];
            if (getLimitsByUser(userId, duration, time) > userLimit) {
                pw.println(429);
                continue;
            }
            if (getLimitsByService(duration, time) > serviceLimit) {
                pw.println(503);
                continue;
            }

            if (countsMap.get(userId) == 1) {
                firstCallMap.put(userId, time);
            }
            pw.println(200);
        }
    }

    private static int getLimitsByService(int duration, int time) {
        int i = (time / duration);
        if (!serviceMap.containsKey(i)) {
            serviceMap.put(i, 1);
            return 1;
        } else {
            int count = serviceMap.get(i) + 1;
            serviceMap.put(i, count);
            return count;
        }
    }

    private static int getLimitsByUser(int userId, int duration, int time) {
        if (!countsMap.containsKey(userId)) {
            countsMap.put(userId, 1);
            return 1;
        } else {
            if(!firstCallMap.containsKey(userId)){
                return 1;
            }
            if ((time - firstCallMap.get(userId)) > duration) {
                countsMap.put(userId, 1);
                return 1;
            }
            int count = countsMap.get(userId) + 1;
            countsMap.put(userId, count);
            return count;
        }
    }

    static Map<Integer, Integer> countsMap = new HashMap<>();
    static Map<Integer, Integer> firstCallMap = new HashMap<>();
    static Map<Integer, Integer> serviceMap = new HashMap<>();

}
