package 문자열;

import java.util.Scanner;

public class I10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        char c = in.next().charAt(0); // char 하나만 입력받을 때

        int[] answer = new int[s.length()];
        int p = 1000;
        for(int i=0; i<s.length(); i++){ // 왼쪽으로부터 멀어진 거리
            if(s.charAt(i) == c){
                p = 0;
                answer[i] = p;
            }
            else {
                p++;
                answer[i] = p;
            }
        }

        p=1000;
        for(int i=s.length()-1; i>=0; i--){ // 오른쪽으로부터 멀어진 거리
            if(s.charAt(i) == c) p = 0;
            else{
                p++;
                answer[i] = Math.min(answer[i], p); // 기존값보다 작은 것으로 대체
            }
        }

        for(int x : answer){
            System.out.print(x + " ");
        }
    }
}
