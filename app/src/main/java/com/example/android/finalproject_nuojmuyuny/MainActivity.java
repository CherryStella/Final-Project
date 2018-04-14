package com.example.android.finalproject_nuojmuyuny;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView mTextMessage;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_me:
                    mTextMessage.setText("ME");
                    return true;
                case R.id.navigation_foodPlan:
                    mTextMessage.setText("Plan");
                    return true;
                case R.id.navigation_foodDiary:
                    mTextMessage.setText("Diary");
                    return true;
                case R.id.navigation_news:
                    mTextMessage.setText("News");
                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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

        mTextMessage = (TextView) findViewById(R.id.message);
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }

}
