package test;

import java.util.ArrayList;
import java.util.List;

public class Main2 {
    public static void main(String[] args) {
        //avg(2) -> 2
        //avg(1) -> 1.5
        //avg(6) -> 3
        //avg(11) - > 6
        Main2 main2 = new Main2();
        System.out.println(main2.avg(2));
        System.out.println(main2.avg(1));
        System.out.println(main2.avg(6));
        System.out.println(main2.avg(11));
    }

    List<Integer> list = new ArrayList<>(3);

    private double avg(int n) {
        list.add(n);
        int count = list.size();
        if(count>3){
            count=3;
        }
        double sum = 0;
        int c=0;
        for (int i = list.size() - 1; i >= 0; i--,c++) {
            if(c<3) {
                sum += list.get(i);
            }
        }
        return sum / count;
    }
}
