package 백준_10000_20000.백준_11966;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean check = false;
        while( n != 1 ){
            if( n % 2 > 0 ){
                check = true; break;
            }
            n /= 2;
        }
        System.out.println( check ? 0 : 1 );
    }
}
