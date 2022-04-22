package 백준_1546;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // N개의 점수
        int N = Integer.parseInt( br.readLine() );
        // 점수 배열
        String[] scoreArr = new String[N];
        scoreArr = br.readLine().split(" ");
        double max = Double.parseDouble( scoreArr[0] );
        double sum = 0;

        // 최댓값 구하기
        for( int i=0; i < scoreArr.length; i++ ){
            if( max < Integer.parseInt(scoreArr[i]) ){
                max = Integer.parseInt(scoreArr[i]);
            }
            sum += Double.parseDouble( scoreArr[i] );
        }
        System.out.println( sum / max * 100 / N);
    }
}
