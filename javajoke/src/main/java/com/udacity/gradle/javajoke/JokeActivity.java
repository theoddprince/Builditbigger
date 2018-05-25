package com.udacity.gradle.javajoke;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class JokeActivity extends AppCompatActivity {
    public final static String JOKE = "JOKE";
    String joke;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke);

        TextView textViewJoke = findViewById(R.id.jokeText);
        joke = getIntent().getStringExtra(JOKE);
        textViewJoke.setText(joke);
    }
}
