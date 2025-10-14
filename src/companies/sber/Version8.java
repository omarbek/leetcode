package companies.sber;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Version8 {
    public static void main(String[] args) {
        var list = List.of("abc", "bac", "acd", "dfg");
        list.stream()
                .map(String::toString)//string stream
                .collect(Collectors.groupingBy(q -> {
                    if (q == null) {
                        return null;
                    }
                    return q.charAt(0);
                }))
                .forEach((key, value) -> System.out.println(key + " " + value));
    }
}
