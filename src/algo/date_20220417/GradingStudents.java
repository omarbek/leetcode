package algo.date_20220417;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GradingStudents {

    public static void main(String[] args) {
        List<Integer> grades = Arrays.asList(73, 67, 38, 33);
        gradingStudents(grades).forEach(System.out::println);
    }

    public static List<Integer> gradingStudents(List<Integer> grades) {
        List<Integer> ret = new ArrayList<>();
        for (Integer grade : grades) {
            ret.add(grade < 38 || grade % 5 < 3 ? grade : grade + 5 - grade % 5);
        }
        return ret;
    }
}
