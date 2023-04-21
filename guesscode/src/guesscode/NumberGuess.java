package guesscode;




import java.util.Random;

public class NumberGuess {
    public static void main(String[] args) {
        Random random = new Random();
        
      
        int answer = random.nextInt(100) + 1; 
        System.out.println("1到100，猜猜看是多少？");
        
        int guess; 
        int count = 0; 
        
        do {
            guess = random.nextInt(100) + 1; 
            
            System.out.println("我猜是：" + guess);
            
            count++; 
            
            if (guess > answer) {
                System.out.println("猜的数字太大了！");
            } else if (guess < answer) {
                System.out.println("猜的数字太小了！");
            } else {
                System.out.println("我猜對了！");
                System.out.println("我猜了" + count + "次。");
            }
        } while (guess != answer);
    }
}



