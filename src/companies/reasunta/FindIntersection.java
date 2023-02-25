package companies.reasunta;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class FindIntersection {
    public static void main(String[] args) {
        System.out.println(FindIntersection(new String[]{"1,3,4,7,13", "1,2,4,13,15"}));
    }

    public static String FindIntersection(String[] strArr) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        for (int i = 0; i < strArr.length; i++) {
            String temp = strArr[i].trim();
            StringTokenizer st = new StringTokenizer(temp, ",");
            while (st.hasMoreTokens()) {
                int num = Integer.parseInt(st.nextToken());
                if (i==0) {
                    list1.add(num);
                }else{
                    list2.add(num);
                }
            }
        }
        String temp="";
        for(Integer i:list1){
            for(Integer j:list2){
                if(i.equals(j)){
                    if(temp.isEmpty()){
                        temp+=i;
                    }else{
                        temp=temp+","+i;
                    }
                }
            }
        }
        return temp;
    }
}
