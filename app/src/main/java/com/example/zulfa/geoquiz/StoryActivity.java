package com.example.zulfa.geoquiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class StoryActivity extends AppCompatActivity {
    private String name;
    private TextView storyHeading;
    private int textId;

    public int getTextId() {
        return textId;
    }

    public void setTextId(int textId) {
        this.textId = textId;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_story);

        storyHeading = (TextView) findViewById(R.id.genreTextView);

        Intent intent = getIntent();
         name = intent.getStringExtra(getString(R.string.key_name));

        if (name ==null || name.isEmpty()){
            name = "Friend";
        }

//        storyHeading.setText(name);
        loadName();
//        Toast.makeText(this,name,Toast.LENGTH_LONG).show();

    }

    private void loadName() {
        String userName = getString(R.string.choose_your_adventure);
        userName = String.format(userName,name);
        storyHeading.setText(userName);
    }
}
