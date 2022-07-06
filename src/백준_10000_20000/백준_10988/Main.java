package 백준_10000_20000.백준_10988;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        StringBuffer sb = new StringBuffer(str);
        String reversedStr = sb.reverse().toString();
        int result = str.equals(reversedStr) ? 1 : 0;
        System.out.println(result);


    }
}
