package com.example.craiglynagh.cool_albums;

import java.util.ArrayList;

/**
 * Created by craiglynagh on 09/08/2017.
 */

public class CoolAlbums {

    private ArrayList<Album> list;

    public CoolAlbums(){
        list = new ArrayList<Album>();
        list.add(new Album(1, "", 1));
        list.add(new Album(2, "", 1));
        list.add(new Album(3, "", 1));
        list.add(new Album(4, "", 1));
        list.add(new Album(5, "", 1));
        list.add(new Album(6, "", 1));
        list.add(new Album(7, "", 1));
        list.add(new Album(8, "", 1));
        list.add(new Album(9, "", 1));
        list.add(new Album(10, "", 1));
        list.add(new Album(11, "", 1));
        list.add(new Album(12, "", 1));
        list.add(new Album(13, "", 1));
        list.add(new Album(14, "", 1));
        list.add(new Album(15, "", 1));
        list.add(new Album(16, "", 1));
        list.add(new Album(17, "", 1));
        list.add(new Album(18, "", 1));
        list.add(new Album(19, "", 1));
        list.add(new Album(20, "", 1));
    }

    public ArrayList<Album>getList(){
        return new ArrayList<Album>(list);
    }

}


