/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package 布林;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class 存提款程式 {

    private static Scanner sc = new Scanner(System.in);
    public static int 餘額;
    public static int 提款;
    public static int 存款;
    public static int 存款餘額;
    public static int 提款餘額;

    public static void 初值() {
        餘額 = 5000;
        System.out.println("初期存款" + 餘額);
    }

    public static void 存款() {
        存款 = sc.nextInt();

    }

    public static void 提款() {
        提款 = sc.nextInt();

    }

    public static void 存款餘額() {
        存款餘額 = 餘額 + 存款;
        System.out.println("存款餘額" + 存款餘額);

    }

    public static void 提款餘額() {
        提款餘額 = 餘額 - 提款;
        System.out.println("提款餘額" + 提款餘額);

    }
    
        
    
}
