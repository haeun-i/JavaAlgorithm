package DP;

import java.util.Scanner;

public class I3 {
    public static void main(String[] args){
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] arr = new int[n+1];
        int[] dy = new int[arr.length];

        for(int i=0; i<n; i++){
            arr[i] = kb.nextInt();
        }

        int answer = 0;
        dy[0] = 1;

        for(int i=1; i<arr.length; i++){
            int max = 0;
            for(int j=i-1; j>=0; j--){
                if(arr[j] < arr[i] && dy[j] > max) max = dy[j];
            }
            dy[i] = max+1;
            answer = Math.max(answer, dy[i]);
        }

        System.out.print(answer);


    }
}
