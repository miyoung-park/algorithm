package 백준_1000_10000.백준_2903;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        int t = 2;
        for( int i=0; i<c; i++ ){
            int temp = t;
            t = ( temp + (temp - 1));
        }
        System.out.println(t * t);
    }
}
