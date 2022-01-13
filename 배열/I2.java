package 배열;

import java.util.ArrayList;
import java.util.Scanner;

public class I2 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = in.nextInt();
        }

        int answer=1, max=arr[0];
        for(int i=1; i<n; i++){
            if(arr[i]>max){
                max=arr[i];
                answer++;
            }
        }

        System.out.println(answer);
    }
}