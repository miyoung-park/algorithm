package 백준_1000_10000.백준_7567;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] bowl = sc.next().split("");
        int sum = 10;
        for( int i=1; i< bowl.length; i++ ){
            sum += bowl[i-1].equals( bowl[i] ) ? 5 : 10;
        }
        System.out.println(sum);
        sc.close();
    }
}