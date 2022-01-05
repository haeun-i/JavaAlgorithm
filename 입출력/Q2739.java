package 입출력;

import java.util.Scanner;

public class Q2739 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        for(int i=1; i<=9; i++){
            System.out.print(Integer.toString(a) + " * " + Integer.toString(i) + " = ");
            System.out.println(a*i);
        }
        in.close();
    }
}
