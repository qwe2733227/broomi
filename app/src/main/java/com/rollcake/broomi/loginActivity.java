package com.rollcake.broomi;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class loginActivity extends AppCompatActivity
{
    protected void onCreate(@Nullable Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void joinmember(View view) {
        Intent intent = new Intent(this, registerActivity.class);
        startActivity(intent);
    }
}
