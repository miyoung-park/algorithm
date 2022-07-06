package 백준_10000_20000.백준_10951;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while( sc.hasNextInt() ){
            int x = sc.nextInt();
            int y = sc.nextInt();

            System.out.println( x+y );
        }
        sc.close();
    }
}
