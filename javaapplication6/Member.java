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
public class Member {
    private String name,address;
    private int birthyear, sign_year;
    
    public Member(){
        Scanner input = new Scanner(System.in);
        System.out.println("Give name: "); 
        this.name  = input.nextLine();
        System.out.println("Give address: "); 
        this.address  = input.nextLine();
        System.out.println("Give year of birth: "); 
        this.birthyear= input.nextInt();
        
        System.out.println("Give yaer of signing: "); 
        this.sign_year = input.nextInt();
        
    }
    
    public void print(){
        System.out.println("Member: " + name +" lives in "+ address+" born in" + 
        birthyear + " and signed in " + sign_year);
    }
    public void erase(){
        this.name = "";
        this.address = "";
        this.birthyear = 0;
        this.sign_year = 0;
    }
}
