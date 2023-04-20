/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package 電影票價;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class 新票價 {

    private static Scanner sc = new Scanner(System.in);
    
    public static int 全票;
    public static int 優票;
    public static int 兒票;
    public static int 早票;
    public static int 愛票;
    public static int 全票總價;
    public static int 優票總價;
    public static int 兒票總價;
    public static int 早票總價;
    public static int 愛票總價;
    public static int 總價;

    public static int 票種() {
        System.out.println("請問你要買甚麼票");
        int x;
        x = sc.nextInt();
        return x;
    }
    public static int 票數(String[] args) {
        System.out.println("請問你要買幾張");
        int y;
        y = sc.nextInt();
        return y;
        
    }
        
    public static void 購票選項(int bbbb) {
        switch (bbbb) {
            case 1:
                System.out.println("您購買的票種是全票");
                
                break;
            case 2:
                System.out.println("您購買的票種是優票");
                break;
            case 3:
                System.out.println("您購買的票種是早票");
                break;
            case 4:
                System.out.println("您購買的票種是愛票");
                break;
            default:
                System.out.println("請重新輸入");
                
    }
        

        }

    }
