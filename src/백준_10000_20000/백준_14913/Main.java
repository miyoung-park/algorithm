package 백준_10000_20000.백준_14913;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int d = sc.nextInt();
        int k = sc.nextInt();
        int num = 1;
        String result = "";

        while( true ){

            if(  a + ( ( num - 1 ) * d ) == k ){
                result = String.valueOf(num);

                break;
            }
            if( ( a+( (num-1)*d ) > k && a < k)  || ( a+( (num-1)*d ) < k && a > k )){
                result = "X";
                break;
            }
            num++;
        }
        System.out.println(result);
    }
}