package com.xnor.practicalexam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity<CurrentActivity> extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button b1 = (Button) findViewById(R.id.mini);
        Button b2 = (Button) findViewById(R.id.mainframe);
        Button b3 = (Button) findViewById(R.id.supercom);
        b1.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View v ) {
                Intent launchActivity2 = new Intent(MainActivity.this, Main2Activity.class);
                startActivity(launchActivity2);

            }
        });
        b2.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View v ) {
                Intent launchActivity2 = new Intent(MainActivity.this, Main3Activity.class);
                startActivity(launchActivity2);

            }
        });
        b3.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View v ) {
                Intent launchActivity2 = new Intent(MainActivity.this, Main4Activity.class);
                startActivity(launchActivity2);

            }
        });
    }

}
