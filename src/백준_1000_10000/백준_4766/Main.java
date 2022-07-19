package 백준_1000_10000.백준_4766;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        double temp = 0;
        while( true ){
            double num = sc.nextDouble();
            System.out.println( "temp : " + temp + " num : " + num);
            temp = num;
        }
    }
}
