package 입출력;

import java.util.Scanner;

public class Q11021 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int i=0; i<t; i++){
            int a = in.nextInt();
            int b = in.nextInt();
            System.out.print("Case #" + Integer.toString(i+1) + ": ");
            System.out.println(a+b);
        }
    }
}
