/*
 *Reverse.java
 *27/3/23
 *@author BSHC1A
 */

 public class Reverse{
	 String input;

	 public Reverse(){
		 input = " ";
	 }

	 public void setInput(String input){
		 this.input = input;
	 }

	 public void compute(){
		 for(int i = input.length()-1; i>=0;i--){
			 System.out.print(input.charAt(i));
		 }
	 }
 }