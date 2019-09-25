package com.chantika.myintentapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnMoveActivity;
    Button btnMoveActivityWithData;
    Button btnDial;
    Button btnWebsite;
    Button btnIntent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnMoveActivity = findViewById(R.id.btn_move_activity);
        btnMoveActivity.setOnClickListener(this);

        btnMoveActivityWithData = findViewById(R.id.btn_move_data);
        btnMoveActivityWithData.setOnClickListener(this);

        btnDial = findViewById(R.id.btn_dial);
        btnDial.setOnClickListener(this);

        btnWebsite = findViewById(R.id.btn_website);
        btnWebsite.setOnClickListener(this);

        btnIntent = findViewById(R.id.btn_bljr);
        btnIntent.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.btn_move_activity:
                Intent moveIntent = new Intent(MainActivity.this, NewActivity.class);
                startActivity(moveIntent);
                break;
            case R.id.btn_move_data:
                Intent moveData = new Intent(MainActivity.this, MoveActivityWithData.class);
                moveData.putExtra(MoveActivityWithData.EXTRA_NAME, "Chantika Dian Saputri");
                moveData.putExtra(MoveActivityWithData.EXTRA_AGE, 19);
                startActivity(moveData);
                break;
            case R.id.btn_dial:
                String phoneNumber = "085600540078";
                Intent dialPhone = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:"+phoneNumber));
                startActivity(dialPhone);
                break;
            case R.id.btn_website:
                Intent webPolines = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.polines.ac.id"));
                startActivity(webPolines);
                break;
            case R.id.btn_bljr:
                Intent intent = new Intent(MainActivity.this, HalamanActivity1.class);
                startActivity(intent);
        }
    }
}
