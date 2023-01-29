package algo.heap;

import java.util.*;

public class FindRelativeRanks {

    public static void main(String[] args) {
//        Arrays.stream(new FindRelativeRanks().findRelativeRanks(new int[]{5,4,3,2,1})).forEach(System.out::println);
        Arrays.stream(new FindRelativeRanks().findRelativeRanks(new int[]{10,3,8,9,4})).forEach(System.out::println);
    }

    public String[] findRelativeRanks(int[] score) {
        Map<Integer,String> map=new HashMap<>();

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Collections.reverseOrder());
        for(int i:score){
            priorityQueue.add(i);
        }

        int i=1;
        while(!priorityQueue.isEmpty()){
            int el= priorityQueue.poll();
            String item;
            if(i==1){
                item="Gold Medal";
            }else if(i==2){
                item="Silver Medal";
            }else if(i==3){
                item="Bronze Medal";
            }else{
                item=i+"";
            }
            map.put(el,item);
            i++;
        }

        i=0;
        String[]ret=new String[score.length];
        for(int j:score){
            ret[i++]=map.get(j);
        }

        return ret;
    }
}
