package com.arjun.user.assg10;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Intent in=new Intent(this,activity2.class);
        Button btn=(Button)findViewById(R.id.button);
        final EditText et=(EditText)findViewById(R.id.editText);

        btn.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
           String name=et.getText().toString();
                in.putExtra("nme",name);
                startActivity(in);
            }
        });
    }
}
