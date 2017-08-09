package com.example.craiglynagh.cool_albums;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;


public class CoolAlbumsAdapter extends ArrayAdapter<Album> {

    public CoolAlbumsAdapter(Context context, ArrayList<Album> albums){
        super(context, 0, albums);
    }

    @Override
    public View getView(int position, View listItemView, ViewGroup parent){
        if (listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.albums_item, parent, false);

        }
        Album currentAlbum = getItem(position);

        TextView ranking = (TextView)listItemView.findViewById(R.id.ranking);
        ranking.setText(currentAlbum.getRanking().toString());

        TextView title = (TextView)listItemView.findViewById(R.id.title);
        title.setText(currentAlbum.getTitle());

        TextView year = (TextView)listItemView.findViewById(R.id.year);
        year.setText(currentAlbum.getYear().toString());

        listItemView.setTag(currentAlbum);

        return listItemView;
    }


}





