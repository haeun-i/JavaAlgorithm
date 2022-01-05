package 문자열;

import java.util.Scanner;

public class I9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        int answer = 0;

        for (char x : str.toCharArray()) {
            // if (x >= 48 && x <= 57) answer = answer * 10 + (x - 48); 아스키코드응용
            if(Character.isDigit(x)) answer = answer * 10 + (x - 48);
        }
        System.out.println(answer);
    }
}

