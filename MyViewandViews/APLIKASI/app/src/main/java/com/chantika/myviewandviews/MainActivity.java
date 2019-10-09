package com.chantika.myviewandviews;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
Button BtnDonasi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if(getSupportActionBar() !=null);
        getSupportActionBar().setTitle("Donasi Pesawat R80");

        BtnDonasi=findViewById(R.id.BtnDonasi);
        BtnDonasi.setOnClickListener(this);
    }

    @Override
    public void onClick(View v){
        switch(v.getId()){
            case R.id.BtnDonasi:
                Intent donasi = new Intent(MainActivity.this, Activity2.class);
                startActivity(donasi);
                break;
        }
    }
}
