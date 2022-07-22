package 백준_1000_10000.백준_5361;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        for( int i=0; i<c; i++ ){
            double A = sc.nextInt() * 350.34;
            double B = sc.nextInt() * 230.90;
            double C = sc.nextInt() * 190.55;
            double D = sc.nextInt() * 125.30;
            double E = sc.nextInt() * 180.90;
            String str = String.format("%.2f" , A+B+C+D+E);
            System.out.println( "$" + str );
        }
    }
}
