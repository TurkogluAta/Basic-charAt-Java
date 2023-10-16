/*
 *VowelsApp.java
 *@author BSHC1A
 *27/3/23
 */

 import javax.swing.JOptionPane;

 public class VowelsApp{
	 public static void main(String args[]){
		 String input;
		 int v;

		 Vowels myV = new Vowels();

		 input = JOptionPane.showInputDialog(null,"Enter a word");
		 myV.setInput(input);

		 myV.compute();

		 v = myV.getV();
		 JOptionPane.showMessageDialog(null,"There are "+v+" vowels in that word");
	 }
 }