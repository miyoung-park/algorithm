package 백준_10000_20000.백준_10179;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int cycle = sc.nextInt();
        for( int i = 0; i<cycle; i++ ){
            double dollar = sc.nextDouble();
            String result = String.format("%.2f" , dollar * 0.8);
            System.out.println( "$" + result );
        }
    }
}
