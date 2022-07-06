package 백준_1000_10000.백준_4470;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int c = Integer.parseInt(br.readLine());
        int idx = 0;
        for( int i=0; i<c; i++ ){
            String s = br.readLine();
            System.out.println(++idx + ". " + s);
        }
    }
}
