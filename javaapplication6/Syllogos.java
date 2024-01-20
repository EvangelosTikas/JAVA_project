/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication6;
import java.util.Scanner;
/**
 *
 * @author Vag
 */
public class Syllogos {
    Member[] mem;
    int range;
    
    public Syllogos(int r){
        this.range = r;
        mem  = new Member[range];
        for(int i =0; i < range; i++){
            mem[i] = new Member();
        }
    }
    
    public void menu(){
        int n=-1;
        Scanner input = new Scanner(System.in);
        System.out.println("********Programma diaxeirisis Syllogoy********\n" +
"1.Eggrafi neou melous\n" +
"2.Emfanisi stoixeion olon ton melon\n" +
"3.Diagrafi melous\n" +
"4.Allagi stoixeion melous\n" +
"0.Exodos...\n" +
"-----------------------------------------------");
        while(n>4 || n<0){
            System.out.println("Epilogi:");
            n = input.nextInt();
            switch(n){
                case 1 -> {
                    range += 1;
                    mem[range] = new Member();
                }
                case 2 -> {
                    for(int i =0; i <= range; i++){
                        mem[i].print();
                    }
                }
                case 3 -> {
                    System.out.println("Choose member to erase: ");
                    int membernum = input.nextInt();
                    mem[membernum].erase();
                }
                case 4 -> {
                }
                case 0 -> {
                }
                default -> {
                        System.out.println("Voitheia: "); System.out.println("********Programma diaxeirisis Syllogoy********\n" +
"1.Eggrafi neou melous\n" +
"2.Emfanisi stoixeion olon ton melon\n" +
"3.Diagrafi melous\n" +
"4.Allagi stoixeion melous\n" +
"0.Exodos...\n" +
"-----------------------------------------------");n=-1;
                }
                 
            }
        }
        
    }
}
