package fr.mediatheque;

public class Launcher {
    public static void main(String[] args) {
        Media media1 = new Media("Oyama", "Never give up");
        Media media2 = new Media("moi", "osu");
        Livre livre1 = new Livre("moi", "osu");
        Format formatCDMusical = Format.CD_MUSICAL;
        Format formatOgg = Format.OGG;
        Format formatMp3 = Format.MP3;
        CD cd1 = new CD("red hot","by the way",formatCDMusical);



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



    }
}
