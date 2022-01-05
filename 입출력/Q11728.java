package 입출력;

import java.util.Arrays;
import java.util.Scanner;

public class Q11728 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();

        int[] res = new int[n+m];
        for(int i=0; i<n; i++){
            res[i] = in.nextInt();
        }
        for(int i=0; i<m; i++){
            res[n+i] = in.nextInt();
        }
        Arrays.sort(res);
        for(int i=0; i<n+m; i++){
            System.out.print(res[i] + " ");
        }
    }
}
