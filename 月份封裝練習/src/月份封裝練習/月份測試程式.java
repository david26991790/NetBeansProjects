/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package 月份封裝練習;

/**
 *
 * @author user
 */
public class 月份測試程式 {

    public static void main(String[] args) {
        日期 d;
        d = new 日期();
        d.set年(2021);
        d.set月(5);
        d.set日(25);
        d.顯示資料();
        

    }
    public class 老師版本練習 {
    private int year;
    private int month;
    private int day;
    
    public 老師版本練習(int year,int month,int day) {
        this.year = year;
        this.month = month;
        this.day = day;
        System.out.println("建構子 完成");
    
    }
    public int getyear() {return this.year;}
    
    

}
