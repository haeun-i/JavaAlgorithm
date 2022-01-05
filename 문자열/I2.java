package 문자열;

import java.util.Scanner;

public class I2 {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        String str = in.next();
        String answer = "";
        for(char x : str.toCharArray()){
            // if(Character.isLowerCase(x)) x = Character.toUpperCase(x) -> x가 소문자인지 확인
            if (x < 97) x = Character.toLowerCase(x); // 아스키코드를 활용하여 체크
            else x = Character.toUpperCase(x);
            answer += x;
        }
        System.out.println(answer);
    }
}
