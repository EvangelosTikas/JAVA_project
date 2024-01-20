/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication5;
import java.util.Scanner;
/**

 * Set 5
 * @author Vagelis Tikas
 * Introduction to Java, M.Sc. in Electronic Physics, S. Goudos
 * 2nd semester , 2021-22
 * 
 */
public class JavaApplication5 {

    static void Ask1(){
        int num[]; int temp;
        num = new int[11];
        Scanner input = new Scanner(System.in);
        for(int i = 0; i<num.length; i++){
            System.out.println("Give number: ");
            temp = input.nextInt();
            num[i] = temp;
            
        }
        System.out.print("Numbers over 10: ");
        for(int i = 0; i<num.length; i++){
            if(num[i]>10){
                System.out.print(" " +num[i] +" ");
            }
        }
        
    }
    
    static void Ask2(){
        int num[]; int temp,min,max, indexmin, indexmax;
        indexmin = 0; indexmax = 0;
        
        num = new int[11];
        Scanner input = new Scanner(System.in);
        System.out.println("Askisi 2: ");
        for(int i = 0; i<num.length; i++){
            System.out.println("Give number: ");
            temp = input.nextInt();
            num[i] = temp;
        }
        min = num[0]; max = num[0];
        for(int i = 0; i<num.length; i++){
            min = num[i] < min ? num[i] : min;
            max = num[i] > max ? num[i] : max;
        }
        for(int i = 0; i<num.length; i++){
            indexmin = num[i] == min ? i: indexmin;
            indexmax = num[i] == max ? i : indexmax;
        }
        System.out.println("Max = " + max + " of index ["+indexmax+"] and Min = "
        +min+ " of index ["+indexmin+"].");
    }
    
    public static void Ask3(){
        int A[] = {1,2,3,4,5,6,7,8,9,10};
        int B[] = {11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        int C[]= new int[21];
        System.out.println("Askisi 3: Array elements of C are ");
        for(int i = 0; i< 20; i++){
            if(i < 10){
                C[i] = A[i];
            }
            else{
                C[i] = B[i - 10];
            }
            System.out.print(C[i] + ", ");
        }
        System.out.println(" ");
    }
    static void bubbleSort(int[] c) {  
        int n = c.length;  
        int temp = 0;  
        for(int i=0; i < n; i++){  
                for(int j=1; j < (n-i); j++){  
                        if(c[j-1] > c[j]){  
                               //swap elements  
                               temp = c[j-1];  
                               c[j-1] = c[j];  
                               c[j] = temp;  
                        }  

                }  
        }  
    }
    
    public static void Ask4(){
        int c[] ={3,1,10,4,42,34,5};  
                 
        System.out.println("Askisi 4 : Array Before Bubble Sort");  
        for(int i=0; i < c.length; i++){  
                System.out.print(c[i] + " ");  
        }  
        System.out.println();  

        bubbleSort(c); //sort the cay  

        System.out.println("Array After Bubble Sort");  
        for(int i=0; i < c.length; i++){  
                System.out.print(c[i] + " ");  
        } 
    }
    public static void Ask5(){
        int rowsum[]= new int[3];
        int colsum[]= new int[3];
        int maxrow = 0, maxcol = 0, normsum=0;
        double eunorm=0;
        int A[][] = {{5, -4 ,2}, { -1, 2, 3}, { -2, 1, 0}};
        System.out.println("\nAskisi 5 : A =  [5, -4, 2]"
                + "\n\t\t[ -1, 2, 3]"
                + "\n\t\t[-2, 1, 0]");
        for(int i=0; i<3; i++){        
            for(int j=0; j<3; j++){
                rowsum[i] += Math.abs(A[i][j]);
                colsum[i] += Math.abs(A[j][i]);
                normsum += Math.pow(A[i][j],2);
            }
             
            System.out.println("rowsum "+rowsum[i]+ " and colsum " + colsum[i]);
        }
        maxrow = rowsum[0]; maxcol = colsum[0];
        for(int i=0; i<3; i++){
            maxrow = rowsum[i] > maxrow ? rowsum[i] : maxrow;
            maxcol = colsum[i] > maxcol ? colsum[i] : maxcol;
        }
        eunorm = Math.sqrt(normsum); 
        System.out.println("Maximum absolute sum of rows is:"
        + maxrow + "\nMaximum abolute sum of collumns is: " + maxcol 
        + "\nEuclidean norm: " + eunorm);
        System.out.println();
    }
        
    public static void Ask6(){ 
        int a[][] = {{5, -4 ,2}, { -1, 2, 3}, { -2, 1, 0}};    
        int b[][] = {{4 ,-3, 2},{0, 1, 6},{-8, 4, 9}};
        //creating another matrix to store the multiplication of two matrices    
        int c[][]=new int[3][3];  //3 rows and 3 columns  
        int x,y,z,determinant=0;
        System.out.println("Askisi 6 : 3x3 matrix C = ");
        //multiplying and printing multiplication of 2 matrices    
        for(int i=0;i<3;i++){    
            for(int j=0;j<3;j++){    
                c[i][j]=0;      // i and j are looped as row=i, collumn = j
                for(int k=0;k<3;k++)      
                    {      
                    c[i][j]+=a[i][k]*b[k][j];      
                    }//end of k loop which marks the end of one element of c cay 
                System.out.print(c[i][j]+" ");  //printing matrix element  
            }//end of j loop  
            System.out.println();//new line    
        } 
        x = (c[1][1] * c[2][2]) - (c[2][1] * c[1][2]);
        y = (c[1][0] * c[2][2]) - (c[2][0] * c[1][2]);
        z = (c[1][0] * c[2][1]) - (c[2][0] * c[1][1]);

        determinant = (c[0][0] * x)- (c[0][1] * y) + (c[0][2] * z);

        System.out.println("The Determinant of  C = " + determinant );
    }   
    public static void main(String[] args) {
        // Askisi1
//        Ask1();
        
        //Askisi2
//        Ask2();
        //Askisi 3
        Ask3();
        
        //Askisi 4
        Ask4();
        
        //Askisi 5
        Ask5();
        
        //Askisi6
        Ask6();
    }
    
}
