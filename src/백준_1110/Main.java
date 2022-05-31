package 백준_1110;

import java.util.Scanner;

public class Main {

    public static void main( String[] args ){
        Scanner sc = new Scanner(System.in);
        int originNum = sc.nextInt();
        int num = originNum;
        int index = 0;


        while( true ){
            int result = (num%10) * 10 + (num/10 + num%10) % 10;
            num = result;
            index++;
            if( originNum == num ){
                break;
            }
        }
        System.out.println(index);
    }
}
