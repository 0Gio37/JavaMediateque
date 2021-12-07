package fr.mediatheque;

public class DVD extends Media{

    private final int zone;

    public DVD(String author, String title, int zone){
        super(author, title);
        this.zone = zone;
    }

    public boolean readable(int[] tbZones){
        boolean status = false;
        for (int item : tbZones){
            if(item == this.zone){
                status = true;
            }
        }
        return status;
    }


}
