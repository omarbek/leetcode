package problems;

import java.util.ArrayList;
import java.util.List;

public class SubsetXORSum {
    public static void main(String[] args) {
        System.out.println(new SubsetXORSum().subsetXORSum(new int[]{5, 1, 6}));
    }

    public int subsetXORSum(int[] nums) {
        int sum=0;
        List<List<Integer>> powerset = new ArrayList<>();
        List<Integer> set = new ArrayList<>();
        for (int i : nums) {
            set.add(i);
        }
        genPowerset(set, powerset, new ArrayList<>(), 0);
        for(List<Integer> list:powerset){
            int xor=0;
            for(Integer i:list){
                xor=xor^i;
            }
            sum+=xor;
        }
        return sum;
    }

    private void genPowerset(List<Integer> set, List<List<Integer>> powerset, List<Integer> accumulator, int index) {
        if (index == set.size()) {
            powerset.add(new ArrayList<>(accumulator));
        } else {
            accumulator.add(set.get(index));
            genPowerset(set, powerset, accumulator, index + 1);
            accumulator.remove(accumulator.size() - 1);
            genPowerset(set, powerset, accumulator, index + 1);
        }
    }
}
