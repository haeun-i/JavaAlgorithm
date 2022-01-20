package DP;
import java.util.Scanner;

public class I1 {

    public static void main(String[] args){
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] dy = new int[n+1];

        dy[1] = 1;
        dy[2] = 2;
        for(int i=3; i<=n; i++) dy[i] = dy[i-2] + dy[i-1];

        System.out.println(dy[n]);
    }
}
