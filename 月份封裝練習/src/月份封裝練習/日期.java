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
public class 日期 {

    private int 年 = 0;
    private int 月 = 0;
    private int 日 = 0;

    public void set年(int 年) {
        System.out.println("---年顯示資料--");
        this.年 = 年;
        System.out.println("月份設定成功" + this.年);

    }

    public void set月(int 月) {
        if (月 < 1 || 月 > 12) {
            System.out.println("月份設定失敗" + 月);
            System.out.println("[原因]月份必須1~12");
            return;
        } else {
            this.月 = 月;
        }
        System.out.println("月份設定成功" + this.月);
    }

    public void set日(int 日) {
        System.out.println("---月顯示資料---");

        switch (日) {
            case 1:
                if (日 < 1 || 日 > 31) {
                    System.out.println("日期設定失敗" + 日);
                    System.out.println("[原因]日期必須符合大小月");
                    return;
                }
            case 2:
                if (日 < 1 || 日 > 29) {
                    System.out.println("日期設定失敗" + 日);
                    System.out.println("[原因]日期必須符合大小月");
                    return;
                }
            case 3:
                if (日 < 1 || 日 > 31) {
                    System.out.println("日期設定失敗" + 日);
                    System.out.println("[原因]日期必須符合大小月");
                    return;
                }
            case 4:
                if (日 < 1 || 日 > 30) {
                    System.out.println("日期設定失敗" + 日);
                    System.out.println("[原因]日期必須符合大小月");
                    return;
                }
            case 5:
                if (日 < 1 || 日 > 31) {
                    System.out.println("日期設定失敗" + 日);
                    System.out.println("[原因]日期必須符合大小月");
                    return;
                }
            case 6:
                if (日 < 1 || 日 > 30) {
                    System.out.println("日期設定失敗" + 日);
                    System.out.println("[原因]日期必須符合大小月");
                    return;
                }
            case 7:
                if (日 < 1 || 日 > 31) {
                    System.out.println("日期設定失敗" + 日);
                    System.out.println("[原因]日期必須符合大小月");
                    return;
                }
            case 8:
                if (日 < 1 || 日 > 31) {
                    System.out.println("日期設定失敗" + 日);
                    System.out.println("[原因]日期必須符合大小月");
                    return;
                }
            case 9:
                if (日 < 1 || 日 > 30) {
                    System.out.println("日期設定失敗" + 日);
                    System.out.println("[原因]日期必須符合大小月");
                    return;
                }
            case 10:
                if (日 < 1 || 日 > 31) {
                    System.out.println("日期設定失敗" + 日);
                    System.out.println("[原因]日期必須符合大小月");
                    return;
                }
            case 11:
                if (日 < 1 || 日 > 30) {
                    System.out.println("日期設定失敗" + 日);
                    System.out.println("[原因]日期必須符合大小月");
                    return;
                }
            case 12:
                if (日 < 1 || 日 > 31) {
                    System.out.println("日期設定失敗" + 日);
                    System.out.println("[原因]日期必須符合大小月");
                    return;
                }
            default:
                this.日 = 日;
                System.out.println("日期設定成功" + this.日); 

        }

    }

    public  void 顯示資料() {
        if (this.年 == 0||this.月 == 0||this.日 == 0) {
            System.out.println("---顯示資料---");
            System.out.println("日期無效 無法顯示");
                        
        } else {
            System.out.println(this.年+"/"+this.月+"/"+this.日);
        }

    }
}
