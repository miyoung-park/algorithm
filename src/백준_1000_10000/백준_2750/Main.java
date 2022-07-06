package 백준_1000_10000.백준_2750;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        int temp = 0;

        for( int i = 0; i < N; i++ ){
            list.add( sc.nextInt() );
        }

        list.sort(null);

        for( int num : list ){
            System.out.println(num);
        }
    }
}
