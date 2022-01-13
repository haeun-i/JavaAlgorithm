package 배열;

import java.util.ArrayList;
import java.util.Scanner;

public class I7 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = in.nextInt();
        }

        int answer = 0, cnt = 0;
        for(int i=0; i<n; i++){
            if(arr[i] == 1){
                cnt++;
                answer += cnt;
            }
            else cnt = 0;
        }
        System.out.println(answer);
    }
}