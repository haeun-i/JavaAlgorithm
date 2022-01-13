package 배열;

import java.util.ArrayList;
import java.util.Scanner;

public class I5 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int cnt = 0;
        int[] ch = new int[n+1];
        for(int i=2; i<=n; i++){
            if(ch[i] == 0){
                cnt++;
                for(int j=i; j<=n; j=j+i) {
                    ch[j] = 1;
                }
            }
        }
        System.out.println(cnt);
    }
}