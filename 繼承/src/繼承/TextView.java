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
public class TextView extends view {

    private CharSequence text;

    public TextView(int id, int width, int height) {
        super(id, width, height);
    }

    public CharSequence gettext() {
        return text;

    }

    public void settext(CharSequence text) {
        this.text = text;

    }
    
@Override
    public void show() {
        super.show();
        if (text == null) {
            System.out.println("");

        } else {
            System.out.println("text: " + text);
        }

    }

}
