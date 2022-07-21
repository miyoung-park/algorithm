package 백준_10000_20000.백준_14623;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int b1 = Integer.valueOf( sc.next(), 2 );
        int b2 = Integer.valueOf( sc.next(), 2 );
        System.out.println( Long.toBinaryString((long) b1 * b2));
    }
}