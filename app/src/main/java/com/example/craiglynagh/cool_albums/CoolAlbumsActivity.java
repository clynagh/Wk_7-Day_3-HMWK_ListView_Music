package com.example.craiglynagh.cool_albums;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;

public class CoolAlbumsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.albums_list);

        CoolAlbums coolAlbums = new CoolAlbums();
        ArrayList<Album> list = coolAlbums.getList();

        CoolAlbumsAdapter albumsAdapter = new CoolAlbumsAdapter(this, list);

        ListView listView = (ListView)findViewById(R.id.list);
        listView.setAdapter(albumsAdapter);
    }

    public void getAlbum(View listItem) {
        Album album = (Album) listItem.getTag();
        Log.d("Album Title", album.getTitle());
    }
}





