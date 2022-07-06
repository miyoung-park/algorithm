package 백준_1000_10000.백준_9550;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        for( int i=0; i<c; i++ ){
            int n = sc.nextInt();
            int k = sc.nextInt();
            int kids = 0;
            for( int j=0; j<n; j++ ){
                int candy = sc.nextInt();
                kids += candy / k;
            }
            System.out.println(kids);
        }
    }
}
