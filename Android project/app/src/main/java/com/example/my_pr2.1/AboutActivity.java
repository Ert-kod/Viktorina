package com.example.my_pr2;

import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class AboutActivity extends AppCompatActivity {

    TextView tv_rule;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LOCKED);
        setContentView(R.layout.activity_about);

        tv_rule = (TextView) findViewById(R.id.tv_rule);
        String string = "Приложение Викторнина имеет несколько тем вопросов, микро-игру, чтобы убить время. \n" +
                "Чтобы отвечать на вопросы нажмите на кнопку 'Выбор темы вопросов', затем на нужную тему. По завершению вопросов нажмите на кнопку завершить.\n" +
                "Правила микро-игры: нужно выбрать одну из 9 клеток. Цель: надеятся,что там бомба т.е. если под клеткой бомба вы поюедили, если нет то вы проиграли";
        tv_rule.setText(string);




    }
}

