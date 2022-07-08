package 백준_1000_10000.백준_5523;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        int aWin = 0;
        int bWin = 0;
        for( int i=0; i<c; i++ ){
            int A = sc.nextInt();
            int B = sc.nextInt();
            aWin += A>B? 1 : 0;
            bWin += A<B? 1 : 0;
        }
        System.out.println(aWin + " " + bWin);
    }
}
