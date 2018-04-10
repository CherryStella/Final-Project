package com.example.android.finalproject_nuojmuyuny;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ProfileActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        TextView nameContent = findViewById(R.id.name_enter);
        TextView ageContent = findViewById(R.id.age_enter);
        TextView genderContent = findViewById(R.id.gender_enter);
        TextView heightContent = findViewById(R.id.height_enter);
        TextView weightContent = findViewById(R.id.weight_enter);
        Intent myIntent = getIntent();
        Profile resultProfile = (Profile)myIntent.getSerializableExtra(Keys.PERSON);

        String showName = resultProfile.getName();
        int showAge = resultProfile.getAge();
        String showGender = resultProfile.getGender();
        double showHeight = resultProfile.getHeight();
        double showWeight = resultProfile.getWeight();
        nameContent.setText("Name: " + showName);
        ageContent.setText("Age: " + showAge);
        genderContent.setText("Gender: " + showGender);
        heightContent.setText("Height(cm): " + showHeight);
        weightContent.setText("Weight(kg): " + showWeight);
    }
}
