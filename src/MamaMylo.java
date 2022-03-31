import java.util.*;

public class MamaMylo {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        Qwe qwe1 = new Qwe("sss", 1);
        Qwe qwe2 = new Qwe("sss", 1);
//        map.put(qwe1, "qwe1");
//        map.put(qwe2, "qwe2");
        map.put("ss", "qwe1");
        map.put(null, "qwe2");
        map.forEach((k, v) -> System.out.println(k.toString() + "" + v));

        Set<Qwe> set = new HashSet<>();
        set.add(qwe1);
        set.add(qwe2);
        set.add(null);
//        set.forEach(System.out::println);


//        System.out.println(new MamaMylo().getArray("mama myla ramu", 10));
//        System.out.println(new MamaMylo().getArray("mama myla ramu", 9));
//        System.out.println(new MamaMylo().getArray("aaa bbb ccc", 4));
    }

    /*Вы11:59
    Input: "mama myla ramu", 4
    Output: "mama", "myla", "ramu"
    Вы12:00
    Input: "mama myla ramu", 10
    Output: "mama myla", "ramu"

    aaa bbb ccc 4
    aaa bbb ccc
    */

    private List<String> getArray(String word, int size) {
        List<String> ret = new ArrayList<>();

        StringTokenizer stringTokenizer = new StringTokenizer(word, " ");
        StringBuilder sb = new StringBuilder();
        while (stringTokenizer.hasMoreElements()) {
            String str = stringTokenizer.nextToken();
            int length = sb.length() + str.length() + 1;//9
            if (length > size) {
                ret.add(sb.toString());
                sb = new StringBuilder(str);
            } else {
                if (sb.length() > 0) {
                    sb.append(" ");
                }
                sb.append(str);
            }
        }
        ret.add(sb.toString());

        return ret;
    }

}