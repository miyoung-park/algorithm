package 백준_1000_10000.백준_1357;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int rf = rev( sc.nextInt() );
        int rs = rev( sc.nextInt() );
        int result = rev(rf + rs);
        System.out.println(result);
    }

    private static int rev(int x){
        return x % 10 * 100 + x % 100 / 10 * 10 + x % 1000 / 100;
    }
}
