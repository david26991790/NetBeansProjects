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
public class StudentModel {
    private String name;
    private int eng;
    private int math;

    public StudentModel(String name, int eng, int math) {
        this.name = name;
        this.eng = eng;
        this.math = math;
    }
    public String getname() {
        return name;
       
    }
    public int geteng() {
        return eng;
        
    }
      public int getmath() {
        return math;
        
    }
    
}
