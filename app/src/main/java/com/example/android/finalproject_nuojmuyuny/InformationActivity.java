package com.example.android.finalproject_nuojmuyuny;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class InformationActivity extends AppCompatActivity {

    EditText nameText;
    EditText ageText;
    EditText genderText;
    EditText heightText;
    EditText weightText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_information);
        nameText = findViewById(R.id.nameText);
        ageText = findViewById(R.id.ageText);
        genderText = findViewById(R.id.genderText);
        heightText = findViewById(R.id.heightText);
        weightText = findViewById(R.id.weightText);
    }

    public void submit(View view){
        String name = nameText.getText().toString();
        int age = Integer.valueOf(ageText.getText().toString());
        String gender  = genderText.getText().toString();
        double height = Double.valueOf(heightText.getText().toString());
        double weight = Double.valueOf(weightText.getText().toString());
        Profile personProfile = new Profile(name,age,gender,height,weight);
        Intent personIntent = new Intent(this,ProfileActivity.class);
        personIntent.putExtra(Keys.PERSON,personProfile);
        startActivity(personIntent);
    }
}
