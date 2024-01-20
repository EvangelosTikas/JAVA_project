/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication3;
import java.util.Scanner;


public class JavaApplication3 {
    
    static void ask1(){
        Scanner inp = new Scanner(System.in);
        int max=0,min=0, sum=0, num;
        double avg; sum=0;
        System.out.println("Give 1st number: ");
        num = inp.nextInt();
        max = min =num;
        for(int i=1; i<=10; i++){
            System.out.println("Give number " + i+": ");
            num = inp.nextInt();
            sum += num;
            if(num>max){
                max = num;
            }
            if(num<min){
                min = num;
            }
        }
        avg = ((double)sum)/10 ;
        System.out.println("Min: " + min + " ,Max: " + max + " ,Sum: " + sum + " , Average: " + avg);
    }
    static int factorial(int number){
        int fact;
        if(number == 0){
            return 1;
        }
        else if(number ==1 ){
            return 1;
        }
        fact = number *factorial(number -1);
        return fact;
    }
    static void ask2(){
        Scanner inp1 = new Scanner(System.in);
       
        System.out.println("Give number: ");
        int n = inp1.nextInt();
        System.out.println(n + "! = " + factorial(n));
        
    }
    static void ask3(){
        Scanner inp1 =new Scanner(System.in);
        System.out.println("Student's grade (0-10): ");
        double grade = inp1.nextDouble();
        if (grade < 5.0){
            System.out.println("Failure.");
        }
        else if((grade >= 5.0) && (grade <6.5)){
            System.out.println("Pass.");
        }
        else if((grade >= 6.5) && (grade <8.5)){
            System.out.println("Very Good.");
        }
        else{
            System.out.println("Excellent.");
        }
    }
    static void ask4(){
        int i = 0; int sum =0;
        do{
            sum +=i;
            i+=2;
        }while (i<500);
        System.out.println("Sum of even numbers untill 500: " + sum);
    }
    static void ask5(){
        //prime number is only divisible by 1 and itself
        System.out.println("Prime numbers: ");
        for(int i = 2; i<=1000; i++){
            int index=0;
            for(index = 2; index <= i/2; index++){
            if(i%index == 0){
                 break;
             }
             
             
         }
         System.out.print(" " + i);
         
        }
    }
    static void ask6(){
        Scanner inp = new Scanner(System.in);
        System.out.println("Give a number: ");
        int num = inp.nextInt();
        switch(num){
            case 0: System.out.println("Error! Wrong input, exiting...");
            break;
            case 1: System.out.println(num + ": Monday");
            break;
            case 2: System.out.println(num + ": Tuesday");
            break;
            case 3: System.out.println(num + ": Wednesday");
            break;
            case 4: System.out.println(num + ": Thursday");
            break;
            case 5: System.out.println(num + ": Friday");
            break;
            case 6: System.out.println(num + ": Saturday");
            break;
            case 7: System.out.println(num + ": Sunday");
            break;
            default: System.out.println("Illegal input " + num + ", exiting...");
            System.exit(1);
        }
    }
    static void ask7(){
        Scanner inp = new Scanner(System.in);
        System.out.println("Give a number to be printed backwards: ");
        int num = inp.nextInt();
        int rem=0; 
        String reverse_num="";
        while(num>1){
            rem = num%10;
            num = num/10;
            reverse_num += String.valueOf(rem);
            
        }
        System.out.println("Reverse number: " + reverse_num);
    }
    
    public static void main(String[] args) {
//        ask1();
//        ask2();
//        ask3() ;  
//        ask4();
//        ask5();
        ask6();
        ask7();
    }
    
}
