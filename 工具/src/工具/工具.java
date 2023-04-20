/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package 工具;

/**
 *
 * @author user
 */
import java.util.Scanner;

public class 工具 {

    private static Scanner sc = new Scanner(System.in);
    public static int x;
    public static int 猜答案() {
        
        System.out.println("請輸入答案: ");
        int x;
        x = sc.nextInt();
        return x;
    }

    /**
     * @param args the command line arguments
     */
    public static int 加總(int x, int y) {
        int z;
        z = x + y;
        return z ;
        // TODO code application logic here
    }

}
