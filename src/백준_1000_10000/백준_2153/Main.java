package 백준_1000_10000.백준_2153;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int num = 0;
        int idx = 0;
        for( int i=0; i< str.length(); i++ ){
            if( (int)str.charAt(i) - 96 < 0 ){
                num += (int)str.charAt(i) - 38;
                continue;
            }
            num += (int)str.charAt(i) - 96;
        }
        for( int i=1; i<num; i++ ){
            if( num % i == 0 ) idx ++;
            if( idx > 1 ) break;
        }
        System.out.print( idx == 1 || num == 1 ? "It is a prime word." : "It is not a prime word.");
    }
}
