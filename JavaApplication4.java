/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package javaapplication4;
import java.util.Scanner;
import java.io.*;
/**
 *
 * @author Vagelis Tikas
 * Introduction to Java, M.Sc. in Electronic Physics, S. Goudos
 * 2nd semester , 2021-22
 * 
 */
public class JavaApplication4 {
// functions for each exrcise for Lab 04:
    static void ask1(){ //1. Γράψτε ένα πρόγραμμα που να μετράει τον 
        // αριθμό των λέξεων σε ένα string που εισάγουμε.
        Scanner input = new Scanner(System.in);
        System.out.print("Give string: ");
        String s = input.nextLine();
        String words[] = s.split(" ");
        System.out.println("Number of words in <<"+s + ">> is " + words.length);
    
}
    static void ask2(){
        //2. Γράψτε ένα πρόγραμμα που να μετράει τον αριθμό των γραμμάτων, 
        //ψηφίων και άλλων χαρακτήρων σε ένα string που εισάγουμε.
        Scanner input = new Scanner(System.in);
        System.out.print("Give string: ");
        String s = input.nextLine();
        char ch1;
        int let=0, dig=0, 
                others = 0;
        for(int i =0; i< s.length(); i++){
            ch1 = s.charAt(i);
            if( (ch1>= 'A' && ch1<= 'Z') || (ch1>= 'a' && ch1<= 'z')){
                let++;
            }
            else if(ch1>= '0' && ch1<= '9'){
                dig++;
            }
            else{
                others++;
            }
        }
        System.out.println("In string \"" + s + "\" there are "
                +let+" letters, "+dig+" digits, "+others+" other characters" );
    }
    static void ask3(){
        //3. Γράψτε ένα πρόγραμμα που να διαβαζει ένα string από το πληκτρολόγιο και 
        //να τυπώνει το μήκος του string και να γράφει τον χαρακτήρα που βρίσκεται 
        //στη δεύτερη θέση του string
        Scanner input = new Scanner(System.in);
        System.out.print("Give string: ");
        String s = input.nextLine();
        System.out.println("Length of string is " + s.length()+" and in the "
                + "second character is: " + s.charAt(1));
        
    
    }
    static void ask4(){
        Scanner input = new Scanner(System.in);
        char chcomp;
        char ch;
        int j=0;
        String s = "The quick brown fox jumps over the lazy dog.";
        
       
        for(ch = 'a'; ch<='z'; ch++){
            for(int i =0; i< s.length(); i++){
                chcomp = s.charAt(i);
                
                if(ch == chcomp){
                    System.out.println(ch+" = "+i);
                }
            }
        }
    }
    static void ask5(){
        Scanner input = new Scanner(System.in);
        System.out.print("Give date in mm/dd/yy: ");
        String s = input.nextLine();
        String months,days;
        months = s.substring(0,2);
        days = s.substring(3,5);
        System.out.println("Date in dd/mm/yy: "+ days+"/"+months+"/"+s.substring(6,10));
        
    }
    static void ask6(){
        Scanner input = new Scanner(System.in);
        System.out.print("Give a phrase: ");
        String s = input.nextLine(); char c;
        int cnt =0;
        for(int i =0; i< s.length(); i++){
            c = s.charAt(i);
            if( (c=='a') || (c=='e') || (c=='y') || (c =='i') || (c=='u') || (c=='o')
                    || (c=='A') || (c=='E') || (c =='Y') || (c=='I') || (c=='U')
                    || (c=='O')){
                cnt++;
                System.out.println(i);
            }
        }
        System.out.println("Phrase had " + cnt+" vowels.");    
            
        
    }
     static void ask7(){
         StringBuffer s = new StringBuffer();
         
         Scanner input = new Scanner(System.in);
         System.out.println("Give a phrase: ");
         String inside_string = input.nextLine();
         String[] words = inside_string.split(" ");
         for(int i = words.length-1; i>=0; i--){
             s.append(words[i]); //add to the end of stringbuffer s each word
             
             s.append(" ");  // add a space " " after each word
         }
         System.out.println("Backwards phrase goes as follows: ");
         System.out.println(s);
     }
    public static void main(String[] args) {
        
        ask1();
        ask2();
        ask3();
        ask4();
        ask5();
        ask6();
        ask7();
        
    }
    
}
