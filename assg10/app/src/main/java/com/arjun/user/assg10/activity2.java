package com.arjun.user.assg10;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity2);
        TextView tv=(TextView)findViewById(R.id.txt);
        Intent i=getIntent();
        tv.setText(i.getStringExtra("nme").toString());
    }
}
