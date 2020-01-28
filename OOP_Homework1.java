
package oop_homework.pkg1;

import javax.swing.*;
public class OOP_Homework1 {

 
    public static void main(String[] args) {
  
      String s=JOptionPane.showInputDialog("what is your name",JOptionPane.QUESTION_MESSAGE);
         String w=JOptionPane.showInputDialog("enter first number",JOptionPane.QUESTION_MESSAGE);
         String e=JOptionPane.showInputDialog("enter second number",JOptionPane.QUESTION_MESSAGE);
        int p=Integer.parseInt(w);
        int d=Integer.parseInt(e);
        p=p+d;
        JOptionPane.showMessageDialog(null, "Wellcome "+w+" The sum is "+p);
       
    }
    
}
