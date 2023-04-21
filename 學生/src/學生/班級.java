/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package 學生;

import java.util.ArrayList;

/**
 *
 * @author user
 */
public class 班級 {

    public String 名稱;
    private ArrayList<學生> 學生們;

    public 班級() {
        this.學生們 = new ArrayList();
        System.out.println("班級建構完成");
    }

    public void 加入學生(學生 x) {
        this.學生們.add(x);
        System.out.println("加入學生" + x.name);
    }

    public void 顯示資料(int id) {
        System.out.println(toString());

//        for (學生 sb : this.學生們) {
//            sb.show();
//
//        }
    }

    public String toString() {
         
        StringBuilder sb;
        sb = new StringBuilder();
        sb.append(this.名稱);

       
        for (學生 x : this.學生們) {
            sb.append(x.name);
            sb.append(x.id);
            sb.append(x.eng);
            sb.append(x.math);
            sb.append("     /     ");
//
        }
        return sb.toString();
    }

    public 學生 find學生ById(int id) {

        for (學生 sb : 學生們) {
            if (sb.id == id) {
                return sb;

            }

        }
        return null;
    }
}
