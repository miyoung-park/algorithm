package 백준_16503;


import java.util.Scanner;

public class Main {



    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int firstNum =  sc.nextInt();
        String firstCal =  sc.next();
        int secondNum =  sc.nextInt();
        String secondCal =  sc.next();
        int thirdNum =  sc.nextInt();

        int firstResult = calculator( firstNum , firstCal , secondNum );
        firstResult = calculator( firstResult , secondCal, thirdNum );

        int secondResult = calculator( secondNum , secondCal , thirdNum );
        secondResult = calculator( firstNum, firstCal, secondResult  );

        if( firstResult > secondResult ){
            System.out.println( secondResult + "\n" + firstResult );
            return;
        }
        System.out.println( firstResult + "\n" + secondResult );

    }

    static int calculator( int firstNum , String cal ,  int secondNum ){
        int result = 0;

        switch(cal){
            case "+" :  result = firstNum + secondNum; break;
            case "-" :  result = firstNum - secondNum; break;
            case "*" :  result = firstNum * secondNum; break;
            case "/" :  result = firstNum / secondNum; break;
        }
        return result;
    }
}
