package com.example.my_pr2;

import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import static com.example.my_pr2.CatActivity.SAVE_DATA;

public class TestActivityHalf extends AppCompatActivity {
    Button bt_next,bt_close;
    TextView tv_question;
    RadioGroup radioGroup;
    String result_test;

    SharedPreferences save_his;

    public static final String SVRSGL_RSHA = "SVRSGL_RSHA";
    int result = 0;
    int question = 0;
    TestHalf test;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LOCKED);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        setContentView(R.layout.activity_st_test);

        save_his = getSharedPreferences(SAVE_DATA,MODE_PRIVATE);

        test = new TestHalf();
        tv_question = findViewById(R.id.tv_question);
        tv_question.setText(test.question[0].text);

        radioGroup = (RadioGroup) findViewById(R.id.rg_layout);
        add_button(question);

        bt_next = (Button) findViewById(R.id.bt_answer);
        bt_close = (Button) findViewById(R.id.bt_close);

        bt_close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkAnswer(question);
                result_test = result+"/"+test.question.length;
                SharedPreferences.Editor editor = save_his.edit();
                editor.putString(SVRSGL_RSHA,result_test);
                editor.apply();
                finish();
            }
        });

        bt_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkAnswer(question);
                radioGroup.removeAllViews();
                question++;
                add_tv(question);
                add_button(question);
                if (question == test.question.length-1){
                    bt_next.setEnabled(false);
                }
            }

        });
    }

    private void add_tv(int question) {
        for (int i =0; i<test.question[question].answer.length;i++){
            tv_question.setText(test.question[question].text);
        }

    }

    private void checkAnswer(int question) {
        for (int i = 0;i<test.question[question].answer.length;i++){
            RadioButton radioButton = (RadioButton) findViewById(1000+i);
            if (radioButton.isChecked() && test.question[question].true_ == i+1){
                result++;
            }
        }
    }

    private void add_button(int question) {
        for (int i = 0;i<test.question[question].answer.length;i++){
            RadioButton radioButton = new RadioButton(this);
            radioButton.setText(test.question[question].answer[i]);
            radioButton.setId(1000+i);
            radioGroup.addView(radioButton);
        }
    }
}

