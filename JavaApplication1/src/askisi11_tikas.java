/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author Vag
 */
public class askisi11_tikas {

   
    public static void main(String[] args) {
      
        Scanner myobj= new Scanner(System.in); 
         
        System.out.println("Name: ");
        String name = myobj.nextLine();
        System.out.println("Proffesion: ");
        String atr = myobj.nextLine();
        System.out.println("AEM: ");
        int aem = myobj.nextInt();
        System.out.println("email: ");
        String mail = myobj.nextLine();
        System.out.println("Subject: ");
        String subj = myobj.nextLine();
        System.out.println("Grade (0/10): ");
        float grd = myobj.nextFloat();
        
        System.out.println("1.1 finished...");
        
        //Askisi 1.2
        int x = 4;
        int y = 8;
        while (x > 0) {
        x = x - 1; y = y * x;
        System.out.println(y);
        }
        
        //Askisi 1.3
        int a,b,temp;
        a = 1;
        b = 4;
        System.out.println("a is: " + a + " and b is: " + b);
        temp = a;
        a = b;
        b = temp;
        System.out.println("a is now: "+ a + " and b is: " + b);
        //Asikisi 1.4
        double num;
        double num_inch = 0d ;
        System.out.print("Number in centimeters: ");
        num = myobj.nextFloat();
        num_inch = num * 2.54d;
        System.out.println("cm \nIn inches: " + num_inch + " in.");
        
        //Askisi 1.5
        float A,B,C,D,sum1;
        System.out.println("a: ");
        A = myobj.nextFloat();
        System.out.println("b: ");
        B = myobj.nextFloat();
        System.out.println("c: ");
        C = myobj.nextFloat();
        System.out.println("d: ");
        D = myobj.nextFloat();
        sum1 = A + B + C + D;
        System.out.println("Sum of a,b,c,d is: "+ sum1);
        //Askisi 1.6
        float r1,r2,par;
        r1=3;
        r2=4;
        par = (r1*r2) / (r1 + r2);
        System.out.println("Parallel equivalent of "+r1+" and "+r2+" = " + par+" Ohm");
        //Asikisi 1.7
        System.out.println("Give frequency in MHz f= ");
        float f = myobj.nextFloat();
        float l; //wavelength
        l = 299792458 / f; // calculatie it in meters 
        System.out.println("Wavlength in meters is λ="+ l+" m");
    }
}