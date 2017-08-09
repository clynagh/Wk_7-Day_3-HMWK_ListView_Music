package com.example.craiglynagh.cool_albums;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by craiglynagh on 09/08/2017.
 */

public class CoolAlbumsTest {

    @Test
    public void getListTest() {
        CoolAlbums coolAlbums = new CoolAlbums();
        assertEquals(20, coolAlbums.getList().size());
    }

}

