package 백준_1000_10000.백준_1673;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while( true ){
            String in = br.readLine();
            if( in == null ){
                break;
            }
            String[] numbers = in.split(" ");
            int coupon = Integer.parseInt(numbers[0]);
            int stamp = Integer.parseInt(numbers[1]);
            int chicken = 0;
            chicken += coupon;
            while( coupon >= stamp ){
                chicken += coupon / stamp;
                coupon = coupon / stamp + coupon % stamp;
            }
            System.out.println(chicken);
        }
    }
}
