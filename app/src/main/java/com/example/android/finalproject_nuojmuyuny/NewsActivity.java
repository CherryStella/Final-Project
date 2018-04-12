package com.example.android.finalproject_nuojmuyuny;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by yangmuyun on 4/10/18.
 */
public class NewsActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news);
        View v = findViewById(R.id.newsactivity);
        v.getBackground().setAlpha(200);
    }
}
