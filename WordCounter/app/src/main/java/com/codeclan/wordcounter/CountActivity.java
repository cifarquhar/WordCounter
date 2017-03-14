package com.codeclan.wordcounter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class CountActivity extends AppCompatActivity {

    TextView wordCount;
    Counter wordArray;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_count);

        Intent intent = getIntent();
        Bundle extras = intent.getExtras();
        String input = extras.getString("input");

        wordArray = new Counter();
        wordArray.addString(input);
        int words = wordArray.countWords();

        wordCount = (TextView)findViewById(R.id.word_count);
        wordCount.setText("There are " + words + " words in that phrase." );
    }
}
