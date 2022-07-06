package 백준_1000_10000.백준_3059;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cycle = Integer.parseInt(br.readLine());
        for( int c = 0; c < cycle; c ++ ){
            String str = br.readLine();
            boolean[] asciiCheck = new boolean[26]; //default false;
            int result = 0;
            for( int i = 0; i < str.length(); i++ ){
                asciiCheck[ str.charAt(i) - 65 ] = true;
            }
            for( int i = 0; i < asciiCheck.length; i++ ){
                if( !asciiCheck[i] ){
                    result += i + 65;
                }
            }
            System.out.println(result);
        }
    }
}