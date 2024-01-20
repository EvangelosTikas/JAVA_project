package javaapplication7;

import java.util.Objects;

public class Author {

    private String name; 
    private Paper[] papers;

    public Author(String name, Paper[] papers) {
        this.name = name;
        this.papers = papers;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Paper[] getPapers() {
        return papers;
    }

    public void setPapers(Paper[] papers) {
        this.papers = papers;
    }    
   
    public boolean findPaper(String paperName){
        //Επιστρέφει true εάν η δημοσίευση με τίτλο paperName περιλαμβάνεται
        //στις δημοσιεύσεις του συγγραφέα, αλλιώς επιστρέφει false
        boolean flag=false;
        for(int i =0; i <= papers.length ; i++){
            if(papers[i].getName() == (paperName) ){
                flag=true;
            } 
            
        }
        return flag;
    }
    
    
    public double calcScore(){
        
        double score = 0; 
        double added = 0;
        for (Paper paper : papers) {
            score += 100;
//            System.out.println(score);
            for (Author auth : paper.getAuthors()) {
                
                if(!auth.getName().equals(name)){
                    score -= 15; 
                }
                else{
                    continue;
                }
            }
        }
        if ((score > 20) & (score < 51) )
            added  = added + 30;
        
        else if (score > 50){
            added += 50;
        }
        else{
            added = 0;
        }
        score += added; 
        return score;
    }    
  
    
    @Override
    public int hashCode() {
        int hash = 5;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Author other = (Author) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return true;
    }

        
}
