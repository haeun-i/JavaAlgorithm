package 문자열;

import java.util.Scanner;

public class Q1316 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int answer = 0;
        for(int q=0; q<t; q++){
            int[] check = new int[26];
            String str = in.next();
            for(int i=0; i<str.length(); i++){
                if(check[str.charAt(i)-'a'] == 0) {
                    check[str.charAt(i)-'a']++; // 겹치는 수가 없을때
                }
                else{ // 겹치는 수가 있을 때
                    if(str.charAt(i-1) != str.charAt(i)) {
                        answer++;
                        break;
                    }
                }
            }
        }
        System.out.println(t - answer);
    }
}
