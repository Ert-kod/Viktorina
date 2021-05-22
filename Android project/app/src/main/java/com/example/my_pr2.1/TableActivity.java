package com.example.my_pr2;

import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;


import static com.example.my_pr2.TestActivityQue.SVRSGL_RSQ;
import static com.example.my_pr2.CatActivity.SAVE_DATA;
import static com.example.my_pr2.TestActivityDoom.SVRSGL_RSD;
import static com.example.my_pr2.TestActivityHalf.SVRSGL_RSHA;
import static com.example.my_pr2.TestActivityHistory_game.SVRSGL_RSH;
import static com.example.my_pr2.TestActivityMin.SVRSGL_RSM;
import static com.example.my_pr2.TestActivityPhy.SVRSGL_RSP;

public class TableActivity extends AppCompatActivity {
    TextView tv_res,tv_res1, tv_res2, tv_res3,tv_res4,tv_res5,tv_res6;
    Button bt_clear_table;

    SharedPreferences svrs;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LOCKED);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        setContentView(R.layout.activity_table);

        svrs = getSharedPreferences(SAVE_DATA,MODE_PRIVATE);

        tv_res = (TextView) findViewById(R.id.tv_result);
        tv_res1 = (TextView) findViewById(R.id.tv_result1);
        tv_res2 = (TextView) findViewById(R.id.tv_result2);
        tv_res3 = (TextView) findViewById(R.id.tv_result3);
        tv_res4 = (TextView) findViewById(R.id.tv_result4);
        tv_res5 = (TextView) findViewById(R.id.tv_result5);

        bt_clear_table = (Button) findViewById(R.id.bt_clear_table);

        bt_clear_table.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences.Editor editor = svrs.edit();
                editor.clear();
                editor.apply();
                CreateTv();
            }
        });
        CreateTv();
    }

    public void CreateTv(){
        SharedPreferences preferences = svrs;
        tv_res.setText(preferences.getString(SVRSGL_RSM,"Нет результата"));
        tv_res1.setText(preferences.getString(SVRSGL_RSP,"Нет результата"));
        tv_res2.setText(preferences.getString(SVRSGL_RSD,"Нет результата"));
        tv_res3.setText(preferences.getString(SVRSGL_RSH,"Нет результата"));
        tv_res4.setText(preferences.getString(SVRSGL_RSHA,"Нет результата"));
        tv_res5.setText(preferences.getString(SVRSGL_RSQ,"Нет результата"));

    }
}