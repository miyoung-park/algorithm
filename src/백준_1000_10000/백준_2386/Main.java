package 백준_1000_10000.백준_2386;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        while( true ){
            String chr = sc.next().toLowerCase();
            int count = 0;
            if( chr.equals("#") ) break;
            String[] str = sc.nextLine().toLowerCase().split("");
            for( int i=0; i<str.length; i++ ){
                if( chr.equals(str[i]) ) count++;
            }
            System.out.println( chr + " " + count );
        }
    }
}
