package fr.mediatheque;

import java.util.ArrayList;
import java.util.List;

public class Media {

    private final String author;
    private final String title;
    private int rating;
    private List<Integer> ratingList = new ArrayList<>();

    public Media(String author, String title){
        this.author = author;
        this.title = title;
    }

    public String getAuthor(){
        return this.author;
    }
    public String getTitle(){
        return this.title;
    }
    public String toString(){
        return "Voici "+ getTitle()+" créée par "+ getAuthor()+".";
    }
    public void vote(int note){
        this.rating = note;
        ratingList.add(note);
    }
    public float averageNote(){
        if(ratingList.size() == 0){
            return 0;
        } else{
            float sum=0;
            for (int note : ratingList){
                sum+= note;
            }
            return sum / ratingList.size();
        }

    }
}
