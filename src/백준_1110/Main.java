package 백준_1110;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main( String[] args ){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        while( true ){
            // num 이 10 보다 작을 경우 0을 붙여서 계산하게 되는데 결국엔 *11 한 것과 같아짐
            num = num < 10 ? num * 11 : num;
            String a = String.valueOf(num).split("")[0];
            String b = String.valueOf(num).split("")[1];
        }

    }
}
