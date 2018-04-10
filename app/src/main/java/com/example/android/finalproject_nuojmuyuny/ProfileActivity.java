package com.example.android.finalproject_nuojmuyuny;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ProfileActivity extends AppCompatActivity {
    TextView nameSpace;
    TextView ageSpace;
    TextView genderSpace;
    TextView heightSpace;
    TextView weightSpace;
    TextView calorieSpace;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        nameSpace = findViewById(R.id.name_enter);
    }
}
