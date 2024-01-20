package javaapplication7;
import java.util.*;

public class Library {
    private Paper[] papers;
    private Author[] authors;    

    public Library(Paper[] papers, Author[] authors) {
        this.papers = papers;
        this.authors = authors;        
    }

    public Paper[] getPapers() {
        return papers;
    }
    
    public Author[] getAuthors() {
        return authors;
    }

    public void setAuthors(Author[] authors) {
        this.authors = authors;
    }    

    public void setPapers(Paper[] papers) {
        this.papers = papers;
    }    
    
    public Author[] findAuthors(String paperName){
        //Η μέθοδος επιστρέφει ένα πίνακα 
        //με τους συγγραφείς της δημοσίευσης με 
        //τίτλο paperName
         
        // we will iterate over papers (list) to find the paper with "paperName"
        // and then return all the authors who have written it with paper.getAuthors()
        //otherwise it will return null if nothing is found
        for(Paper paper : papers){
            if(paper.getName().equals(paperName)){
                return paper.getAuthors();
            }
        }
        return null;
    } 
    
    public Author[] findRelatedAuthors(String authorName){
        //Η μέθοδος επιστρέφει ένα πίνακα 
        //με τους συυγραφείς που έχουν συνεργαστεί 
        //με το συγγραφέα με όνομα authorName, δηλαδή 
        //έχουν κοινή δημοσίευση με το συγγραφέα με όνομα authorName.
        Author[] authors_list; int temp=0; int length =0; //authors_list is the array of related authors that will be returned
        Author our_author = null; Paper[] our_papers = null;
        // first we iterate to find the author we want and create an object,
        // our_author with his name and an oobject array our_papers with his papers
        for (Author author : authors){
            if(author.getName().equals(authorName)){
                our_author = new Author(authorName, author.getPapers());
                our_papers = new Paper[author.getPapers().length];
                our_papers = author.getPapers();
            }
           
        }
        //iterate over our_papers and iterate in our_papers.getAuthors()  list to find the number of authors related with
//      our author's papers. This number will be used as a length for our
        //array authors_list
        for(int i =0 ; i<our_papers.length; i++){
            for (Author author : our_papers[i].getAuthors()) {
                if (!author.getName().equals(authorName)) {
                    //if the name is different, meaning there is a different author in
            // the paper apart from our author then increment the length
                    length++;
                }
                
            }
        }
        authors_list = new Author[length]; //initialize the array with our length
        //iterate again in our_papers with their authors to add each author 
        // who is not equal to our_author, in the Author[] list authors_list
        // since we use enhanced loop we have a variable temp for the index of the list
        for(int i =0 ; i<our_papers.length; i++){
            for (Author author : our_papers[i].getAuthors()) {
                if (!author.getName().equals(authorName)) {
                    authors_list[temp] = author;
                    temp++;
                }
                
            }
        }
        return authors_list;
    }
}
