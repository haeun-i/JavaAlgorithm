package 입출력;

import java.util.Scanner;

public class Q11720 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int sum = 0;
        String s = in.next();
        for(int i=0; i<t; i++){
            sum += s.charAt(i)-'0';
        }
        System.out.println(sum);
    }
}
