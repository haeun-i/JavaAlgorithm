package 입출력;

import java.util.Scanner;

public class Q2742 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        for(int i=a; i>=1; i--){
            System.out.println(i);
        }
        in.close();
    }
}