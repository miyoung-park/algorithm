package 백준_1000_10000.백준_4892;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int idx = 0;
        while(true){
            int n = sc.nextInt();
            if( n == 0 ) break;
            System.out.println(++idx+". " + (n%2==0?"even ":"odd ") + (n%2==0?(n/2):((n-1)/2)));
        }
    }
}
