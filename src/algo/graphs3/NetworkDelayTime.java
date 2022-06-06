package algo.graphs3;


import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Set;

public class NetworkDelayTime {
    public static void main(String[] args) {
        System.out.println(new NetworkDelayTime().networkDelayTime(new int[][]{{2, 1, 1}, {2, 3, 1}, {3, 4, 1}}, 4, 2));
    }

    public int networkDelayTime(int[][] times, int n, int K) {
        int[][] graph = new int[n][n];
        for(int i = 0; i < n ; i++) Arrays.fill(graph[i], Integer.MAX_VALUE);
        for( int[] rows : times) graph[rows[0] - 1][rows[1] - 1] =  rows[2];

        int[] distance = new int[n];
        Arrays.fill(distance, Integer.MAX_VALUE);
        distance[K - 1] = 0;

        boolean[] visited = new boolean[n];
        for(int i = 0; i < n ; i++){
            int v = minIndex(distance, visited);
            if(v == -1)continue;
            visited[v] = true;
            for(int j = 0; j < n; j++){
                if(graph[v][j] != Integer.MAX_VALUE){
                    int newDist = graph[v][j] + distance[v];
                    if(newDist < distance[j]) distance[j] = newDist;
                }
            }
        }
        int result = 0;
        for(int dist : distance){
            if(dist == Integer.MAX_VALUE) return -1;
            result = Math.max(result, dist);
        }
        return result;
    }

    private int minIndex(int[] distance, boolean[] visited){
        int min = Integer.MAX_VALUE, minIndex = -1;
        for(int i = 0; i < distance.length; i++){
            if(!visited[i] && distance[i] < min){
                min = distance[i];
                minIndex = i;
            }
        }
        return minIndex;
    }
}
