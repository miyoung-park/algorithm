package 백준_10000_20000.백준_10995;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for( int i = 0; i < N; i++ ){
           for( int j = 0; j < N * 2; j++ ){
               // 짝수일 경우 - 홀수가 공백
               if( i % 2 == 0 ){
                   if (j % 2 == 0) {
                       System.out.print("*");
                   } else {
                       System.out.print(" ");
                   }
               // 홀수일 경우 - 짝수가 공백
               } else {
                   if( j % 2 == 0 ){
                       System.out.print(" ");
                   } else {
                       System.out.print("*");
                   }
               }
           }
            System.out.println();
        }
    }

}
