package com.joydeepbhandary.vahaninforeminder;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnvehlist;
        btnvehlist=findViewById(R.id.btnvehlist);
        btnvehlist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            Intent maintovehlist;
            maintovehlist=new Intent(MainActivity.this,vehlist2.class);

            startActivity(maintovehlist);
            }
        });


    }
}
