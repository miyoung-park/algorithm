package 백준_1110;

import java.util.Scanner;

public class Main {

    public static void main( String[] args ){
        Scanner sc = new Scanner(System.in);
        String num = sc.next();
        int index = 0;
        if( num.split("").length == 1 ) {
            num = "0" + num;
        }
        String[] originNum = num.split("");
        String[] numArr = originNum;
        int sum;
        String[] sumArr;
        String stringSum;

        while( true ){
            sum = ( Integer.parseInt(numArr[0]) + Integer.parseInt(numArr[1]) ); //  8
            sumArr = String.valueOf(sum).split(""); //  { 8 }
            stringSum = numArr[numArr.length - 1] + sumArr[sumArr.length - 1];
            numArr = stringSum.split("");
            index ++;

            if( (originNum[0] + originNum[1]).equals( stringSum ) ){
                break;
            }
        }
        System.out.println(index);
    }
}
