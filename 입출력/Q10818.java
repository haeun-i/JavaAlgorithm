package 입출력;

import java.util.Arrays;
import java.util.Scanner;

public class Q10818 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int[] arr = new int[t];
        for(int i=0; i<t; i++){
            arr[i] = in.nextInt();
        }
        Arrays.sort(arr);
        System.out.print(arr[0] + " " + arr[t-1]);
    }
}
