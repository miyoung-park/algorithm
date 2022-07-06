package 백준_1000_10000.백준_3076;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int R = sc.nextInt();
        int C = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();
        String X = "";
        String D = "";

        for( int i = 0; i < B; i ++){
            X += "X";
            D += ".";
        }

        for( int k = 0; k < R; k++ ){
            String resultOne = X;
            String resultTwo = D;
            if( k % 2 > 0 ){
                resultOne = D;
                resultTwo = X;
            }
            for( int i = 0; i < A; i ++ ){
                for( int j = 0; j < C; j++ ){
                    if( j % 2 == 0 ){
                        System.out.print(resultOne);
                    } else {
                        System.out.print(resultTwo);
                    }
                }
                System.out.println();
            }
        }
    }
}
