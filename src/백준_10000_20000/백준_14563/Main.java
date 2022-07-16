package 백준_10000_20000.백준_14563;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        for( int k=0; k<c; k++ ){
            int n = sc.nextInt();
            int sum = 0;
            String p = "";
            for( int i=1; i<n; i++ ){
                if( n%i == 0 ){
                    sum += i;
                }
            }
            if( sum == n ){
                p = "Perfect";
            } else if( sum < n ){
                p = "Deficient";
            } else {
                p = "Abundant";
            }
            System.out.println(p);
        }
    }
}
