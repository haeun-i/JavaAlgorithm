package 문자열;

import java.util.Scanner;

public class Q10798 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
            char[][] charList= new char[5][15];
            for(int i=0 ; i<5; i++){
                String str = in.nextLine();
                for(int j=0; j<str.length(); j++){
                    charList[i][j] = str.charAt(j);
                }
            }

            for(int i=0 ; i<15; i++){
                for(int j=0; j<5; j++){
                    if(charList[j][i] == ' ' || charList[j][i] == '\0') continue;
                    else System.out.print(charList[j][i]);
                }
            }

    }
}
