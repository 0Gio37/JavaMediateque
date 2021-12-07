package fr.mediatheque;

import java.util.ArrayList;
import java.util.List;

public abstract class MyMediathque {

    private List<Media> mediumList = new ArrayList<>();

    public void addMedia(Media media){
        mediumList.add(media);
    }




}
