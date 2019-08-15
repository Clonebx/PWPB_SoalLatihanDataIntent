package com.example.pwpb_soallatihandataintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton gofood = findViewById(R.id.btn_gofood_main);
        gofood.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_gofood_main:
                btnGofoodEvent();
                break;
        }
    }

    public void btnGofoodEvent(){
        Intent intent = new Intent(MainActivity.this, OrderFoodActivity.class);
        startActivity(intent);
    }
}
