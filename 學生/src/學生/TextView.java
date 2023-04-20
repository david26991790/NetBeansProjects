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
public class TextView {

    private CharSequence text;

    public CharSequence getText() {
        return text;

    }

    public void SetText(CharSequence text) {
        this.text = text;
        this.show();

    }

private void show() {
        System.out.println("---TextView---");
        System.out.println(this.text);

    }

}
