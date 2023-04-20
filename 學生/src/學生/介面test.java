package 學生;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class 介面test {
    public static void main(String[] args) {
        String s = "Amy";
        StringBuilder sb = new StringBuilder();
        sb.append("Jack");
        
        CharSequence cs;
        cs =s;
        System.out.println("長度(字數)"+cs.length());
        System.out.println("產生不可變字串"+cs.toString());
        System.out.println("位置0文字"+cs.charAt(0));
        
     
        
        cs =sb;
        System.out.println("長度(字數)"+cs.length());
        System.out.println("產生不可變字串"+cs.toString());
        System.out.println("位置0文字"+cs.charAt(0));
        
    }
    
}
