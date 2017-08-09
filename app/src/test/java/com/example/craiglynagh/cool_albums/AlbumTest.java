package com.example.craiglynagh.cool_albums;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by craiglynagh on 09/08/2017.
 */

public class AlbumTest {

    Album album;

    @Before
    public void before(){
        album = new Album(25, "Disintegration", 1993);
    }

    @Test
    public void getRankingTest(){
        assertEquals((Integer)25, album.getRanking());
    }


}

