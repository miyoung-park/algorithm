package 백준_10000_20000.백준_16504;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int num = Integer.parseInt( sc.nextLine() );
        long result = 0;

        for( int i = 0 ; i < num; i ++ ){
            String[] inputNum = sc.nextLine().split(" ");
            for( int j = 0; j < inputNum.length; j++ ){
                result += Integer.parseInt(inputNum[j]);
            }
        }
        System.out.println(result);
    }
}
