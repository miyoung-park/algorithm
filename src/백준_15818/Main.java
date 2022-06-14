package 백준_15818;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int cycle = sc.nextInt();
        int M = sc.nextInt();
        long result = 1;
        for( int i=0; i<cycle; i++ ){
            int num = sc.nextInt();
            result *= num % M;
        }
        System.out.println( result % M );
    }
}
