package 백준_1000_10000.백준_1712;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int A = sc.nextInt();
       int B = sc.nextInt();
       int C = sc.nextInt();
       int result = -1;
       if( C > B ){
           result = A/(C-B) + 1;
       }
        System.out.println( result );
    }
}
