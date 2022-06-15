package 백준_15818;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int cycle = sc.nextInt();
        double M = sc.nextInt();
        long result = 1;
        for( int i=0; i<cycle; i++ ){
           double num = sc.nextDouble() / M;
            System.out.println(num);
           result *= num;
           System.out.println( result );
        }
        System.out.println( result );
    }
}
