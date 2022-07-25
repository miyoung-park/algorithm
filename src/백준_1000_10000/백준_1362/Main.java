package 백준_1000_10000.백준_1362;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int idx = 0;
        while( true ){
            idx++;
            String result = "";
            int o = sc.nextInt();
            int w = sc.nextInt();
            if( w <= 0 ) result = " RIP";
            if( o == 0 && w == 0 ) break;
            while( true ){
               String[] nrr = sc.nextLine().split(" ");
               if( nrr[0].equals("#") ){
                   break;
               }
               if( nrr[0].equals("F") ){
                   w += Integer.parseInt(nrr[1]);
               } else if ( nrr[0].equals("E") ){
                   w -= Integer.parseInt(nrr[1]);
               }
               if( w > o/2 && w < o*o ){
                   result = " :-)";
               } else {
                   if( w <= 0 ){
                       break;
                   }
                   result =  " :-(";
               }
           }
            sb.append( idx + result +"\n" );
        }
        System.out.println(sb);
    }
}
