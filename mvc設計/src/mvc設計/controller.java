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
public class controller {
    private StudentModel model;
    private TextView view;
    public void create() {
        model = new StudentModel("Tom", 100, 99);
        view = new TextView();
    }
    public void run() {
        String s;
        s = model.getname() + "\n" +model.geteng() + "\n" + model.getmath();
        view.settext(s);
    }
    
}
