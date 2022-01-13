package 배열;

import java.util.ArrayList;
import java.util.Scanner;

public class I1 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = in.nextInt();
        }

        System.out.print(arr[0] + " ");
        for(int i=1; i<n; i++){
            if(arr[i]>arr[i-1]) System.out.print(arr[i]+" ");
        }

    }
}
