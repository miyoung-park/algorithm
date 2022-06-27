package 백준_2605;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main( String[] args ) {
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        ArrayList<Integer> ls = new ArrayList<>();
        for( int i=0; i<c; i++ ){
            ls.add( i-sc.nextInt() , i+1);
        }
        ls.forEach( n -> System.out.print(n + " ") );
    }
}
