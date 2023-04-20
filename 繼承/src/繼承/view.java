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
public class view extends Object{
    private int id;
    private int width;
    private int height;

    public view(int id, int width, int height) {
        this.id = id;
        this.width = width;
        this.height = height;
    }
    public int getid() {
        return id;
    }
     public int getwidth() {
        return width;
    }
     public int getheight() {
        return height;
        
    }
     public void show() {
         System.out.println("---"+this.getClass().getSimpleName()+"---");
    }
}
