package 백준_10000_20000.백준_17174;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int count = N;
        while( N >= M ){
            N /= M;
            count += N;
        }
        System.out.println( count);
    }
}
