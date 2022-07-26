package 백준_1000_10000.백준_1871;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        for( int i=0; i<c; i++ ){
            String[] input = sc.next().split("-");
            int result = 0;
            for( int j=0; j<input[0].length(); j++ ){
                int num = (byte)input[0].charAt(j) - 65;
                for( int z=j; z<input[0].length() - 1; z++ ){
                   num *= 26;
                }
                result += num;
            }
            int total = Math.abs(result - Integer.parseInt( input[1] ));
            System.out.println( total <= 100 ? "nice" : "not nice" );
        }
    }
}
