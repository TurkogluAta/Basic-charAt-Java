/*
 *Reverse.java
 *27/3/23
 *@author BSHC1A
 */

 import javax.swing.JOptionPane;

 public class ReverseApp{
	 public static void main(String args[]){
		 String input;

		 Reverse myR = new Reverse();

		 input = JOptionPane.showInputDialog(null,"Enter a word");
		 myR.setInput(input);

		 myR.compute();
         
        
	 }
 }
