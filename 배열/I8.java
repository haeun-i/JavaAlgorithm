package 배열;

import java.util.ArrayList;
import java.util.Scanner;

public class I8 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = in.nextInt();
        }

        for(int i=0; i<n; i++){
            int cnt = 1;
            for(int j=0; j<arr.length; j++){
                if(arr[j]>arr[i]) cnt++;
            }
            System.out.print(cnt + " ");
        }
    }
}