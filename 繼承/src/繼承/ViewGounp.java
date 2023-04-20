/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package 繼承;

import java.util.ArrayList;

/**
 *
 * @author user
 */
public class ViewGounp extends view{
    private ArrayList<view>views;

    public ViewGounp(int id, int width, int height) {
        super(id, width, height);
        this.views = new ArrayList();
    }
    public void addView(view v) {
        this.views.add(v);
    }
    
    public String toString() {
        StringBuilder vg;
        vg = new StringBuilder();
        vg.append(getid());
        
    }
    @Override
    public void show() {
        for (view v : views) {
            v.show();
        }
    }
    
}
