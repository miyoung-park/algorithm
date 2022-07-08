package 백준_1000_10000.백준_2526;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(), p = sc.nextInt(), t = N;
        boolean start = true;
        int idx = 0;
        List<Integer> list = new ArrayList<>();
        list.add(N);
        while( start ){
            t = (t*N)%p;
            for( int i=0; i<list.size(); i++ ){
                if( t == list.get(i) ){
                   idx = list.size() - i;
                   start = false;
                }
            }
            list.add(t);
        }
        System.out.println(idx);
    }
}
