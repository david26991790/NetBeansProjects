/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package 繼承;

import sun.security.pkcs11.wrapper.CK_TLS_MAC_PARAMS;

/**
 *
 * @author user
 */
public class test4 {

    public static void main(String[] args) {

        TextView tv_cm;
        EditText et_cm;
        TextView tv_result;

        tv_cm = new TextView(0, 0, 0);
        tv_cm.settext("身高(cm)");
        tv_cm.show();

        et_cm = new EditText(0, 0, 0);
        et_cm.show();
        et_cm.input();

        String s_cm;
        s_cm = et_cm.gettext().toString();
int i_cm;
i_cm = Integer.parseInt(s_cm);
double d_m;
d_m = i_cm / 100.0;
String s_result;
s_result = "您身高為" + d_m + "公尺";

tv_result = new TextView(3, 50, 20);
tv_result.settext(s_result);
tv_result.show();

    }

}
