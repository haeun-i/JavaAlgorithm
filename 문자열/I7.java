package 문자열;

import java.util.Scanner;

public class I7 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String str = in.next();
        str = str.toUpperCase();
        boolean check = true;

        // len/2 까지만 비교하면 된다. 홀수의 경우에도 stuts면 2까지 비교하면 됨.
//        int len = str.length();
//        for(int i=0; i<len/2; i++){
//            if(str.charAt(i) != str.charAt(len-i-1)){
//                check = false;
//            }
//        }
//        if(check) System.out.println("YES");
//        else System.out.println("NO");

        String tmp = new StringBuffer(str).reverse().toString();
        if(tmp.equalsIgnoreCase(str)) System.out.println("YES");
        else System.out.println("NO");

    }
}
