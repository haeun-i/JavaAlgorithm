package 입출력;

import java.util.Scanner;

public class Q10952 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            int a = in.nextInt();
            int b = in.nextInt();

            if(a==0 || b==0) break;
            else System.out.println(a+b);
        }
    }
}