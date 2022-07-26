package 백준_10000_20000.백준_11006;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        for( int i=0; i<c; i++ ){
            int legs = sc.nextInt();
            int chicken = sc.nextInt();
            int u = ( 2*chicken ) - legs;
            int t = legs - chicken;
            System.out.println( u + " " + t );
        }
    }
}
