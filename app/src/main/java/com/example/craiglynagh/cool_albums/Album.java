package com.example.craiglynagh.cool_albums;

/**
 * Created by craiglynagh on 09/08/2017.
 */

public class Album {

    private int ranking;
    private String title;
    private int year;


    public Album(Integer ranking, String title, Integer year) {
        this.ranking = ranking;
        this.title = title;
        this.year = year;
    }

    public Integer getRanking(){
        return ranking;
    }

    public String getTitle(){
        return title;
    }

    public Integer getYear(){
        return year;
    }
}


