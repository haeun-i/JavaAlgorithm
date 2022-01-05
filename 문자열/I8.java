package 문자열;

import java.util.Scanner;

public class I8 {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        str = str.toUpperCase().replaceAll("[^A-Z]", ""); // 대문자가 아니면 빈 문자로 바꾼다
        String tmp = new StringBuffer(str).reverse().toString();
        if(tmp.equalsIgnoreCase(str)) System.out.println("YES");
        else System.out.println("NO");
    }
}
