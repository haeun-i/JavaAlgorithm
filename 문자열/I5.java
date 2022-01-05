package 문자열;

import java.util.Scanner;

public class I5 {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        String str = in.next();
        String answer;
        char[] s = str.toCharArray();
        int lt = 0, rt = str.length()-1;

        while(lt<rt){
            if(!Character.isAlphabetic(s[lt])) lt++; // 알파벳인지 확인 -> isAlphabetic
            else if(!Character.isAlphabetic(s[rt])) rt--;
            else{
                char tmp = s[lt];
                s[lt] = s[rt];
                s[rt] = tmp;
                lt++;
                rt--;
            }
        }
        answer = String.valueOf(s);
        System.out.println(answer);
    }
}
