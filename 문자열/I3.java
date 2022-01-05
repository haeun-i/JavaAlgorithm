package 문자열;

import java.util.Scanner;
public class I3 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        int min = Integer.MIN_VALUE;
        String answer = "";
        /*
        String[] strA = str.split(" ");
        for(String x : strA){
            if(min < x.length()){
                min = x.length();
                answer = x;
            }
        }
        */
        int pos;
        while((pos = str.indexOf(' ')) != -1){
            String tmp = str.substring(0, pos); // substring -> 부분 반환
            int len = tmp.length();
            if(len > min){
                min = len;
                answer = tmp;
            }
            str = str.substring(pos+1); // 그 다음을 탐색하기 위해 잘라낸다.
        }
        if(str.length() > min) answer = str;
        System.out.println(answer);
    }
}
