package 백준_10000_20000.백준_11648;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int idx = 0;
        while( true ){
            int temp = 1;
            String[] numArr = String.valueOf(num).split("");
            if( numArr.length == 1 )  break;
            for( String numStr : numArr ){
                temp *= Integer.parseInt(numStr);
            }
            num = temp;
            idx++;
        }
        System.out.println(idx);
    }
}
