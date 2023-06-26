package com.example.myappmusic;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class ListSong extends AppCompatActivity {
    ArrayList<song> lstsong;
    ListView lvFavoriteSong;
    ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_song);
        @Override
        public void onClick (View v){
            Intent intent=new Intent()
        }
    }
}