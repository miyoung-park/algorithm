package 백준_10000_20000.백준_15917;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cycle = Integer.parseInt(br.readLine());
        for( int i=0; i<cycle; i++ ){
            int num = Integer.parseInt(br.readLine());
            int etc = 0;
            int two = 2;
            while(true){
                System.out.println("b_num :: " + num);
                System.out.println("b_etc :: " + etc);
                num = num / two;
                System.out.println("num :: " + num);
                System.out.println("two :: " + two);
                System.out.println("etc :: " + etc);
                System.out.println("------------");
                if( num == 0 || num == 1){
                    break;
                }
                two *= 2;
                etc = num % two;
            }
        }
    }
}
