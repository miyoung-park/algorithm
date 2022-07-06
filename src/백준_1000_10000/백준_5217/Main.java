package 백준_1000_10000.백준_5217;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int cycle = sc.nextInt();
        for( int i=0; i<cycle; i++ ){
            int num = sc.nextInt();
            System.out.print("Pairs for " + num + ":");
            for( int j=0; j<num; j++ ){
                if( 0 < j && j != (num-j) && j < (num-j) ){
                    if( j > 1 ){
                        System.out.print(",");
                    }
                    System.out.print(" " + j + " " + (num-j));
                }
            }
            System.out.println();
        }
    }
}
