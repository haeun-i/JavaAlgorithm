package 문자열;

import java.util.Scanner;

public class I12 {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int t = in.nextInt();
        String str = in.next();

        String answer = "";
        for(int i=0; i<t; i++){
            String tmp = str.substring(0, 7).replace('#', '1').replace('*', '0');
            int num = Integer.parseInt(tmp, 2); // 2진수를 int로 변환
            System.out.print((char)num);
            str = str.substring(7);
        }
    }
}
