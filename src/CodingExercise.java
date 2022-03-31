import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @author omarbekdinasil
 * on 16.03.2022
 * @project leetcode
 */
public class CodingExercise {

    public static void main(final String[] args) {
        //Welcome to this interview!
        //Please write program which will give possibility to find number of unique pairs in array of random integers.
        //Unique pair is two opposite numbers, like [-2,2], [-6,6] etc. In other words - two numbers with the same
        //absolute value but different sign.

        //Example input:
        int[] input = new int[]{7, -5, 6, 5, -8, 5, -5, 1, 7, 4, -1, -2, 1}; //We have two unique pairs in this array: [-5,5] and [-1,1]

        PairCounter pairCounter = new UniquePairCounter(input);

        //Expected result:
        //2
        System.out.println(pairCounter.countPairs());
    }

    public static class PairCounter {

        public int countPairs() {
            return 0;
        }
    }

    public static class UniquePairCounter extends PairCounter {

        private int[] input;

        public UniquePairCounter(int[] input) {
            this.input = input;
        }

        public int countPairs() {
            int count = 0;
            Set<Integer> set = new HashSet<>();
            for (int i = 0; i < input.length; i++) {
                int number = input[i];
                set.add(number);
            }
            for (Integer i : set) {
                if (set.contains(-i)){
                    count++;
                }
            }
            return count/2;
        }
    }
}
