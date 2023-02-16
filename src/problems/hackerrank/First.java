package problems.hackerrank;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;


class Result {

    /*
     * Complete the 'count_invalid_boxes' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_STRING_ARRAY box_template_list as parameter.
     */

    public static int count_invalid_boxes(List<List<String>> box_template_list) {
        int count = 0;
        for (List<String> list : box_template_list) {
            String first = list.get(0);
            char[] firstChars = first.toCharArray();
            Arrays.sort(firstChars);
            String left = Arrays.toString(firstChars);

            String second = list.get(1);
            char[] secondChars = second.toCharArray();
            Arrays.sort(secondChars);
            String right = Arrays.toString(secondChars);

            if (!left.equals(right)) {
                count++;
            }
        }
        return count;
    }

}

public class First {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int box_template_listRows = Integer.parseInt(bufferedReader.readLine().trim());
        int box_template_listColumns = Integer.parseInt(bufferedReader.readLine().trim());

        List<List<String>> box_template_list = new ArrayList<>();

        IntStream.range(0, box_template_listRows).forEach(i -> {
            try {
                box_template_list.add(
                        Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                                .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        int result = Result.count_invalid_boxes(box_template_list);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
