package 백준_1000_10000.백준_2145;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        while(true) {
            int num = sc.nextInt();
            if( num == 0 ) break;
            while( true ){
                int temp = 0;
                String[] numArr = String.valueOf(num).split("");
                if( numArr.length == 1 )  break;
                for( String numStr : numArr ){
                    temp += Integer.parseInt(numStr);
                }
                num = temp;
            }
            System.out.println(num);
        }
    }
}
