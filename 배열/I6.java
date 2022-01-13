package 배열;

import java.util.ArrayList;
import java.util.Scanner;

public class I6 {
    public static boolean isPrime(int num){
        if(num == 1) return false;
        for(int i=2; i<num; i++){
            if(num%i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = in.nextInt();
        }

        for(int i=0; i<n; i++){
            int tmp = arr[i];
            int res = 0;
            while(tmp>0){
                int t = tmp%10;
                res = res * 10 + t;
                tmp = tmp/10;
            }
            if(isPrime(res)) System.out.print(res + " ");
        }

    }
}
