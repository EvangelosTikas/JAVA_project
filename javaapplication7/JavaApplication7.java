/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication7;

import java.util.Arrays;

/**

 * Set 7
 * @author Vagelis Tikas
 * Introduction to Java, M.Sc. in Electronic Physics, S. Goudos
 * 2nd semester , 2021-22
 * 
 */
public class JavaApplication7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Author[] authors_list = new Author[14] ;
        Paper[] papers_list = new Paper[11];
        
        //We have a library with a list of papaers and authors
        //,fill the list of papers first, each paper has a list of authors in it though
        
        Paper paper1 = new Paper("UML και Java"); papers_list[0] = paper1;
        Paper paper2 = new Paper("Compilers I");  papers_list[1] = paper2;
        Paper paper3 = new Paper("Compilers II"); papers_list[2] = paper3;
        Paper paper4 = new Paper("Programming with Java"); papers_list[3] = paper4;
        Paper paper5 = new Paper("Object oriented Analysis"); papers_list[4] = paper5;
        Paper paper6 = new Paper("Databases"); papers_list[5] = paper6;
        Paper paper7 = new Paper("Windows Operating System"); papers_list[6] = paper7;
        Paper paper8 = new Paper("Web programming"); papers_list[7] = paper8;
        Paper paper9 = new Paper("IOS Operating System"); papers_list[8] = paper9;
        Paper paper10 = new Paper("Design Patterns"); papers_list[9] = paper10;
        //Now create Authors with their according papers, and then fill the lsit of their papers
        // Also fill our Library authors_list with each author
        
        Paper[] papers_georgiou = new Paper[3]; papers_georgiou[0] = paper1; papers_georgiou[1] = paper3; papers_georgiou[2] = paper5;
        Author author1 = new Author("Γεωργίου", papers_georgiou ); authors_list[0] = author1;
        
        Paper[] papers_Anast = new Paper[2]; papers_Anast[0] = paper1; papers_Anast[1] = paper10;
        Author author2 = new Author("Αναστασίου", papers_Anast ); authors_list[1] = author2;
        
        Paper[] papers_papado = new Paper[1]; papers_papado[0] = paper2; 
        Author author3 = new Author("Παπαδοπούλου", papers_papado ); authors_list[2] = author3;
        
        Paper[] papers_kot = new Paper[2]; papers_kot[0] = paper2; papers_kot[1] = paper7;
        Author author4 = new Author("Κωτίδης", papers_kot ); authors_list[3] = author4;
        
        Paper[] papers_adam = new Paper[1]; papers_adam[0] = paper4; 
        Author author5 = new Author("Αδαμάκης", papers_adam ); authors_list[4] = author5;
        
        Paper[] papers_papant = new Paper[2]; papers_papant[0] = paper5; papers_papant[1] = paper10; 
        Author author6 = new Author("Παπαντωνίου", papers_papant );  authors_list[5] = author6;
        
        Paper[] papers_dim = new Paper[1]; papers_dim[0] = paper6;
        Author author7 = new Author("Δημάκης", papers_dim ); authors_list[6] = author7;
        
        Paper[] papers_sot = new Paper[1]; papers_sot[0] = paper7;
        Author author8 = new Author("Σωτηροπούλου", papers_sot ); authors_list[7] = author8;
        
        Paper[] papers_ath = new Paper[1]; papers_ath[0] = paper7;
        Author author9 = new Author("Αθανασίου", papers_ath ); authors_list[8] = author9;
        
        Paper[] papers_oikon = new Paper[1]; papers_oikon[0] = paper7;
        Author author10 = new Author("Οικονόμου", papers_oikon ); authors_list[9] = author10;
        
        Paper[] papers_kar = new Paper[1]; papers_kar[0] = paper8;
        Author author11 = new Author("Καραγκούνης", papers_kar ); authors_list[10] = author11;
        
        Paper[] papers_georgikop = new Paper[1]; papers_georgikop[0] = paper8;
        Author author12 = new Author("Γεωργικοπούλου", papers_georgikop ); authors_list[11] = author12;
        
        Paper[] papers_anton = new Paper[1]; papers_anton[0] = paper9;
        Author author13 = new Author("Αντωνιάδου", papers_anton); authors_list[12] = author13;
        
        Paper[] papers_dimitr = new Paper[1]; papers_dimitr[0] = paper9;
        Author author14 = new Author("Δημητριάδη", papers_dimitr); authors_list[13] = author14;
        
        //Since each paper has also a list with the authors it was written of, we
        // must also fill the list authors (local private variable) of each object list paper
        // We create new lists pap(i)authors for the authors related to each paper
        
        Author[] pap1authors = new Author[2]; pap1authors[0] = author1; pap1authors[1] = author2;
        paper1.setAuthors(pap1authors);
        
        Author[] pap2authors = new Author[2]; pap2authors[0] = author3; pap2authors[1] = author4;
        paper2.setAuthors(pap2authors);
        
        Author[] pap3authors = new Author[1]; pap3authors[0] = author1; 
        paper3.setAuthors(pap3authors);
        
        Author[] pap4authors = new Author[1]; pap4authors[0] = author5; 
        paper4.setAuthors(pap4authors);
        
        Author[] pap5authors = new Author[2]; pap5authors[0] = author1; pap5authors[1] = author6; 
        paper5.setAuthors(pap5authors);
        
        Author[] pap6authors = new Author[1]; pap6authors[0] = author7;  
        paper6.setAuthors(pap6authors);
        
        Author[] pap7authors = new Author[4]; pap7authors[0] = author8; pap7authors[1] = author4;
        pap7authors[2] = author9; pap7authors[3] = author10;
        paper7.setAuthors(pap7authors);
        
        Author[] pap8authors = new Author[2]; pap8authors[0] = author11;  pap8authors[1] = author12; 
        paper8.setAuthors(pap8authors);
        
        Author[] pap9authors = new Author[1]; pap9authors[0] = author13; 
        paper9.setAuthors(pap9authors);
        
        Author[] pap10authors = new Author[3]; pap10authors[0] = author14; pap10authors[1] = author2; 
        pap10authors[2] = author14;
        paper10.setAuthors(pap10authors);
        
        //Now after all this trouble let us make the library
        Library lib1; 
        lib1 = new Library(papers_list,authors_list);
        
        for (Author authors_list1 : authors_list) {
            System.out.println("Author " + authors_list1.getName() + " with score: " + authors_list1.calcScore() + "\nPapers are: ");
            for (Paper paper : authors_list1.getPapers()) {
                System.out.print(paper.getName() + ", ");
            }
            System.out.println();
        }
        //let us overwrite authors_list to be a list with the authors who have written "UML και Java"
        authors_list = lib1.findAuthors("UML και Java"); System.out.println("Authors who co-wrote article \"UML και Java\": ");
        for(Author author: authors_list){
            System.out.println(author.getName());
        }
        
        authors_list = lib1.findRelatedAuthors("Γεωργίου"); System.out.println("Authors related with \"Γεωργίου\": ");
        for(Author author: authors_list){
            System.out.println(author.getName());
        }
        authors_list = lib1.findRelatedAuthors("Κωτίδης"); System.out.println("Authors related with \"Κωτίδης\": ");
        for(Author author: authors_list){
            System.out.println(author.getName());
        }
    }
}
