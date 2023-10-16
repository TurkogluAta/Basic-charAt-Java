/*
 *Vowels.java
 *@author BSHC1A
 *27/3/23
 */

 public class Vowels{
    private String input;
    private int v;

    public Vowels(){
        input = " ";
        v = 0;
    }

    public void setInput(String input){
        this.input = input;
    }

    public void compute(){
        input = input.toLowerCase();
        for(int i = 0; i < input.length();i++){
            if(input.charAt(i)=='a'||input.charAt(i)=='e'||input.charAt(i)=='i'||input.charAt(i)=='o'||input.charAt(i)=='u'){
                v++;
            }
        }
    }

    public int getV(){
        return v;
    }
}