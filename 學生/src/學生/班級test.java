/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package 學生;

/**
 *
 * @author user
 */
public class 班級test {
    public static void main(String[] args) {
        
        學生 x1;
        學生 x2;
        學生 x3;
        
        班級 c1;
        班級 c2;
        班級 c3;
        
        x1 = new 學生();
        x1.id = 1;
        x1.name="Tom";
        x1.eng=100;
        x1.math=99;
        
        x2 = new 學生();
        x2.id = 2;
        x2.name="Amy";
        x2.eng=90;
        x2.math=95;
        
        x3 = new 學生();
        x3.id = 3;
        x3.name="Jack";
        x3.eng=80;
        x3.math=85;
        
        c1 = new 班級();
        c1.名稱="andriod班";
        c1.加入學生(x1);
        c1.加入學生(x2);
        c1.加入學生(x3);
        c1.顯示資料(0);
        
        c2 = new 班級();
        c2.名稱="java班";
        c2.加入學生(x1);
        c2.加入學生(x2);
        c2.加入學生(x3);
        c2.顯示資料(0);
        
         
        
        
        
    }
    
}
