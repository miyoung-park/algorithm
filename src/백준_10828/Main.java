package 백준_10828;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt( br.readLine() );
        ArrayList<Integer> stack = new ArrayList<>();

        for( int i = 0; i < N; i++ ){
            String order = br.readLine();

            if( order.contains("push") ){
                String[] pushArr = order.split(" ");
                stack.add( Integer.parseInt(pushArr[pushArr.length-1]) );
            }

            if( order.contains("pop") ){
                if( stack.size() == 0 ){
                    System.out.println(-1);
                    continue;
                }
                System.out.println( stack.get( stack.size() - 1));
                stack.remove(stack.size() - 1);
            }

            if( order.contains("size") ){
                System.out.println( stack.size() );
            }

            if( order.contains("empty") ){
                int result = stack.size() == 0 ? 1 : 0;
                System.out.println( result );
            }

            if( order.contains("top") ){
                int result = stack.size() == 0 ?  -1 : stack.get( stack.size() - 1);
                System.out.println( result );
            }
        }
    }
}
