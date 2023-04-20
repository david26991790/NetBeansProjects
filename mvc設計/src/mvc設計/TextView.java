/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc設計;

/**
 *
 * @author user
 */
public class TextView {
    
    private CharSequence text;
    
    private CharSequence gettext() {
        return gettext();
    }
    public void settext(CharSequence text) {
        this.text = text;
        this.show();      
    }
    private void show() {
        System.out.println("---TextView---");
        System.out.println(this.text);
    }
    
}
