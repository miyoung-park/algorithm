package 백준_1000_10000.백준_2506;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int c = sc.nextInt();
        int sum = 0;
        int idx = 0;
        for( int i=0; i<c; i++ ){
            int n = sc.nextInt();
            sum += (n==0) ? idx = 0 : n+idx++;
        }
        System.out.println(sum);
    }
}
