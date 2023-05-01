package guesscode;

import java.util.Scanner;
import java.util.Random;

public class NumberGuess {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        
       
        int answer = random.nextInt(100) + 1; 
        System.out.println("一個1到100之间的数字，你猜猜看是多少？");
        
        int guess; 
        int count = 0; 
        
        do {
            System.out.print("請輸入你猜的數字：");
            guess = input.nextInt(); 
            
            count++; 
            
            if (guess > answer) {
                System.out.println("你猜测的数字太大了，再試一次！");
            } else if (guess < answer) {
                System.out.println("你猜测的数字太小了，再試一次！");
            } else {
                System.out.println("恭喜你，猜對了！");
                System.out.println("你猜了" + count + "次。");
            }
        } while (guess != answer);
        
        input.close();
    }
}
