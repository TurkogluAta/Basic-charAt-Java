/*
 *StarsApp.java
 *27/3/23
 *@author BSHC1A
 */

 import javax.swing.JOptionPane;

 public class StarsApp{
	 public static void main(String args[]){
		 String input;

		 Stars myStars = new Stars();

		 input = JOptionPane.showInputDialog(null,"Enter a word");

		 myStars.setInput(input);

		 myStars.compute();
	 }
 }
