package 백준_1000_10000.백준_1264;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] alphabetArr = {"a","e","i","o","u"};
        int cnt = 0;
        while( true ){
            cnt = 0;
            String input = br.readLine().toLowerCase();
            if( input.equals("#") ) break;
            String[] inputArr = input.split("");
            for ( String in : inputArr ) {
                for( String alphabet : alphabetArr ){
                    cnt += in.equals(alphabet) ? 1 : 0;
                }
            }
            System.out.println(cnt);
        }
    }
}
