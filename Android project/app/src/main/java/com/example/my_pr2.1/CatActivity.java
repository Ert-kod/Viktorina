package com.example.my_pr2;


import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class CatActivity extends AppCompatActivity {
    Button minecraft_bt,fisika_bt,doom_bt,history_game_bt,Half_bt,bt_question;

    public static final String SAVE_DATA = "save_data";

    public SharedPreferences save_data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LOCKED);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        setContentView(R.layout.activity_cat);

        save_data = getSharedPreferences(SAVE_DATA, MODE_PRIVATE);

        minecraft_bt = (Button) findViewById(R.id.minecraft_bt);
        fisika_bt = (Button) findViewById(R.id.fisika_bt);
        doom_bt = (Button) findViewById(R.id.doom_bt);
        history_game_bt = (Button) findViewById(R.id.history_game_bt);
        Half_bt = (Button) findViewById(R.id.Half_bt);
        bt_question = (Button) findViewById(R.id.bt_question);


        minecraft_bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CatActivity.this,TestActivityMin.class);
                startActivity(intent);
               

            }
        });
        fisika_bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CatActivity.this,TestActivityPhy.class);
                startActivity(intent);
            }
        });
        doom_bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CatActivity.this,TestActivityDoom.class);
                startActivity(intent);
            }
        });
        history_game_bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CatActivity.this,TestActivityHistory_game.class);
                startActivity(intent);
            }
        });
        Half_bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CatActivity.this,TestActivityHalf.class);
                startActivity(intent);
            }
        });
        bt_question.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CatActivity.this,TestActivityQue.class);
                startActivity(intent);
            }
        });
    }
}
