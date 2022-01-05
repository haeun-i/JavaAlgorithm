package 문자열;

import java.util.Scanner;

public class I4 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        String[] s = new String[t];
        for(int i=0; i<t; i++){
            s[i] = in.next();
        }

        for(String x : s) {
            // String tmp = new StringBuilder(x).reverse().toString(); reverse를 이용한 편리한 교환
            char[] c = x.toCharArray();
            int lt = 0, rt = x.length()-1;
            while(lt<rt){
                char tmp = c[lt];
                c[lt] = c[rt];
                c[rt] = tmp;
                lt++;
                rt--;
            }
            String tmp = String.valueOf(c); // 배열을 String화 시켜준다.
            System.out.println(tmp);
        }
    }
}
