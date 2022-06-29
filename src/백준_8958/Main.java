package 백준_8958;

import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int c = Integer.parseInt(br.readLine());
        for( int i=0; i<c; i++ ){
            int idx = 0, sum = 0;
            String[] a = br.readLine().split("");
            for( int j=0; j < a.length; j++ ){
                idx = a[j].equals("X") ? 0 : idx + 1;
                sum += idx;
            }
            System.out.println(sum);
        }
    }
}
