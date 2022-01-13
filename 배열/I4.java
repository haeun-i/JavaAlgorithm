package 배열;

import java.util.ArrayList;
import java.util.Scanner;

public class I4 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
// 일반적인 배열 사용방법
//        int[] answer = new int[n];
//        answer[0] = 1;
//        answer[1] = 1;
//        for(int i=2; i<n; i++){
//            answer[i]=answer[i-2]+answer[i-1];
//        }
//        for(int i=0; i<n; i++){
//            System.out.print(answer[i] + " ");
//        }

        int a=1, b=1, c;
        System.out.print(a + " " + b + " ");
        for(int i=2; i<n; i++){
            c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }

    }
}