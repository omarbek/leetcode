package problems.hackerrank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;


class Result2 {

    /*
     * Complete the 'print_classification' function below.
     *
     * The function accepts 2D_INTEGER_ARRAY raw_data as parameter.
     */

    public static void print_classification(List<List<Integer>> raw_data) {
        Map<Integer, Integer> map = new HashMap<>();
        for (List<Integer> list : raw_data) {
            Integer racer = list.get(1);
            Integer position = list.get(2);
            Integer points = getPointsByPosition(position);
            if (map.containsKey(racer)) {
                map.put(racer, map.get(racer) + points);
            } else {
                map.put(racer, points);
            }
        }
        Integer racer = null;
        Integer points = Integer.MIN_VALUE;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > points) {
                points = entry.getValue();
                racer = entry.getKey();
            }
        }
        System.out.print(racer + " " + points);
    }

    private static Integer getPointsByPosition(Integer position) {
        int points;
        switch (position) {
            case 1:
                points = 10;
                break;
            case 2:
                points = 6;
                break;
            case 3:
                points = 4;
                break;
            case 4:
                points = 3;
                break;
            case 5:
                points = 2;
                break;
            case 6:
                points = 1;
                break;
            default:
                points = 0;
                break;
        }
        return points;
    }

}

public class Second {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int raw_dataRows = Integer.parseInt(bufferedReader.readLine().trim());
        int raw_dataColumns = Integer.parseInt(bufferedReader.readLine().trim());

        List<List<Integer>> raw_data = new ArrayList<>();

        IntStream.range(0, raw_dataRows).forEach(i -> {
            try {
                raw_data.add(
                        Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                                .map(Integer::parseInt)
                                .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        Result2.print_classification(raw_data);

        bufferedReader.close();
    }
}
