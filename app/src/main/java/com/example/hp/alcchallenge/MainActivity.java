package com.example.hp.alcchallenge;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btn_profile, btn_about;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("ALC 4 Phase1");
        setContentView(R.layout.activity_main);


        btn_about=(Button)findViewById(R.id.btn_main_aboutalc);
        btn_about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),AboutALC.class);
                startActivity(i);
            }
        });
        btn_profile= (Button)findViewById(R.id.btn_main_profile);
        btn_profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent m = new Intent(getApplicationContext(),Profile.class);
                startActivity(m);
            }
        });

    }
}
