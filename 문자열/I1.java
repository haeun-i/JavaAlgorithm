package 문자열;

import java.util.Locale;
import java.util.Scanner;

public class I1 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String str = in.next();
        char c = in.next().charAt(0);
        int answer = 0;
        str = str.toLowerCase(Locale.ROOT);// str을 전부 소문자화
        c = Character.toLowerCase(c); // c도 소문자화
        for(char x : str.toCharArray()){ // string을 charArray로 변경하여 항상된 for문 사용
            if(x==c) answer++;
        }
        /*
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) == c) answer++;
        }
        */
        System.out.println(answer);
    }
}