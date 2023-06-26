package com.example.myappmusic;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

import java.util.ArrayList;

public class findingActivity extends AppCompatActivity {
    ArrayList<song> arrsong;
    ArrayAdapter adaptersong;
    AutoCompleteTextView btnSearch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_finding);
        btnSearch = findViewById(R.id.btnSearch);
        arrsong = new ArrayList<>();
        arrsong.add(new song("rise and fall", R.raw.riseandfall));
        arrsong.add(new song("điều anh biết", R.raw.dieuanhbiet));
        arrsong.add(new song("i do", R.raw.ido));
        arrsong.add(new song("supper hero", R.raw.superhero));
        arrsong.add(new song(" thu cuối", R.raw.thucuoi));
        adaptersong = new ArrayAdapter(findingActivity.this, android.R.layout.simple_dropdown_item_1line, arrsong);
        btnSearch.setAdapter(adaptersong);
    }
}