package 백준_1000_10000.백준_2857;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        StringBuffer sb = new StringBuffer();
        for( int i=1; i<=5; i++ ){
            String str = sc.nextLine().toUpperCase();
            if( str.contains("FBI") ) sb.append(i +" ");
        }
        System.out.println(sb.length() > 0 ? sb : "HE GOT AWAY!");
    }
}
