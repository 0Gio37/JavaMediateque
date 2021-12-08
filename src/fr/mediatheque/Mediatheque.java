package fr.mediatheque;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public abstract class Mediatheque {

    private static List<Media> mediumList = new ArrayList<>();

    public static void addMedia(Media media){
        mediumList.add(media);
    }

    public static void displayMediumList(){
     for (Media item: mediumList){
         System.out.println("Auteur : "+item.getAuthor()+" | Titre : "+item.getTitle() + " | Format : "+item.getFormat());
     }
    }

    public static void filtre(String critere, String valeur){
        boolean msgErr = true;

        switch (critere.toLowerCase()){
            case "author":
                for (Media item : mediumList){
                    if(Objects.equals(item.getAuthor(), valeur.toLowerCase())){
                        System.out.println("Auteur : "+item.getAuthor()+" | Titre : "+item.getTitle());
                        msgErr = false;
                    }
                }
                if(msgErr){
                    System.out.println("Aucune correspondance trouvée");
                }
                break;
            case "title":
                for (Media item : mediumList){
                    if(Objects.equals(item.getTitle(), valeur.toLowerCase())){
                        System.out.println("Auteur : "+item.getAuthor()+" | Titre : "+item.getTitle());
                        msgErr = false;
                    }
                }
                if(msgErr){
                    System.out.println("Aucune correspondance trouvée");
                }
                break;
            case "media":
                for (Media item : mediumList) {
                    if (Objects.equals(item.getClass().toString(), "class fr.mediatheque." + valeur.toLowerCase())){
                        System.out.println("Auteur : "+item.getAuthor()+" | Titre : "+item.getTitle());
                        msgErr = false;
                    }
                }
                if(msgErr){
                    System.out.println("Aucune correspondance trouvée");
                }
                break;
            default:  System.out.println("Aucune correspondance trouvée");
        }
    }

}
