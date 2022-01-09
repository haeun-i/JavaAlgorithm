package 문자열;

import java.util.Scanner;

public class Q11365 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        while(!str.equals("END")) {
            String ans = new StringBuilder(str).reverse().toString();
            System.out.println(ans);
            str = in.nextLine();
        }
    }
}
