package 백준_10000_20000.백준_14563;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int count = 0;
        for( int z=0; z<=N; z++ ){
            for( int i=0; i<60; i++ ){
                for( int j=0; j<60; j++ ){
                    if( z/10 == K || z%10 == K || i/10 == K || i%10 == K || j/10 == K || j%10 == K ){
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }
}
