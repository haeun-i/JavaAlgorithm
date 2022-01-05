package 입출력;

import java.util.Scanner;

public class Q8393 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int sum = 0;
        for(int i=1; i<=t; i++){
            sum += i;
        }
        System.out.println(sum);
    }
}
