package 백준_10000_20000.백준_11170;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        for( int i=0; i<c; i++ ){
            int N = sc.nextInt();
            int M = sc.nextInt();
            int cnt = 0;
            for( int j=N; j<=M; j++ ){
                if( String.valueOf(j).contains("0") ){
                    String a = String.valueOf(j);
                    String b = String.valueOf(j).replace("0","");
                    cnt += (a.length() - b.length());
                }
            }
            System.out.println(cnt);
        }
    }
}
