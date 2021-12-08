package fr.mediatheque;

public class CD extends Media{

    private final Format format;

    public CD(String author, String title, Format format){
        super(author, title);
        this.format = format;
    }
    public Format getFormat(){
        return this.format;
    }

    public String toString(){
        return "Voici "+ getTitle()+" créée par "+ getAuthor()+" au format ["+this.format+"].";
    }




}
