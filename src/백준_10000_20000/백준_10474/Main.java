package 백준_10000_20000.백준_10474;


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while( true ){
            String[] numbers = br.readLine().split(" ");
            int numerator = Integer.parseInt( numbers[0] );
            int denominator = Integer.parseInt( numbers[1] );
            if( numerator == 0 && denominator == 0 ){
                break;
            }
            int quote = numerator / denominator;
            int remainder = numerator % denominator;
            numerator = remainder;
            System.out.println(quote + " " + numerator + " / " + denominator );
        }
    }
}
