package 백준_1000_10000.백준_2851;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] mushrooms = new int[10];
        int score = 0;
        for( int i=0; i<10; i++ ){
            mushrooms[i] = sc.nextInt();
        }
        for( int i=0; i < mushrooms.length; i++){
            int before = Math.abs(score - 100);
            int after = Math.abs(score + mushrooms[i] - 100);
            if( before < after || before == after){
                score = before == after ? score + mushrooms[i] : score;
                break;
            }
            score += mushrooms[i];
        }
        System.out.println( score );
    }
}
