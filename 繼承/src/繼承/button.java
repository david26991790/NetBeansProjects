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
public class button extends TextView{

    public button(int id, int width, int height) {
        super(id, width, height);
    }
    public void click() {
        System.out.println("---click---");
        System.out.println(this.gettext() + "被按下了");
    }
    
}
