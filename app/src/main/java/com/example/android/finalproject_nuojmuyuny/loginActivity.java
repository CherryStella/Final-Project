package com.example.android.finalproject_nuojmuyuny;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import static com.example.android.finalproject_nuojmuyuny.R.id.sign_up;

public class loginActivity extends AppCompatActivity {

    Button signUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void signUp(View view) {
        signUp = findViewById(R.id.sign_up);
        Intent newIntent;
        newIntent = new Intent(this, InformationActivity.class);
        startActivity(newIntent);
    }
}
