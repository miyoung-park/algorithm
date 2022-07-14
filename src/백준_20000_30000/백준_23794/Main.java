package 백준_20000_30000.백준_23794;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for( int i=0; i<N+2; i++ ){
            if( i == 0 || i > N ){
                for( int j=0; j<N+2; j++ ){
                    System.out.print("@");
                }
            } else {
                for( int k=0; k<N+2; k++ ){
                    if( k == 0 || k > N ){
                        System.out.print("@");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }
}
