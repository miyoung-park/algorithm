package 백준_23802;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int D = 5;
        for( int i=0; i<N*D; i++ ){
            for( int j=0; j<N; j++ ){
                System.out.print("@");
            }
            for( int k=0; k<N; k++ ){
                System.out.println("@");
            }
        }
    }
}
