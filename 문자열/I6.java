package 문자열;

import java.util.Scanner;

public class I6 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String str = in.next();
        String answer = "";

        //indexOf는 i번째 문자의 제일 첫 번째 인덱스를 반환해준다.
        for(int i=0; i<str.length(); i++){
            if(str.indexOf(str.charAt(i)) == i){ // 현재 idx 값이랑 이 문자의 처음 idx값이 같으면 출력
                System.out.print(str.charAt(i));
            }
        }
    }
}
