package 백준_10000_20000.백준_10872;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int result = factorial(N);
        System.out.println(result);
        sc.close();
    }
    public static int factorial(int N){
        if(N <= 1) {
            return  1;
        }
        return N * factorial(N-1);
    }
}
