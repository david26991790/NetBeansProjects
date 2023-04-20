/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package 分數上台大;

/**
 *
 * @author user
 */
public class 大家考多少 {
    public static String 名字;
    public static int 數學;
    public static int 英文;
    public static int 總分;
    public static void 成績單() {
        System.out.println("----成績單----");
        名字 = "小明";
        英文 = 80;
        數學 = 70;
        
        名字 = "小華";
        英文 = 60;
        數學 = 50;
        
        
         
    }
    public static void 顯示成績() {
        System.out.println("---顯示成績---");
        System.out.println(名字);
        System.out.println(英文);
        System.out.println(數學);
    }
    public static void 總分() {
        System.out.println("總分");
        System.out.println(總分=(英文+數學));
        
        
    }
    public static void 學校() {
        System.out.println("---學校---");
        
        if (英文+數學>90) {
            System.out.println("台大");
        }
        else if  (英文+數學>80) {
             System.out.println("政大");
        }else {
             System.out.println("東吳");     
                }
            
        }
       
            
}
        
        
    

    

        
        
 
