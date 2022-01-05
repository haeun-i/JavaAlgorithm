package 입출력;

import java.util.Scanner;

public class Q10953 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int i=0; i<t; i++){
            String[] s = in.next().split(",");
            Integer.parseInt(s[0]);
            System.out.println(Integer.parseInt(s[0]) + Integer.parseInt(s[1]));
        }
    }
}
