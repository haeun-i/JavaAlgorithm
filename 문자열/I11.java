package 문자열;

import java.util.Scanner;

public class I11 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String str = in.next();

        str += " "; // 뒤에 빈 문자를 추가함으로써 마지막 문자 비교 시에 bound 에러 안나게 함

        int cnt = 1;
        String answer = "";
        for(int i=0; i< str.length()-1; i++){
            if(str.charAt(i) == str.charAt(i+1)) cnt++;
            else{
                answer += str.charAt(i);
                if(cnt>1) answer += String.valueOf(cnt); // Integer.toString이랑 같음
                cnt = 1;
            }
        }

        System.out.println(answer);
    }
}
