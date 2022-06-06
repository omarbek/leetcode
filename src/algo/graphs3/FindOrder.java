package algo.graphs3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class FindOrder {
    public static void main(String[] args) {
        Arrays.stream(new FindOrder().findOrder(4, new int[][]{{1, 0}, {2, 0}, {3, 1}, {3, 2}})).forEach(System.out::println);
//        Arrays.stream(new FindOrder().findOrder(2, new int[][]{{0, 1}, {1, 0}})).forEach(System.out::println);
    }

    int[] colors;

    public int[] findOrder(int numCourses, int[][] prerequisites) {
        colors = new int[numCourses];
        for (int i = 0; i < numCourses; i++) {
            colors[i] = 0;
        }
        List<List<Integer>> list = new ArrayList<>();
        for (int i = 0; i < numCourses; i++) {
            list.add(new ArrayList<>());
        }
        for (int[] p : prerequisites) {
            int i = p[0];
            int j = p[1];
            list.get(i).add(j);
        }
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < numCourses; i++) {
            if (colors[i] == 0) {
                if (dfs(i, list, stack)) {
                    return new int[]{};
                }
            }
        }
        int[] arr = new int[numCourses];
        int count = numCourses - 1;
        while (!stack.empty()) {
            arr[count--] = stack.pop();
        }
        return arr;
    }

    private boolean dfs(int i, List<List<Integer>> list, Stack stack) {
        if (colors[i] == 2) {
            return false;
        }
        if (colors[i] == 1) {
            return true;
        }
        colors[i] = 1;
        for (Integer edge : list.get(i)) {
            if (dfs(edge, list, stack)) {
                return true;
            }
        }
        stack.push(i);
        colors[i] = 2;
        return false;
    }
}
