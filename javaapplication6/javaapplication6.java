/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package javaapplication6;
import java.util.Arrays;
/**
 * Set 6
 * @author Vagelis Tikas
 * Introduction to Java, M.Sc. in Electronic Physics, S. Goudos
 * 2nd semester , 2021-22
 * 
 */
class Student{
    private String name = "New Student";
    private int AM = 9999;
    private int grade = 0;
    
    public Student(){
        this.name = "New Student";
        this.AM = 99999;
        this.grade = 0;
    }
    public Student(String Onoma ){
        this.name = Onoma;
        this.AM = 10056;
        this.grade = 10;
    }
    
    public void printInfo(){
        System.out.println("Student: " + name + ", AM:" + AM +
                " with grade " + grade);
    }
    public void SetName(String name ){
        this.name = name;
    }
    public void SetAM(int AM ){
        this.AM = AM;
    }
    public void Setgrade(int grade ){
        this.grade = grade;
    }
    public String getstring(){
        return name;
    } 
    public int getAM(){
        return AM;
    } 
    public int getgrade(){
        return grade;
    } 
    public void SetAll(String name, int AM , int grade){
        this.name = name;
        this.AM = AM;
        this.grade = grade;
    }
    
}
public class javaapplication6 {

   
    public static void main(String[] args) {
        //Askisi 1
//        CircleTest1 Circle;
//        Circle = new CircleTest1(4.0, 0);
//        
//        System.out.println("Circumference is " + Circle.circumference()+" and area"
//                + " is " + Circle.area());
        
        //Askisi 2
        Student[] aStudent;
        
        aStudent = new Student[3];
        aStudent[0] = new Student("Eleni Kelepouri");
        aStudent[0].printInfo();
        aStudent[1] = new Student();
        aStudent[1].printInfo();
        aStudent[2] = new Student();
        aStudent[2].SetAll("Evaneglos Tikas", 10056, 10);
        System.out.println("This is the grade: " + aStudent[2].getgrade()); 
        aStudent[2].printInfo();
        
        //Askisi 3
        Point A,B,C,D;
        A = new Point(0 , 1.0); B = new Point(0,0);
        rectangle rec;
        rec = new rectangle();
        rec.A = A;
        rec.B = B;
        rec.C = new Point(0 , 3.0);
        rec.D = new Point(1.0, 3.0);
        rec.calculate();
        rec.print();
        System.out.println("Area of rectangle is: " + rec.area());
        
        //Askisi 4
        Syllogos syl;
        syl = new Syllogos(2);
        syl.menu();
        syl.menu();
    }
    
}
