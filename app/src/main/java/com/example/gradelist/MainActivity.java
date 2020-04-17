package com.example.gradelist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<Word> words = new ArrayList<Word>();

        words.add(new Word("Mathematics", 93));
        words.add(new Word("ICT", 70));
        words.add(new Word("Art", 69.5));
        words.add(new Word("English", 69.4));
        words.add(new Word("Science", 59.5));
        words.add(new Word("History", 59.4));
        words.add(new Word("Designs", 49.5));
        words.add(new Word("P.E.", 49.4));
        words.add(new Word("Geography", 39.5));
        words.add(new Word("R.E.", 39.4));
        words.add(new Word("Media", -1));
        words.add(new Word("Psychology.", 101));

        WordAdapter adapter = new WordAdapter(this, words);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
