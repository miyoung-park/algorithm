package 백준_1000_10000.백준_2720;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        for( int i=0; i<c; i++ ){
            int n = sc.nextInt();
            int q = n / 25;
            int d = ( n % 25 ) / 10;
            int k = ( ( n % 25 ) % 10 ) / 5;
            int p = ( ( n % 25 ) % 10 ) % 5;

            System.out.println( q + " " + d + " " + k + " " + p);
        }
    }
}
