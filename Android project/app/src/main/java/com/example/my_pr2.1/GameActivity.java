package com.example.my_pr2;

import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.snackbar.Snackbar;

import java.util.Random;

public class GameActivity extends AppCompatActivity {

    public int random_cell = random_cell_mine();
    ImageButton cell1,cell2,cell3,cell4,cell5,cell6,cell7,cell8,cell9;
    Button restart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LOCKED);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        setContentView(R.layout.activity_game);

        cell1 = (ImageButton) findViewById(R.id.cell1);
        cell2 = (ImageButton) findViewById(R.id.cell2);
        cell3 = (ImageButton) findViewById(R.id.cell3);
        cell4 = (ImageButton) findViewById(R.id.cell4);
        cell5 = (ImageButton) findViewById(R.id.cell5);
        cell6 = (ImageButton) findViewById(R.id.cell6);
        cell7 = (ImageButton) findViewById(R.id.cell7);
        cell8 = (ImageButton) findViewById(R.id.cell8);
        cell9 = (ImageButton) findViewById(R.id.cell9);
        restart = (Button) findViewById(R.id.bt_restart);

        cell1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int id = 1;
                cheak_mine(id,cell1);
            }
        });
        cell2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int id = 2;
                cheak_mine(id,cell2);
            }
        });
        cell3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int id = 3;
                cheak_mine(id,cell3);
            }
        });
        cell4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int id = 4;
                cheak_mine(id,cell4);
            }
        });
        cell5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int id = 5;
                cheak_mine(id,cell5);
            }
        });
        cell6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int id = 6;
                cheak_mine(id,cell6);
            }
        });
        cell7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int id = 7;
                cheak_mine(id,cell7);
            }
        });
        cell8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int id = 8;
                cheak_mine(id,cell8);
            }
        });
        cell9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int id = 9;
                cheak_mine(id,cell9);
            }
        });
        restart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                game_restart();
            }
        });


    }

    public void blockCell(){
            cell1.setEnabled(false);
            cell2.setEnabled(false);
            cell3.setEnabled(false);
            cell4.setEnabled(false);
            cell5.setEnabled(false);
            cell6.setEnabled(false);
            cell7.setEnabled(false);
            cell8.setEnabled(false);
            cell9.setEnabled(false);
}
    public int random_cell_mine(){
        int min = 1;
        int max = 9;
        int diff = max - min;
        Random random = new Random();
        int random_cel_mine = random.nextInt(diff + 1);
        random_cel_mine += min;
        return random_cel_mine;
    }
    public void game_restart() {

            cell1.setImageResource(R.drawable.clear_cell);
            cell1.setEnabled(true);
            cell2.setImageResource(R.drawable.clear_cell);
            cell2.setEnabled(true);
            cell3.setImageResource(R.drawable.clear_cell);
            cell3.setEnabled(true);
            cell4.setImageResource(R.drawable.clear_cell);
            cell4.setEnabled(true);
            cell5.setImageResource(R.drawable.clear_cell);
            cell5.setEnabled(true);
            cell6.setImageResource(R.drawable.clear_cell);
            cell6.setEnabled(true);
            cell7.setImageResource(R.drawable.clear_cell);
            cell7.setEnabled(true);
            cell8.setImageResource(R.drawable.clear_cell);
            cell8.setEnabled(true);
            cell9.setImageResource(R.drawable.clear_cell);
            cell9.setEnabled(true);

            random_cell = random_cell_mine();

    }
    public void RId(int random_cell){
        switch (random_cell){
            case 1:
                cell1.setImageResource(R.drawable.image_mine);
                break;
            case 2:
                cell2.setImageResource(R.drawable.image_mine);
                break;
            case 3:
                cell3.setImageResource(R.drawable.image_mine);
                break;
            case 4:
                cell4.setImageResource(R.drawable.image_mine);
                break;
            case 5:
                cell5.setImageResource(R.drawable.image_mine);
                break;
            case 6:
                cell6.setImageResource(R.drawable.image_mine);
                break;
            case 7:
                cell7.setImageResource(R.drawable.image_mine);
                break;
            case 8:
                cell8.setImageResource(R.drawable.image_mine);
                break;
            case 9:
                cell9.setImageResource(R.drawable.image_mine);
                break;
        }
    }
    public void cheak_mine(int id,ImageButton imageButton){
        if (id != random_cell){
           imageButton.setImageResource(R.drawable.image_no_mine);
           RId(random_cell);
           blockCell();
            Snackbar snackbar = Snackbar.make(getWindow().getDecorView().getRootView(), "Ты проиграл", Snackbar.LENGTH_SHORT);
            snackbar.show();
        }else{
            imageButton.setImageResource(R.drawable.image_mine);
            blockCell();
            Snackbar snackbar = Snackbar.make(getWindow().getDecorView().getRootView(), "Ты победил", Snackbar.LENGTH_SHORT);
            snackbar.show();
        }
    }

}
