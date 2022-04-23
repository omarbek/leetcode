package interview;

import java.util.HashMap;
import java.util.Map;

/**
 * @author omarbekdinasil
 * on 18.03.2022
 * @project leetcode
 */
public class Intetics {
    /*
You've built an inflight entertainment system with on-demand movie streaming.
Users on longer flights like to start a second movie right when their first one ends,
but they complain that the plane usually lands before they can see the ending.
So you're building a feature for choosing two movies whose total runtimes will equal the exact flight length.
Write a method that takes an integer flightLength (in minutes) and an array of integers movieLengths (in minutes)
and returns a boolean indicating whether there are two numbers in movieLengths whose sum equals flightLength.
When building your method:
- Assume your users will watch exactly two movies
- Don't make your users watch the same movie twice
- Optimize for runtime over memory
*/
    public static boolean canTwoMoviesFillFlight(int[] movieLengths, int flightLength) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < movieLengths.length; i++) {
            map.put(movieLengths[i], i);
        }
        for (int i = 0; i < movieLengths.length; i++) {
            int key = flightLength - movieLengths[i];
            if (map.containsKey(key) && map.get(key) != i) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] movieLengths = {100, 60, 80, 100};
        int flightLength = 200;
        System.out.println(canTwoMoviesFillFlight(movieLengths, flightLength));
    }
}
