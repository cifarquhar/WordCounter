package com.codeclan.wordcounter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class WordCountActivity extends AppCompatActivity {

    EditText stringToSplit;
    Button countButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_word_count);
        stringToSplit = (EditText) findViewById(R.id.string_to_split);
        countButton = (Button) findViewById(R.id.count_button);
    }

    public void onCountButtonClicked(View button){
        String inputString = stringToSplit.getText().toString();
        Intent intent = new Intent(this,CountActivity.class);
        intent.putExtra("input",inputString);

        startActivity(intent);
    }
}
