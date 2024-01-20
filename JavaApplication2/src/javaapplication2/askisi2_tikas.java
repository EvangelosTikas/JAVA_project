/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package javaapplication2;
import java.util.Scanner;
/**
 *
 * @author Vag
 */
public class askisi2_tikas {

    static void function2_1(double d){
        int intpart = (int)d;
        System.out.println("Integer part= "+ intpart);
        System.out.println("Integer part= "+ (d-intpart));
    }
    static void function2_2(double d){
        int din = (int)d;
        if(d == din){
            System.out.println("It's an integer!");
        }
        else 
            System.out.println("It's a double!");
    }
    static void function2_3(){
        Scanner inp = new Scanner(System.in);
        System.out.print("Frequency (Hz)= ");
        double f = inp.nextDouble();
        System.out.print("Distance(m)= ");
        double d = inp.nextDouble();
        double L = 20*Math.log10(d) + 20*Math.log10(f) + 20*Math.log10((4*3.14)/(3*10^8));
        System.out.println("Ldb= "+L);
    }
    
    static void function2_4(double r1, double a1, double r2, double a2){
        double sumr = r1*Math.cos(a1) + r2*Math.cos(a2);
        double suma = r1*Math.sin(a1) + r2*Math.sin(a2);
        System.out.println("Sum of z1+z2= "+ (sumr+suma));
    }
    
    static void function2_5(double R, double v, double L){ //R in Ohm, v in rad/sec and L in mH
        double Z = Math.sqrt(Math.pow(R,2) + Math.pow(v,2)*Math.pow(L, 2));
        double tanf = (v*L)/R;
        System.out.println("Z = "+Z + " Ohm.");
        System.out.println("tanφ = " + tanf);
        
    }
    
    static void function2_6(double vm){ //Vm in Volts!
        double vdc = (2*vm)/(Math.PI);
        double vrms = vm / Math.sqrt(2);
        double vr = Math.sqrt(Math.pow(vrms,2) - Math.pow(vdc,2));
        double factor = vr / vdc;
        System.out.println("ρ factor = "+ factor);
        
    }
    public static void main(String[] args) {
        function2_1(4.78);
        
        function2_2(6);
        function2_3();
        
        function2_4(2,45,5.5,30);
        function2_5(2,1,1);
        
        function2_6(5);
    }
    
}
