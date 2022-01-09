package 문자열;

import java.util.Scanner;

public class Q9046 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        in.nextLine();
        for(int i=0; i<t; i++){
            int[] charList = new int[26];
            String str = in.nextLine();
            for(int j=0; j<str.length(); j++){
                if(str.charAt(j)!=' ') charList[str.charAt(j)-'a']++;
            }

            int max = 0;
            char answer = 'p';

            for(int j=0; j<26; j++){
                if(charList[j] > max){
                    max = charList[j];
                    answer = (char)(j+(int)'a');
                }
                else if( j != 0 && charList[j] == max) {
                    answer = '?';
                }
            }

            System.out.println(answer);
        }
    }
}
