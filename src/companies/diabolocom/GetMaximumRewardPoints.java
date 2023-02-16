package companies.diabolocom;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GetMaximumRewardPoints {

    public static void main(String[] args) {
        List<Integer> rew1 = Arrays.asList(5, 4, 3, 2, 1);
        List<Integer> rew2 = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println(getMaximumRewardPoints(3, rew1, rew2));
    }

    public static int getMaximumRewardPoints(int k, List<Integer> reward_1, List<Integer> reward_2) {
        int ret = 0;
        int n = reward_1.size();
        printCombination(reward_1, k, n, reward_2);
        return ret;
    }

    private static void printCombination(List<Integer> reward_1, int k, int n, List<Integer> reward_2) {
        int data[] = new int[k];
        combinationUtil(reward_1, data, 0, n - 1, 0, k, reward_2);
    }

    private static void combinationUtil(List<Integer> reward_1, int[] data, int start, int end, int index, int k,
                                        List<Integer> reward_2) {
        int sum = 0;
        if (index == k) {
            int count = 0;
            List<Integer> temp = new ArrayList<>();
            for(int i=0;i<reward_1.size();i++){
                for(int j=0;j<k;j++){
                    if(data[j]==i){
                        break;
                    }
                }
            }
            System.out.println();
            return;
        }
        for (int i = start; i <= end && end - i + 1 >= k - index; i++) {
            data[index] = i;
            combinationUtil(reward_1, data, i + 1, end, index + 1, k, reward_2);
        }
    }
}
