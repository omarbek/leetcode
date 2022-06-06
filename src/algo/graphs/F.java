//package algo.graphs;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class F {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int rows = in.nextInt();
        int[][] twoD = new int[rows][rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < rows; j++) {
                twoD[i][j] = in.nextInt();
            }
        }
        List<Integer> istokes=new ArrayList<>();
        boolean foundOne;
        for (int i = 0; i < rows; i++) {
            foundOne=false;
            for (int j = 0; j < rows; j++) {
                if(twoD[j][i]==1){
                    foundOne=true;
                    break;
                }
            }
            if(!foundOne){
                istokes.add(i+1);
            }
        }
        List<Integer> stokes=new ArrayList<>();
        for (int i = 0; i < rows; i++) {
            foundOne=false;
            for (int j = 0; j < rows; j++) {
                if(twoD[i][j]==1){
                    foundOne=true;
                    break;
                }
            }
            if(!foundOne){
                stokes.add(i+1);
            }
        }
        System.out.println(istokes.size());
        istokes.forEach(System.out::println);
        System.out.println(stokes.size());
        stokes.forEach(System.out::println);
    }
}
