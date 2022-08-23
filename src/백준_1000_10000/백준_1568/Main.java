package 백준_1000_10000.백준_1568;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int birds = sc.nextInt();
        int time = 0;
        int count = 0;
        while( true ){
            if( birds - time < 0 ) time = 1;
            birds -= time;
            if( birds == 0 ) break;
            count++;
            time++;
        }
        System.out.println(count);
    }
}
