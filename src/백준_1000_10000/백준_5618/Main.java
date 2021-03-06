package 백준_1000_10000.백준_5618;

import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();

        List<Integer> list = new ArrayList<>();
        List<Integer> factors = new ArrayList<>();
        for( int i=0 ; i<c; i++ ){
            list.add( sc.nextInt() );
        }
        int min = Collections.min( list );
        for( int i=1; i<=min; i++ ) {
            if( min % i == 0 ) factors.add(i);
        }
        for( int i=0; i< list.size(); i++ ){
            for( int j=factors.size()-1; j>=0; j-- ){
                if( list.get(i) % factors.get(j) != 0 ){
                    factors.remove(j);
                }
            }
        }
        for( int num : factors ){
            System.out.println( num );
        }
    }
}
