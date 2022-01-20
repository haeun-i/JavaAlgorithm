package DP;

import java.util.Arrays;
import java.util.Scanner;

public class I5 {
    public static void main(String[] args){
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();

        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i]=kb.nextInt();
        }

        int m = kb.nextInt();
        int[] dy = new int[m+1];

        Arrays.fill(dy, Integer.MAX_VALUE);
        dy[0]=0;
        for(int i=0; i<n; i++){
            for(int j=arr[i]; j<=m; j++){
                dy[j] = Math.min(dy[j], dy[j-arr[i]]+1);
            }
        }

        System.out.println(dy[m]);
    }
}
