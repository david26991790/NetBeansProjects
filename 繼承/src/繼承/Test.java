/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package 繼承;

/**
 *
 * @author user
 */
public class Test {

    public static void main(String[] args) {
        TextView tv1 = new TextView(1, 50, 20);
        tv1.settext("訊息");

        TextView tv2 = new TextView(2, 50, 20);
        tv2.settext("請按ok");

        button btn = new button(3, 50, 20);
        btn.settext("ok");

        tv1.show();
        tv2.show();
        btn.show();

        btn.click();
    }
}
