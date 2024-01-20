/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication6;

/**
 *
 * @author Vag
 */
public class rectangle {
    double length, width;
    Point A,B,C,D;
    
    
    public void calculate(){
        
        length = B.dist(C , B);
        width = A.dist(B, A);
    }
    
    public void print(){
        System.out.print("A = "); A.print();
        System.out.print("B = "); B.print();
        System.out.print("C = "); C.print();
        System.out.print("D = "); D.print();
        System.out.println("Length: " + length + ", Width: " + width);
    }
    public double area(){
        return length*width;
    }
}
