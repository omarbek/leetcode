package algo.graphs3;

import java.util.ArrayList;
import java.util.List;

public class CanFinish {
    public static void main(String[] args) {
        int[][] prerequisites = {{1, 0}, {0, 1}};
        System.out.println(new CanFinish().canFinish(2, prerequisites));
    }

    int[] colors;

    public boolean canFinish(int numCourses, int[][] prerequisites) {
        colors = new int[numCourses];
        for(int i=0;i<numCourses;i++){
            colors[i]=0;
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
        for(int i=0;i<numCourses;i++){
            if(dfs(list,i)){
                return false;
            }
        }
        return true;
    }

    private boolean dfs(List<List<Integer>> list, int v) {
        if(colors[v]==2){
            return false;
        }
        if(colors[v]==1){
            return true;
        }
        colors[v]=1;
        List<Integer> integers = list.get(v);
        for(int i=0;i< integers.size();i++){
            if(dfs(list,integers.get(i))){
                return true;
            }
        }
        colors[v]=2;
        return false;
    }
}
