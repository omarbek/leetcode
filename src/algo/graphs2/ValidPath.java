package algo.graphs2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ValidPath {
    public static void main(String[] args) {
        System.out.println(new ValidPath().validPath(6, new int[][]{{0, 1}, {0, 2}, {3, 5}, {5, 4}, {4, 3}}, 0, 5));
//        System.out.println(new ValidPath().validPath(10, new int[][]{{4, 3}, {1, 4}, {4, 8}, {1, 7}, {6, 4}, {4, 2}, {7, 4}, {4, 0}, {0, 9}, {5, 4}}, 5, 9));
    }

    public boolean validPath(int n, int[][] edges, int source, int destination) {
        if (n == 1) {
            return true;
        }
        Map<Integer, List<Integer>> adjacencyMap = new HashMap<>();
        for (int[] edge : edges) {
            int key = edge[0];
            if (adjacencyMap.containsKey(key)) {
                adjacencyMap.get(key).add(edge[1]);
            } else {
                adjacencyMap.put(key, new ArrayList<>());
                adjacencyMap.get(key).add(edge[1]);
            }

            key = edge[1];
            if (adjacencyMap.containsKey(key)) {
                adjacencyMap.get(key).add(edge[0]);
            } else {
                adjacencyMap.put(key, new ArrayList<>());
                adjacencyMap.get(key).add(edge[0]);
            }
        }
        boolean[] visited = new boolean[n];
        return dfs(adjacencyMap, source, destination, visited);
    }

    private boolean dfs(Map<Integer, List<Integer>> adjacencyMap, int source, int destination, boolean[] visited) {
        visited[source] = true;
        if (adjacencyMap.get(source).contains(destination)) {
            return true;
        }
        for (int neighbour : adjacencyMap.get(source)) {
            if (!visited[neighbour]) {
                if (neighbour == destination) {
                    return true;
                }
                if (dfs(adjacencyMap, neighbour, destination, visited)) {
                    return true;
                }
            }
        }
        return false;
    }
}
