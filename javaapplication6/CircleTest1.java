/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication6;
/**
 *
 * @author Vag
 */
public class CircleTest1 {
    private double x,y,r;
    CircleTest1(double x, double y){
        this.x=x;
        this.y = y;
        r = Math.sqrt(Math.pow(x,2) + Math.pow(y,2)); 
    }
    
    public double circumference(){
       
        return 2*3.14*r;
    }
    
    public double area(){
        
        return 3.14* Math.pow(r,2);
    }
}
