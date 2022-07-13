package 백준_1000_10000.백준_2490;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for( int i=0; i<3; i++ ){
            String result = "";
            String s = br.readLine().replaceAll("[ ,1]", "");
            switch(s.length()){
                case 1: result = "A"; break;
                case 2: result = "B"; break;
                case 3: result = "C"; break;
                case 4: result = "D"; break;
                case 0: result = "E"; break;
            }
            System.out.println(result);
        }
    }
}
