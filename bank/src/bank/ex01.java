/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank;

/**
 *
 * @author user
 */
public class ex01 {

    public static String 帳戶名稱;
    public static double 存款;
    public static double 提款;

    public static int 現有餘額;

    public static void 帳戶名稱() {
        System.out.println(帳戶名稱 = "David");

    }

    public static void 設定初值() {
        現有餘額 = 500;
        存款 = Math.random();

        提款 = Math.random();

    }

    public static void 存款() {
        現有餘額 += (int) (存款 *500001);
    }

    public static void 提款() {
        現有餘額 -=(int) (提款 *500001);
    }

    public static void 顯示存款() {

        System.out.println("此次存入" + (int)(存款*500001) + "元");
    }
    public static void 顯示提款() {
        System.out.println("此次提出" + (int)(提款*500001) + "元");
        if (現有餘額<0) {
            System.out.println("存款不足");
            
        }
        
    }

    public static void 顯示帳戶資訊() {
        System.out.println(帳戶名稱);
    }

    public static void 現有餘額() {
        System.out.println(現有餘額);
    }

}
