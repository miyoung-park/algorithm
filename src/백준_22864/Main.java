package 백준_22864;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt(); // 피로도 상승
        int B = sc.nextInt(); // 처리가능
        int C = sc.nextInt(); // 피로도 하락
        int M = sc.nextInt(); // 번아웃 경계
        int MaxA = 0; // 피로도
        int MaxB = 0; // 처리할 수 있는 일

        for( int i=0; i<24; i++ ){
            if( M < (MaxA + A) ) {
                MaxA = MaxA - C;
                MaxA = MaxA < 0 ? 0 : MaxA;
            } else {
                MaxA += A;
                MaxB += B;
            }
        }
        System.out.println(MaxB);
    }
}
