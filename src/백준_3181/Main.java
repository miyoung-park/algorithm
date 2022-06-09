package 백준_3181;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] validArr = {"i", "pa", "te", "ni", "niti", "a", "ali", "nego", "no", "ili"};
        String[] strArr = br.readLine().split(" ");
        for( int i = 0; i < strArr.length; i++ ){
            boolean check = false;
            for( String valid : validArr ) {
                if( i > 0 && strArr[i].equals( valid ) ){
                    check = i > 0 && strArr[i].equals( valid ) ? true : false;
                }
            }
            if( !check ){
                System.out.print( strArr[i].toUpperCase().charAt(0) );
            }
        }
    }
}
