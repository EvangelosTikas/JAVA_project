/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication6;

/**
 *
 * @author Vag
 */
public class Point {
    private double x,y;
    public Point(double x, double y){
        this.x = x;
        this.y  = y;
    }

    /**
     *
     * @param A
     * @param B
     * @return
     */
    public double dist(Point A, Point B){
        return Math.sqrt(Math.pow((B.x - A.x),2) + Math.pow((B.y - A.y),2));
    }
    public void print(){
        System.out.println("x: " + x + ", y: " + y);
    }
}

