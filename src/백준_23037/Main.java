package 백준_23037;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] numArr = sc.next().split("");
        int total  = 0;
        for( String num : numArr ){
            int parsedNum = Integer.parseInt(num);
            int squared = 1;
            for( int i = 0; i < 5; i ++ ){
                squared *= parsedNum;
            }
            total += squared;
        }
        System.out.println( total );
    }
}
