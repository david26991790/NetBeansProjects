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
public class Test3 {

    public static void main(String[] args) {
        TextView tv1;
        TextView tv2;
        button btn;
        ViewGounp vg;
        tv1 = new TextView(1, 50, 20);
        tv1.settext("訊息");
        tv2 = new TextView(2, 50, 20);
        tv2.settext("請按ok");
        btn = new button(3, 50, 20);
        btn.settext("ok");
        
        vg = new ViewGounp(4, 50, 20);
        vg.addView(tv1);
        vg.addView(tv2);
        vg.addView(btn);
        vg.show();
        
        button b;
        b = (button)vg.findviewById(3);
        b.click();
    }
}
