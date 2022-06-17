package 백준_23802;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int D = 5;
        for( int i=0; i<N*D; i++ ){
            if( i < N ){
                for( int z=0; z<N; z++){
                    for( int j=0; j<D; j++ ){
                        System.out.print("@");
                    }
                }
                System.out.println();
            }
            if( i >= N ){
                for( int k=0; k<N; k++){
                    System.out.print("@");
                }
                System.out.println();
            }
        }
    }
}
