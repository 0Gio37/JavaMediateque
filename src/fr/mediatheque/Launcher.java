package fr.mediatheque;

public class Launcher {
    public static void main(String[] args) {
        Media media1 = new Media("Oyama", "Never give up");
        Media media2 = new Media("moi", "sosai");
        Livre livre1 = new Livre("moi", "osu");
        Livre livre2 = new Livre("lui", "osu");

        Format formatCDMusical = Format.CD_MUSICAL;
        Format formatOgg = Format.OGG;
        Format formatMp3 = Format.MP3;
        CD cd1 = new CD("red hot","by the way",formatCDMusical);
        CD cd2 = new CD("Nirvana","Come as you are", formatMp3);
        CD cd3 = new CD("Nirvana","Smell like a virgin spirit", formatOgg);


        Mediatheque.addMedia(media1);
        Mediatheque.addMedia(media2);
        Mediatheque.addMedia(livre1);
        Mediatheque.addMedia(livre2);
        Mediatheque.addMedia(cd1);
        Mediatheque.addMedia(cd2);
        Mediatheque.addMedia(cd3);

        //Mediatheque.displayMediumList();
        Mediatheque.filtre("titLE","OSU");




/*
        System.out.println(media1.toString());
        media1.vote(2);
        media1.vote(5);
        media1.vote(2);
        media1.vote(3);
        media1.vote(1);
        media1.vote(4);

        System.out.println(media1.averageNote());
        System.out.println(media2.averageNote());

        System.out.println(cd1.toString());
*/


    }
}
