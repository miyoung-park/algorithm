package 백준_11720;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        String[] numberArr = new String[n];
        numberArr = sc.next().split("");

        for( String number : numberArr ){
            sum += Integer.parseInt(number);
        }
        System.out.println( sum );
    }
}
