package 입출력;

import java.util.Scanner;

public class Q1924 {

    public static void main(String[] args){
        String[] week = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
        int[] month = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int d = sc.nextInt();
        int res = 0;

        for(int i=0; i<m; i++){
            res += month[i];
        }
        res += d;
        System.out.println(week[res%7]);
    }
}
