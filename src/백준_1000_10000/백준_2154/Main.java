package 백준_1000_10000.백준_2154;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String N = sc.next();
        StringBuffer sb = new StringBuffer();
        for( int i=1; i<=Integer.parseInt(N); i++ ){
            sb.append(i);
        }
        System.out.println( sb.indexOf(N) + 1 );
    }
}
