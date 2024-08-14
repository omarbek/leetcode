package companies.yandex3;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] parts = reader.readLine().split(" ");
        int len = 3;
        int[] nums = new int[len];
        for (int i = 0; i < len; i++) {
            nums[i] = Integer.parseInt(parts[i]);
        }
        for (int i = 0; i < len; i++) {
            writer.write(""+nums[i]);
            writer.newLine();
        }
        // for(int i=0;i<len;i++){
        //     for(int j=1;j<len-i;j++){
        //         if(nums[j-1]>nums[j]){
        //             int temp=nums[j-1];
        //             nums[j-1]=nums[j];
        //             nums[j]=temp;
        //         }
        //     }
        // }

        reader.close();
        writer.close();
    }
}
